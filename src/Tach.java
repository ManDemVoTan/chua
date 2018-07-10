
 
public class Tach {
  private static final String PATH = "data.txt";
    public String chuanHoa(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " , ");
        return str;
    }
 
    public String chuanHoaDanhTuRieng(String str) {
        str = chuanHoa(str);
        String temp[] = str.split(" ");
        str = ""; // ? ^-^
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length ) // ? ^-^
                str += " ";
        }
        return str;
    }
 
    public static void main(String[] sgr) {
        String str = "HEllo word HEllo word HEllo word HEllo word HEllo word HEllo word ";
        Tach chx = new Tach();
        str = chx.chuanHoaDanhTuRieng(str);
        System.out.println(str);
    }
}