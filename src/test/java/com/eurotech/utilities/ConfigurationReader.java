package com.eurotech.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {
    private static Properties properties;

    static {
        try {
            //Path of file which is wanted to read
            String path = "configuration.properties";

            //read file into java using String path to fin the file
            FileInputStream input = new FileInputStream(path);

            //properties --> class that can store data(properties)
            properties = new Properties();

            //the values (data) from input is loaded to the properties object
            properties.load(input);
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String get(String keyName){
        return properties.getProperty(keyName);
    }
}
