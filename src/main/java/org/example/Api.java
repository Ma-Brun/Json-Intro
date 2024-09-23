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

import static com.google.common.base.Ascii.equalsIgnoreCase;
import static org.example.cli.*;


public class Api {
    public static void ApiPull() throws InterruptedException, IOException {
        cli.apiInput();
        if (cli.yesno()) {
            cli.confirmation();
            while (true) {
                ApiRequest.ApiRequest(Input1());
            }
        } else if (!cli.yesno()) {
            System.out.println("Would you like to exit the code or enter a new api link: EXIT or API");
            Scanner scanner2 = new Scanner(System.in);
            String exit = scanner2.nextLine();
            if (exit.equalsIgnoreCase("exit")) {
                System.exit(0);
            }
            else if (exit.equalsIgnoreCase("api")){
                ApiPull();
            }
            else {
                System.out.println("Exiting with invalid input");
                System.exit(0);
            }
        } else {
            ApiPull();
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

