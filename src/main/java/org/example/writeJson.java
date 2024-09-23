package org.example;
import com.google.gson.*;
import com.google.gson.stream.JsonWriter;
import java.util.concurrent.TimeUnit;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;


public class writeJson {
    public static void prettyPrint(String x) throws InterruptedException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        JsonElement je = JsonParser.parseString(x);
        String pretty = gson.toJson(je);
        System.out.println("Would you like to print the json information?");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        if (n.equalsIgnoreCase("yes")) {
            System.out.println(pretty);
        }
        else if (n.equalsIgnoreCase("no")) {
            System.out.println("All right");
        }
        else {
            System.out.println("Invalid input, not printing");
        }
    }
}

