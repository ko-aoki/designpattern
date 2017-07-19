package com.example.abstractfactory.listfactory;

import com.example.abstractfactory.factory.Page;

/**
 * Created by ko-aoki on 2017/07/02.
 */
public class ListPage extends Page {

    public ListPage(String title, String auther) {
        super(title, auther);
    }

    @Override
    public String makeHtml() {
        StringBuilder html = new StringBuilder();
        html.append("<html><head><meta charset=\'UTF-8\'><title>" + title + "</title></head><body>");
        html.append(System.lineSeparator());
        html.append("<h1>" + title + "</h1>");

        html.append("<ul>");
        html.append(System.lineSeparator());
        this.contentList.stream().forEach(content -> html.append(content.makeHtml()));
        html.append("</ul>");

        html.append("<hr><address>" + this.auther + "</address></hr>");
        html.append(System.lineSeparator());
        html.append("</body></html>");

        return html.toString();
    }
}
