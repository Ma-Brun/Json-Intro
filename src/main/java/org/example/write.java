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

public class write {
    public static void jsonWriter(String z) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        JsonElement je = JsonParser.parseString(z);
        String pretty = gson.toJson(je);
        try {
            FileWriter file = new FileWriter("src/main/java/org/example/UserSimple.json");
            file.write("{\"pokemon\" : \"name\"," +
                    "\"pokemon_abilities\" : " +
                    pretty + "}");
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Json file created");
    }
}
