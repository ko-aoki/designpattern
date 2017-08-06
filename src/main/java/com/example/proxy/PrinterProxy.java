package com.example.proxy;

/**
 * Created by ko-aoki on 2017/08/03.
 */
public class PrinterProxy implements Printable {

    private String name;
    private Printer real;

    public PrinterProxy() {
    }

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public void print(String str) {
        this.realize();
        real.print(str);
    }

    private synchronized void realize() {
        if (this.real == null) {
            this.real = new Printer(this.name);
        }
    }
}
