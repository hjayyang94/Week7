package exercise19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class tf19 {
    public static void main(String[] args){
        ClassLoader classLoader = tf19.class.getClassLoader();
        Properties prop = new Properties();
        String fileName = "config.ini";
        InputStream is = null;
        try {
            is = new FileInputStream(fileName);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        try {
            prop.load(is);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println(prop.getProperty("words"));

            
    }
    
}