package com.automation.utils;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DriverManager {
    static Playwright playwright;
    static Page page;

    public static void createDriver(){
        playwright=Playwright.create();

        Browser context=playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false));
        page=context.newPage();
    }
    public static Page getPage(){
        return page;
    }
    public static void quit(){
        playwright.close();
    }
}
