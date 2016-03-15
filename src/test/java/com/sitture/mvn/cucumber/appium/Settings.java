package com.sitture.mvn.cucumber.appium;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;

public class Settings {
    public static final String applicationUrl;
    public static final String device;

    static {
        // Read properties file.
        Properties properties = new Properties();
        try {
            ClassPathResource res = new ClassPathResource("environment.properties");
            properties.load(res.getInputStream());
            properties.putAll(System.getProperties());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        applicationUrl = properties.getProperty("applicationUrl");
        device = properties.getProperty("device");
    }
}

