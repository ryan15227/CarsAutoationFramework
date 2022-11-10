package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    // 1 - Create properties object
    // we make this private to be accessible from outside
    // make static because static runs first and before everything else
    // and we will use this object under static method
    private static Properties properties = new Properties();

    static {
        // Create FileInputStream object to open file as a stream in Java memory
        try {
            FileInputStream file = new FileInputStream("configuration.properties");
            // Load "properties" object with the "file" we opened using FileInputStream
            properties.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println("Error occurred while reading configuration file");
            e.printStackTrace();
        }

    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
