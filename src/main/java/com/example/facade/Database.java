package com.example.facade;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * Created by ko-aoki on 2017/07/23.
 */
public class Database {

    private Database() {

    }

    public static Properties getProperties(String dbName) {

        String fileName = System.getProperty("user.dir") + "/" + "files/" + dbName + ".txt";
        Properties properties = new Properties();

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))) {
            properties.load(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
    }
}
