package tree;

import java.util.ArrayList;
import java.util.List;

// Composite: Thư mục có thể chứa nhiều FileSystemItem
public class Directory implements FileSystemItem {
    private String name;
    private List<FileSystemItem> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addItem(FileSystemItem item) {
        children.add(item);
    }

    public void removeItem(FileSystemItem item) {
        children.remove(item);
    }

    @Override
    public void showInfo() {
        System.out.println("Directory: " + name);
        for (FileSystemItem item : children) {
            item.showInfo();
        }
    }
}
