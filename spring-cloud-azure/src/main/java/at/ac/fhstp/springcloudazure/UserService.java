package at.ac.fhstp.springcloudazure;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void deleteAll() {
        userRepository.deleteAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public Optional<User> findById(String id) {
        return userRepository.findById(id);
    }

    public User findByFirstName(String firstName) {
        return userRepository.findByFirstName(firstName);
    }
}
