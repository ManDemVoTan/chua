/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anh Tuan
 */
public class Like {
    private static final String PATH = "data.txt";
    private void writeDefaultFile() {
        String like = "Tym wow haha sad like angry  ";
        like = like.trim();
        like = like.replaceAll("\\s+", ",");
        FileHelper.writeToFile(PATH, like);
    }
    
}
