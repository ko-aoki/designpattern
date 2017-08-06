package com.example.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by ko-aoki on 2017/08/06.
 */
public class InterpreterMain {

    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("files/" + "program.txt"))) {

            reader.lines().forEach(t -> {
                        System.out.println("text =\"" + t + "\"");
                        Node node = new ProgramNode();
                        try {
                            node.parse(new Context(t));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        System.out.println("node = " + node);
                    }
            );

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
