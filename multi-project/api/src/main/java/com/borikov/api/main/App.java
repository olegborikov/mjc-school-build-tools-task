package com.borikov.api.main;

import com.borikov.core.util.Utils;

public class App {
    public static void main(String[] args) {
        boolean result = Utils.isAllPositiveNumbers("12", "79");
        System.out.println(result);
    }
}
