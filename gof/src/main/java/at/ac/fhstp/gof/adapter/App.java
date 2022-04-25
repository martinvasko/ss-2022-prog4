package at.ac.fhstp.gof.adapter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter String");
        try {
            String s = br.readLine();
            System.out.print("Enter input: " + s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

