package at.ac.fhstp.core8.streams;

import java.nio.file.Files;
import java.nio.file.Paths;

public class UserApp {
    private static String PATH = "src/assets/users.json";

    public static void main(String[] args) {
        try {
            String json = readAsString(PATH);
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String readAsString(String path) throws Exception {
        return new String(Files.readAllBytes(Paths.get(path)));
    }
}
