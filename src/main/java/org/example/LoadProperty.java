package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty {

    static Properties prop = new Properties();
    static FileInputStream input;
    static String propertiesFilesLocation = "src/test/java/TestConfig/TestData.Properties";

    public String getProperty(String key) {
        try {
            input = new FileInputStream(propertiesFilesLocation);
            prop.load(input);
            input.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
