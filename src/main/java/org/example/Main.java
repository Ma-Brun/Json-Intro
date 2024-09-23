package org.example;
import com.google.gson.Gson;

import javax.swing.*;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Json.Json();
//        serializedUserSimple();
//        deseralizedUserSimple();
    }
}




























//    private static void serializedUserSimple() {
//        Json user = new Json(
//                "Cyrus",
//                "cyrus.brun2008@gmail.com",
//                16,
//                true
//        );
//        Gson gson = new Gson();
//        String json = gson.toJson(user);
//        System.out.println(json);
//    }
//
//    private static void deseralizedUserSimple() {
//        String userJson = "{\"name\":\"Cyrus\",\"email\":\"cyrus.brun2008@gmail.com\",\"age\":16,\"isDev\":true}";
//
//        Gson gson = new Gson();
//        Json json = gson.fromJson(userJson, Json.class);
//        System.out.println(json);
//    }
//
//}
