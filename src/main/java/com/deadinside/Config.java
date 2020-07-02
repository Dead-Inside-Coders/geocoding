package com.deadinside;

import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class Config {

    private static final String CONFIG_PATH = "static.properties";

    private static Properties property;
    private static String apiKey;
    private static String hostPath;
    private static String servicePath;

    public static void initProperties() throws IOException {
        property = new Properties();
        property.load(Objects.requireNonNull(Config.class.getClassLoader().getResourceAsStream(CONFIG_PATH)));

        apiKey = property.getProperty("apikey");
        hostPath = property.getProperty("hostpath");
        servicePath = property.getProperty("servicepath");
    }

    public static String getApiKey() {
        return apiKey;
    }

    public static String getHostPath() {
        return hostPath;
    }

    public static String getServicePath() {
        return servicePath;
    }
}
