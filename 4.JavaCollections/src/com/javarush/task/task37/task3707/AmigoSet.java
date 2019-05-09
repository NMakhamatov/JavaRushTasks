package com.javarush.task.task37.task3707;

import java.io.*;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

//done
public class AmigoSet<E> extends AbstractSet<E> implements Serializable, Cloneable, Set<E> {
    private static final Object PRESENT = new Object();
    private transient HashMap<E, Object> map;

    public AmigoSet() {
        map = new HashMap<>();
    }

    public AmigoSet(Collection<? extends E> collection) {
        int capacity = Math.max(16, (int) (collection.size() / .75f) + 1);

        map = new HashMap<>(capacity);
        this.addAll(collection);
    }

    @Override
    public boolean add(E e) {
        if (map.containsKey(e)) return false;
        else {
            map.put(e, PRESENT);
            return true;
        }


    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o) == PRESENT;
    }

    @Override
    public Object clone() throws InternalError {
        try {
            AmigoSet<E> newSet = (AmigoSet<E>) super.clone();
            newSet.map = (HashMap<E, Object>) map.clone();
            return newSet;
        } catch (Exception e) {
            throw new InternalError(e);
        }
    }

    @Override
    public Spliterator<E> spliterator() {
        return null;
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        return false;
    }

    @Override
    public Stream<E> stream() {
        return null;
    }

    @Override
    public Stream<E> parallelStream() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super E> action) {

    }

    private void writeObject(ObjectOutputStream outputStream) throws IOException {
        int capacity = HashMapReflectionHelper.callHiddenMethod(map, "capacity");
        Float loadFactor = HashMapReflectionHelper.callHiddenMethod(map, "loadFactor");

        outputStream.defaultWriteObject();
        outputStream.write(capacity);
        outputStream.writeFloat(loadFactor);
        outputStream.writeInt(map.size());
        for (Object o : map.keySet() ) {
            outputStream.writeObject(o);
        }
    }

    private void readObject(ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
        inputStream.defaultReadObject();
        int capacity = inputStream.read();
        Float loadFactor = inputStream.readFloat();


//        System.out.println("capacity = " + capacity);
//        System.out.println("loadFactor = " + loadFactor);
//        System.out.println("map: " + this.map);
        this.map = new HashMap<>(capacity, loadFactor);
//        System.out.println("map: " + this.map);

        int length = inputStream.readInt();
        for (int i = 0; i < length; i++) {
            map.put((E)inputStream.readObject(), PRESENT);
        }
    }

    public static void main(String[] args) throws Exception {
        List<String> list = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen");
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Nursultan\\Desktop\\Java\\IO\\in.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        AmigoSet amigoSet = new AmigoSet(list);
        outputStream.writeObject(amigoSet);
        outputStream.close();

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Nursultan\\Desktop\\Java\\IO\\in.txt");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        AmigoSet newAmigoSet = (AmigoSet) inputStream.readObject();
        inputStream.close();

        System.out.println("size: " + amigoSet.size());
        System.out.println("size: " + newAmigoSet.size());
        System.out.println(new HashMap<>(5).size());
    }
}
