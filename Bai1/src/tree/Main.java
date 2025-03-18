package tree;

public class Main {
    public static void main(String[] args) {
        // Tạo một số tập tin
        File file1 = new File("Document.txt", "Hello World");
        File file2 = new File("Image.png", "Binary Data");

        // Tạo thư mục con
        Directory subDir = new Directory("SubFolder");
        subDir.addItem(new File("Notes.txt", "Meeting at 10 AM"));

        // Tạo thư mục gốc
        Directory root = new Directory("Root");
        root.addItem(file1);
        root.addItem(file2);
        root.addItem(subDir);

        // Hiển thị cấu trúc cây
        root.showInfo();
    }
}
