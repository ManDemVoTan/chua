
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Anh Tuan
 */
public class Doc {
    private List<String> data;

    public Doc() {
        this.data = new ArrayList<String>();
    }

    public void docDuLieu(String duongDan) {
        try {
            FileInputStream file = new FileInputStream(duongDan);
            DataInputStream dataFile = new DataInputStream(file);
            String temp = dataFile.readLine();
            while (temp != null) {
                data.add(temp);
                temp = dataFile.readLine();
            }
            file.close();
        } catch (Exception e) {
// Khi ko doc duoc file muon xuat j ra thi e viet vào day
            e.printStackTrace();
        }
    }

    public List<String> getData() {
        return this.data;
    }

    public void ghiDuLieu(String duongDan, String ten) {
        try {
//Đầu tiên để ghi tiếp được vào file thì fải đọc nội dung file lên trước rồi thêm dữ liệu vào
//sau đó ghi đè file đã được thêm xuống lại ^^
            Doc d = new Doc();
            d.docDuLieu(duongDan);
            data = d.getData();
            data.add(ten);
            ghiXuongFile(duongDan);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ghiXuongFile(String duongDan) {
        try {
            FileOutputStream file = new FileOutputStream(duongDan);
            PrintWriter out = new PrintWriter(file);
            for (int i = 0; i < data.size(); i++) {
//Đọc dữ liệu trong mảng và ghi xuống file, mỗi lần fải flush để đẩy dữ liệu đi
                out.write(data.get(i));
                out.flush();
            }
//Đóng streem lại ^^
            out.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Doc d = new Doc();
        System.out.println(d.data);
    }

    Ghi d = new Ghi();

}
    

