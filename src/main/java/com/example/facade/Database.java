package com.example.facade;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * Created by ko-aoki on 2017/07/23.
 */
public class Database {

    private Database() {

    }

    public static Properties getProperties(String dbName) {

        String fileName = System.getProperty("user.dir") + "/" + dbName + ".txt";
        Properties properties = new Properties();

        try {
            properties.load(Files.newBufferedReader(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return properties;
    }
}
