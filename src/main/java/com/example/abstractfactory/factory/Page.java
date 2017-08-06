package com.example.abstractfactory.factory;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ko-aoki on 2017/07/02.
 */
public abstract class Page {

    protected String title;
    protected String auther;
    protected List<Item> contentList = new ArrayList<>();

    public Page(String title, String auther) {
        this.title = title;
        this.auther = auther;
    }

    public void add(Item item) {
        this.contentList.add(item);
    }

    public void output() {
        final String filename = this.title + ".html";
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Paths.get("files/" + filename))){

            bufferedWriter.write(this.makeHtml());
            System.out.println(filename + "を作成しました");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHtml();
}
