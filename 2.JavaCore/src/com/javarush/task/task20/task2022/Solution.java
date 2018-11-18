package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
    private transient FileOutputStream stream;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.close();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        in.close();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws Exception {
        String s = "C:\\Users\\Nursultan\\Desktop\\Java\\IO\\in.txt";
        String serial = "C:\\Users\\Nursultan\\Desktop\\Java\\IO\\out.txt";
        Solution solution = new Solution(s);
        solution.writeObject("Hello!");
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(serial));
        solution.writeObject(outputStream);

        Solution newSol = new Solution(s);
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(serial));
        newSol.readObject(inputStream);
        newSol.writeObject("Second Hello!");
    }
}
