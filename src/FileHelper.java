
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Anh Tuan
 */
public class FileHelper {

    public static void writeToFile(String path, String content) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(path), "utf-8");
            Writer writer = new BufferedWriter(outputStreamWriter);
            writer.write(content);
            writer.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String readFromFile(String path) {
        StringBuilder builder = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line = bufferedReader.readLine();

            while (line != null) {
                builder.append(line);
                builder.append(System.lineSeparator());
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            return builder.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "";
    }
}
