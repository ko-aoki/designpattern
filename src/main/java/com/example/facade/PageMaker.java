package com.example.facade;

import java.util.Properties;

/**
 * Created by ko-aoki on 2017/07/23.
 */
public class PageMaker {

    private PageMaker() {}

    public static void makeWelcomePage(String address, String fileName) {
        Properties prop = Database.getProperties("maildata");
        String username = prop.getProperty(address);
        HtmlWriter writer = new HtmlWriter("facade");
        writer.title(username + "'s page");
        writer.paragraph(username + "のページへようこそ");
        writer.paragraph("メール待っていますね");
        writer.mailto(address, username);
        writer.close();
        System.out.println(fileName + " is created for " + address + "(" + username + ")");
    }
}
