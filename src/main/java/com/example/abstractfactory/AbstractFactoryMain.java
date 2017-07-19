package com.example.abstractfactory;


import com.example.abstractfactory.factory.Factory;
import com.example.abstractfactory.factory.Link;
import com.example.abstractfactory.factory.Page;
import com.example.abstractfactory.factory.Tray;

/**
 * Created by ko-aoki on 2017/07/02.
 */
public class AbstractFactoryMain {

    public static void main(String[] args) {

        String factoryName = "com.example.abstractfactory.listfactory.ListFactory";
        Factory factory = Factory.getFactory(factoryName);

        Link aLink = factory.createLink("A新聞", "http://a.com/");
        Link bLink = factory.createLink("B新聞", "http://b.com/");

        Tray trayNews = factory.createTray("新聞");

        trayNews.add(aLink);
        trayNews.add(bLink);

        Link excite = factory.createLink("Excite", "http://excite.com/");
        Link google = factory.createLink("google", "http://google.com/");

        Tray traySearchEngine = factory.createTray("サーチエンジン");

        traySearchEngine.add(excite);
        traySearchEngine.add(google);

        Page page = factory.createPage("LinkPage", "ほげ");
        page.add(trayNews);
        page.add(traySearchEngine);

        page.output();

    }

}
