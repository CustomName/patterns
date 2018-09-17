package me.learn.pattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public final class PropertyRetriver {

    private static PropertyRetriver propertyRetriver;
    private static Properties properties;

    private PropertyRetriver(){
        properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/patterns.property");
            properties.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static PropertyRetriver getInstance(){
        if(propertyRetriver == null)
            propertyRetriver = new PropertyRetriver();
        return propertyRetriver;
    }

    public String getProperty(String key){
        return properties.getProperty(key);
    }

}
