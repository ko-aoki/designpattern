package com.example.abstractfactory.listfactory;


import com.example.abstractfactory.factory.Factory;
import com.example.abstractfactory.factory.Link;
import com.example.abstractfactory.factory.Page;
import com.example.abstractfactory.factory.Tray;

/**
 * Created by ko-aoki on 2017/07/02.
 */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String auther) {
        return new ListPage(title, auther);
    }
}
