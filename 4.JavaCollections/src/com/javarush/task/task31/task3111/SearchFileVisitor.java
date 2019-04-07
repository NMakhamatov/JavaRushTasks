package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {
    private String partOfName;
    private String partOfContent;
    private int minSize;
    private int maxSize;
    private List<Path> foundFiles = new ArrayList<>();
    private boolean partOfNameFlag;
    private boolean partOfContentFlag;
    private boolean minSizeFlag;
    private boolean maxSizeFlag;

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file); // размер файла: content.length
        String text = new String(content);

        foundFiles.add(file);
        if (partOfNameFlag && !file.getFileName().toString().contains(partOfName)) foundFiles.remove(file);
        else if (partOfContentFlag && !text.contains(partOfContent)) foundFiles.remove(file);
        else if (minSizeFlag && content.length<minSize) foundFiles.remove(file);
        else if (maxSizeFlag && content.length>maxSize) foundFiles.remove(file);

        return super.visitFile(file, attrs);
    }

    public void setPartOfName(String partOfName) {
        this.partOfNameFlag = true;
        this.partOfName = partOfName;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContentFlag = true;
        this.partOfContent = partOfContent;
    }

    public void setMinSize(int minSize) {
        this.minSizeFlag = true;
        this.minSize = minSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSizeFlag = true;
        this.maxSize = maxSize;
    }

    public List<Path> getFoundFiles() {
        return foundFiles;
    }
}
