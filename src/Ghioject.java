
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
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
public class Ghioject {

    public static void main(String[] args) throws IOException {
        ObjectOutputStream ooss = null;
        try {
            Post main = new Post();
            Post p1 = new Post();
            p1.setId(1);
            p1.setPostId("1");
            p1.setName("thor");
            p1.setAction("post");
            p1.setContent("Hello everyone");
            Post p2 = new Post();
            p2.setId(6);
            p2.setPostId("1");
            p2.setName("thor");
            p2.setAction("like");
            Post p3 = new Post();
            p3.setId(7);
            p3.setPostId("1");
            p3.setName("Zera8");
            p3.setAction("comment");
            p3.setContent("This is content");
            Post p4 = new Post();
            p4.setId(6);
            p4.setPostId("1");
            p4.setName("thor");
            p4.setAction("like");
            Post p5 = new Post();
            p5.setId(9);
            p5.setPostId("1");
            p5.setName("Linh");
            p5.setAction("comment");
            p5.setContent("Hi");
            Post p6 = new Post();
            p6.setId(10);
            p6.setPostId("2");
            p6.setName("Linh");
            p6.setAction("post");
            p6.setContent("Post second");
            Post p7 = new Post();
            p7.setId(12);
            p7.setPostId("2");
            p7.setName("Linh");
            p7.setAction("comment");
            p7.setContent("Hi");
            List<Post> posts = new ArrayList<>();
            posts.add(p1);
            posts.add(p2);
            posts.add(p3);
            posts.add(p4);
            posts.add(p5);
            posts.add(p6);
            posts.add(p7);
            ooss = new ObjectOutputStream(new FileOutputStream("demo4.dat"));
            ooss.writeObject(main);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ghioject.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                ooss.close();
            } catch (IOException ex) {
                Logger.getLogger(Ghioject.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
