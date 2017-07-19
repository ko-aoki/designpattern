package com.example.builder;

/**
 * Created by ko-aoki on 2017/07/01.
 */
public class BuilderMain {

    public static void main(String[] args) {

        Builder textBuilder = new TextBuilder();
        Director textDirector = new Director(textBuilder);

        textDirector.construct();
        System.out.println(
                textBuilder.getResult()
        );

        HtmlBuilder htmlBuilder = new HtmlBuilder("TestHtml");
        Director htmlDirector = new Director(htmlBuilder);

        htmlDirector.construct();
        System.out.println(
                htmlBuilder.getResult()
        );

    }
}
