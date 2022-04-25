package at.ac.fhstp.gof.factory;

import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;

public class App {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));

        // Real word
        try {
            Connection con = DriverManager.getConnection("mysql");
            
            URL url = new URL("https://www.fhstp.ac.at");
            URLConnection urlConnection = url.openConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
