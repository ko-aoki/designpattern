package com.example.template;

/**
 * Created by ko-aoki on 2017/06/25.
 */
public class TemplateMain {

    public static void main(String[] args) {
        CharDisplay charDisplay = new CharDisplay('A');
        StringDisplay stringDisplay = new StringDisplay("Hello, World!");

        charDisplay.display();
        stringDisplay.display();
    }
}
