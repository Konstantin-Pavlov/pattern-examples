package org.example.patterns.state.trucks.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JsonReader {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    private JsonReader() {
    }

    public static <T> T[] loadJArrayFromJson(String path, Class<T[]> cls) {
        Path PATH = Paths.get(path);
        try {
            String str = Files.readString(PATH);
            return GSON.fromJson(str, cls);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

//    public static Truck[] getTrucks() {
//        Gson GSON = new GsonBuilder().setPrettyPrinting().create();
//        Path PATH = Paths.get("data/trucks.json");
//        try {
//            String str = Files.readString(PATH);
//            return GSON.fromJson(str, Truck[].class);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//            return new Truck[0];
//        }
//    }
//
//    public static Driver[] getDrivers() {
//        Gson GSON = new GsonBuilder().setPrettyPrinting().create();
//        Path PATH = Paths.get("data/drivers.json");
//        try {
//            String str = Files.readString(PATH);
//            return GSON.fromJson(str, Driver[].class);
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//            return new Driver[0];
//        }
//    }

    //  для записи в json файл
/*    public static void writeFile(Truck[] trucks) {
        String json = GSON.toJson(trucks);

        byte[] bytes = json.getBytes();
        try {
            Files.write(PATH, bytes);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }*/

}
