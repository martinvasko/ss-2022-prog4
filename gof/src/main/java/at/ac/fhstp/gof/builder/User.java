package at.ac.fhstp.gof.builder;

public class User {
    // All final attributes
    private final long id;          // required
    private final String firstName; // required
    private final String lastName;  // required
    private final int age;          // optional
    private final String phone;     // optional
    private final String address;   // optional

    public User(long id, String firstName, String lastName, int age, String phone, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    // All getter, and NO setter to provde immutability
    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User: " + this.id + ", " + this.firstName + ", " + this.lastName + ", " + this.age + ", " + this.phone
                + ", " + this.address;
    }

}
