package com.example.proxy;

/**
 * Created by ko-aoki on 2017/08/03.
 */
public interface Printable {

    void setPrinterName(String name);
    String getPrinterName();
    void print(String str);
}
