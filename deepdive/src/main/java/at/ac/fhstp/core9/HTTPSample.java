package at.ac.fhstp.core9;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HTTPSample {
    public static void main(String[] args) {
        try {
            HttpRequest req = HttpRequest
            .newBuilder()
            .uri(new URI("http://dummy.restapiexample.com/api/v1/employees"))        
            .GET()
            .build();

            HttpResponse<String> res = HttpClient
            .newBuilder()
            .build()
            .send(req, BodyHandlers.ofString());

            System.out.println(res.body());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
