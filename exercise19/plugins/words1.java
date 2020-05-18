package exercise19.plugins;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class words1 {
    public List<String> extractWords(String path_to_file){
        List<String> wordsL;
        try{
            
            String data = "";
            BufferedReader reader = new BufferedReader(new FileReader(path_to_file));
            String line;
            while((line = reader.readLine()) != null){
                data = data.concat(line+" ");
            }
            wordsL = new ArrayList<>(Arrays.asList(data.trim().split("[^A-Za-z]")));
            wordsL.replaceAll(String::toLowerCase);
            return wordsL;
            
        }
        catch(Exception e){
            System.out.println("Could not load file path");
            return new ArrayList<String>();
        }
        
    }
}