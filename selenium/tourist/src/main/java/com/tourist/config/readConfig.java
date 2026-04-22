package com.tourist.config;

import java.io.FileInputStream;
import java.util.Properties;

public class readConfig {
    private static Properties properties;

    static {
        try{
            FileInputStream fis = new FileInputStream("src\\main\\java\\com\\tourist\\config\\config.properties");
            properties = new Properties();
            properties.load(fis);
            fis.close();
        } catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException("Could not load config.properties file!");
        }
    }
    public static String getproperty(String key){
        return properties.getProperty(key);
    }
}
