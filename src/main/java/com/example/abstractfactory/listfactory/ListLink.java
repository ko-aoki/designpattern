package com.example.abstractfactory.listfactory;

import com.example.abstractfactory.factory.Link;

/**
 * Created by ko-aoki on 2017/07/02.
 */
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHtml() {
        return "<li><a href='" + this.url + "'>" + this.caption + "</a></li>";
    }
}
