package at.ac.fhstp.springcloudazure;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.Assert;

@SpringBootApplication
public class SpringCloudAzureApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringCloudAzureApplication.class);

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAzureApplication.class, args);
    }

    public void run(String... var1) {
        this.userService.deleteAll();
        LOGGER.info("Deleted all data in container.");

        final User testUser = new User("testId", "testFirstName", "testLastName", "test address line one");

        // Save the User class to Azure Cosmos DB database.
        final User savedUser = userService.save(testUser);
        
        //  Nothing happens until we subscribe to these Monos.
        //  findById will not return the user as user is not present.
        final Optional<User> findByIdUser = userService.findById(testUser.getId());
        Assert.isTrue(findByIdUser.isPresent(), "User must be null");

        Assert.state(savedUser != null, "Saved user must not be null");
        Assert.state(savedUser.getFirstName().equals(testUser.getFirstName()), "Saved user first name doesn't match");

        final Optional<User> optionalUserResult = userService.findById(testUser.getId());
        Assert.isTrue(optionalUserResult.isPresent(), "Cannot find user.");

        final User result = optionalUserResult.get();
        Assert.state(result.getFirstName().equals(testUser.getFirstName()), "query result firstName doesn't match!");
        Assert.state(result.getLastName().equals(testUser.getLastName()), "query result lastName doesn't match!");

        LOGGER.info("findOne in User collection get result: {}", result.toString());
    }
}
