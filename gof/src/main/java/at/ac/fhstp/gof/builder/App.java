package at.ac.fhstp.gof.builder;

public class App {
    public static void main(String[] args) {
        User user1 = new UserBuilder(0, "Lokesh", "Gupta")
        .age(30)
        .phone("1234567")
        .address("Fake address 1234")
        .build();
     
        System.out.println(user1);
     
        User user2 = new UserBuilder(1, "Jack", "Reacher")
        .age(40)
        .phone("5655")
        //no address
        .build();
     
        System.out.println(user2);
     
        User user3 = new UserBuilder(2, "Super", "Man")
        //No age
        //No phone
        //no address
        .build();
     
        System.out.println(user3);
    }
}
