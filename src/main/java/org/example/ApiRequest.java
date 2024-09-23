package org.example;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ApiRequest {
    public static void ApiRequest(String api) throws InterruptedException, IOException {
        int x = 0;
        while (true) {
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
            String json = response.body();
            if (x == 5) {
                TimeUnit.SECONDS.sleep(1);

                System.out.println("Would you like to continue?");
                Scanner scanner = new Scanner(System.in);
                String maybe = scanner.nextLine();
                if (maybe.equalsIgnoreCase("yes")) {
                    TimeUnit.SECONDS.sleep(1);
                    writeJson.prettyPrint(json);
                    x = 0;
                }
                else {
                    System.out.println("Okay, would you like to write this information to a json file for future access?");
                    String meh = scanner.nextLine();
                        if (meh.equalsIgnoreCase("yes")) {
                            System.out.println("Beginning writing!");
                            write.jsonWriter(json);
                            System.exit(0);
                        }
                        else {
                            System.exit(0);
                        }
                }
            }
            else {
                x++;
                System.out.println("Writing!");
                TimeUnit.SECONDS.sleep(5);
                }
            }
        }
    }
