package org.example;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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

public class Json {
    public static void Json() throws InterruptedException {
        System.out.println("Enter the api link you would like to use");
        Scanner scanner = new Scanner(System.in);
        String api = scanner.nextLine();
        System.out.println("You would like to use " + api + " correct?");
        String apiGo = scanner.next();
        if (apiGo.equalsIgnoreCase("yes")) {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(api))
                    .method("GET", HttpRequest.BodyPublishers.noBody())
                    .build();
            HttpResponse<String> response = null;

            try {
                response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int x = 0;
            while(true) {
                x = x + 1;
                TimeUnit.SECONDS.sleep(10);
                if (x == 5) {
                    System.out.println("would you like to continue?");
                    x = x - 5;
                    Scanner scanner1 = new Scanner(System.in);
                    String line = scanner1.nextLine();
                    if (line.equalsIgnoreCase("yes")) {
                        System.out.println("Writing is beginning!");
                        try (JsonWriter writer = new JsonWriter(new FileWriter("C:\\Users\\cyrus\\IdeaProjects\\Json-Intro\\src\\main\\java\\org\\example\\UserSimpleGson.json"))) {
                            writer.beginObject();
                            writer.name(response.body());
                            writer.beginArray();
                            writer.endArray();
                            writer.endObject();
                        }
                        catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else if (line.equalsIgnoreCase("no")) {
                        System.out.println("Would you like to use a different api?");
                        Scanner scanner2 = new Scanner(System.in);
                        String line2 = scanner2.nextLine();
                        if (line2.equalsIgnoreCase("yes")) {
                            Json.Json();
                        }
                        else {
                            System.exit(1);
                        }
                    }
                    else {
                       throw null;
                    }
                }
                else {
                    System.out.println("Writing is beginning!");
                    try (JsonWriter writer = new JsonWriter(new FileWriter("C:\\Users\\cyrus\\IdeaProjects\\Json-Intro\\src\\main\\java\\org\\example\\UserSimpleGson.json"))) {
                        writer.beginObject();
                        writer.name(response.body());
                        writer.beginArray();
                        writer.endArray();
                        writer.endObject();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
        else {
            Json();
        }
    }
}

















        //CODE FOR ORIGINAL GSON INTRO
//        private String name;
//private String email;
//private int age;
//private boolean isDev;
//
//public Json(String name, String email, int age, boolean isDev) {
//    this.name = name;
//    this.email = email;
//    this.age = age;
//    this.isDev = isDev;
//}

