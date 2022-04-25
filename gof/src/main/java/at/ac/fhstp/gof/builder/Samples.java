package at.ac.fhstp.gof.builder;

public class Samples {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Temp");
        String data = builder.append(1).append(true).append("friend").toString();
        System.out.println(data);
    }
}
