
import java.util.List;


public class demo {
    private String phuong = "Phuong";
    private String linh = "linh";
    private String dung = "dung";
    private String hoang = "hoang";
    private static final String PATH = "data.txt";

    public static void main(String[] args) {


        
        String str = FileHelper.readFromFile(PATH);
        System.out.println("data: " + str);
        List<String> pieces = StringHelper.splitBySpaces(str);
        for (String s : pieces) {
            System.out.println("piece: " + s);
        }
    }

    private void writeDefaultFile() {
        String content = "Hello World Hello World Hello World Hello World";
        content = content.trim();
        content = content.replaceAll("\\s+", ",");
        FileHelper.writeToFile(PATH, content);
    }
}
