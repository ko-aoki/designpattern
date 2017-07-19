package com.example.builder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ko-aoki on 2017/07/01.
 */
public class HtmlBuilder implements Builder {

    private String fileName;
    private BufferedWriter writer;

    public HtmlBuilder(String title) {
        this.fileName = title + ".html";
        try {
            writer = Files.newBufferedWriter(Paths.get(this.fileName), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void makeTitle(String title) {
        try {
            writer.write("<html><head><meta charset=\'UTF-8\'><title>" + title + "</title></head><body>");
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void makeString(String str) {
        try {
            writer.write("<p>" + str + "</p>");
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void makeItems(List<String> items) {
        try {
            writer.write("<ul>");
            items.stream().forEach(item -> {
                try {
                    writer.write("<li>" + item + "</li>");
                    writer.newLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            writer.write("</ul>");
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() {

        try {
            writer.write("</body></html>");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String getResult() {

        Path path = Paths.get(this.fileName);
        try (BufferedReader reader = Files.newBufferedReader(path)){
            return reader.lines().collect(Collectors.joining());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
