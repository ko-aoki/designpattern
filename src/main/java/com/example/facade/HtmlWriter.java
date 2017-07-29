package com.example.facade;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by ko-aoki on 2017/07/23.
 */
public class HtmlWriter {

    private BufferedWriter bw;

    public HtmlWriter(String fileName) {

        try {
            this.bw = Files.newBufferedWriter(Paths.get(fileName + ".html"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void title(String title) {
        try {
            bw.write("<html><head><meta charset=\'UTF-8\'><title>" + title + "</title></head><body>");
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void paragraph(String str) {
        try {
            bw.write("<p>" + str + "</p>");
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void link(String href, String caption) {

        this.paragraph("<a href='" + href + "'>" + caption + "</a>");
    }

    public void mailto(String address, String username) {

        this.link("mailto:" + address, username);
    }

    public void close() {

        try {
            bw.write("</body></html>");
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
