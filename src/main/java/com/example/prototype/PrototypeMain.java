package com.example.prototype;

/**
 * Created by ko-aoki on 2017/06/27.
 */
public class PrototypeMain {

    public static void main(String[] args) {

        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('-');
        MessageBox mBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('/');

        manager.register("under", underlinePen);
        manager.register("strong", mBox);
        manager.register("warning", sBox);

        Product p1 = manager.create("under");
        p1.use("Hello, world");

        Product p2 = manager.create("strong");
        p2.use("Hello, world");

        Product p3 = manager.create("warning");
        p3.use("Hello, world");
    }
}
