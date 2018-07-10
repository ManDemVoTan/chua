
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

    public void GhiObject(String content, String path) {
        try {
            ObjectOutputStream oos = null;
            Post main = new Post();
            oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(content);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileHelp1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileHelp1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String DocObject(String path) {
        String result = "";
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)));
            Object obj = ois.readObject();
            Post main = (Post) obj;
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
        return result;
    }
}
