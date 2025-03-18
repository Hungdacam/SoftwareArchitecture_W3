package tree;

//Leaf: Lớp tập tin, không chứa thư mục con
public class File implements FileSystemItem {
 private String name;
 private String data;

 public File(String name, String data) {
     this.name = name;
     this.data = data;
 }

 @Override
 public void showInfo() {
     System.out.println("File: " + name + " | Data: " + data);
 }
}
