public class Main {
    public static void main(String[] args) {
        String path = "data.txt";
        String content = "Hello World Hello World Hello World Hello World";
        FileHelper.writeToFile(path, content);
        String data = FileHelper.readFromFile(path);
        System.out.println("data: " + data);
    }
}
