package com.automation.utils;

import com.microsoft.playwright.Page;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static Properties prop;
    static Page page;

    public static void initConfig() {
        prop = new Properties();
        try {
            prop.load(new FileInputStream("src/test/resources/config/config.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getConfigValue(String key) {
        return prop.getProperty(key);
    }

}
