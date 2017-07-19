package com.example.abstractfactory.listfactory;


import com.example.abstractfactory.factory.Tray;

/**
 * Created by ko-aoki on 2017/07/02.
 */
public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuilder html = new StringBuilder();

        html.append("<ul>");
        html.append(System.lineSeparator());
        html.append(this.caption);
//        html.append("<ul>");
        html.append(System.lineSeparator());

        this.trayList.stream().forEach(
                tray -> html.append(tray.makeHtml())
        );

//        html.append("</ul>");
//        html.append(System.lineSeparator());
        html.append("</ul>");
        html.append(System.lineSeparator());

        return html.toString();
    }
}
