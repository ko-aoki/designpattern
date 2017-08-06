package com.example.flyweight;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

/**
 * Created by ko-aoki on 2017/08/01.
 */
public class BigChar {

    private char charName;
    private String fontData;

    public BigChar(char charName) {
        this.charName = charName;
        try (BufferedReader bufferedReader = Files.newBufferedReader(Paths.get("files/" + "big" + charName + ".txt"))) {

            this.fontData = bufferedReader.lines().collect(Collectors.joining(System.lineSeparator()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        System.out.println(this.fontData);
    }
}
