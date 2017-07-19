package com.example.adapter;

import com.example.adapter.delegation.PrintBanner;

/**
 * Created by ko-aoki on 2017/06/25.
 */
public class AdapterMain {

    public static void main(String[] args) {
        PrintBanner banner = new PrintBanner("あーたろう");
        banner.printStrong();
        banner.printWeak();

    }
}
