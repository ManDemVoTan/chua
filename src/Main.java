public class Main {
    private static final String PATH = "data.txt";
    
    public static void main(String[] args) {
        String data = FileHelper.readFromFile(PATH);
        System.out.println("data: " + data);
    }
    
    private void writeDefaultFile(){
        String content = "Hello World Hello World Hello World Hello World";
        content = content.trim();
        content = content.replaceAll("\\s+",",");
        FileHelper.writeToFile(PATH, content);
    }
}
