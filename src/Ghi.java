
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anh Tuan
 */
public class Ghi {
    public static void main(String[] args) throws IOException {
        File file = new File("test.text");
        if(!file.exists()){
            file.createNewFile();
        }
        FileInputStream fileinputstream = new FileInputStream(file);
        int c = fileinputstream.read();
        while(c!=1){
            System.out.println((char) c);
            c=fileinputstream.read();
        }
        fileinputstream.close();
        
        
        
        FileOutputStream fileoutputstream =new FileOutputStream(file);
        String s = "ahhihi";
        fileoutputstream.write(s.getBytes());
        fileoutputstream.close();
        
    }
   
}
    

