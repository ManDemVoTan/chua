
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anh Tuan
 */
public class FileHelp1 { 
    public  void GhiObject(){
        try {
            ObjectOutputStream ooss = null;
            Post main = new Post();
            ooss = new ObjectOutputStream(new FileOutputStream("D:\\project-Chua\\demo4.dat"));
            ooss.writeObject(main);
            } catch (FileNotFoundException ex) {
            Logger.getLogger(FileHelp1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileHelp1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public void DocObject(){
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream("demo4.dat")));
          Object obj=  ois.readObject();
          Post main = (Post)obj;
            System.out.println(main);
          
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DocObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DocObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileHelp1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ois.close();
            } catch (IOException ex) {
                Logger.getLogger(DocObject.class.getName()).log(Level.SEVERE, null, ex);
            }
     }
        
    }
  
    }
