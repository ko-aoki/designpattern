package com.example.proxy;

import java.util.stream.IntStream;

/**
 * Created by ko-aoki on 2017/08/03.
 */
public class Printer implements Printable {

    private String name;

    public Printer(String name) {
        this.name = name;
        this.heavyJob("Printerのインスタンス[" + name + "]を生成中");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public void print(String str) {
        System.out.println("=== " + this.name + " ===");
        System.out.println(str);
    }

    private void heavyJob(String msg) {
        System.out.println(msg);
        for (int i=0; i<5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(".");
        }
        System.out.println("完了");
    }

}
