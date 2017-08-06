package com.example.proxy;

/**
 * Created by ko-aoki on 2017/08/03.
 */
public class PrinterMain {

    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("名前は現在[" + p.getPrinterName() + "]です");
        p.setPrinterName("Bob");
        System.out.println("名前は現在[" + p.getPrinterName() + "]です");
        p.print("Hello,world");
    }
}
