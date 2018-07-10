/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
import java.io.*;

/**
 * @author Anh Tuan
 */
public class FileHelper {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("C:\\tmp\\test.txt"));
            System.out.println("Đọc nội dung file sử dụng phương thức readLine()");
            String textInALine;

            while ((textInALine = br.readLine()) != null) {
                System.out.println(textInALine);
                textInALine = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}