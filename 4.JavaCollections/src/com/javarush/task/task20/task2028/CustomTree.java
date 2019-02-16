package com.javarush.task.task20.task2028;

import java.io.Serializable;
import java.util.*;

/* 
Построй дерево(1)
*/
//done
public class CustomTree extends AbstractList<String> implements Cloneable, Serializable {
    Entry<String> root;

    public CustomTree() {
        this.root = new Entry<>("root");
    }

    @Override
    public boolean add(String s) {
        Queue<Entry<String>> queue = new LinkedList<>();
        ((LinkedList<Entry<String>>) queue).push(root);
        while (!queue.isEmpty()) {
            Entry<String> entry = queue.poll();
            if (!entry.isAvailableToAddChildren()) {
                ((LinkedList<Entry<String>>) queue).offer(entry.leftChild);
                ((LinkedList<Entry<String>>) queue).offer(entry.rightChild);
            } else if (entry.availableToAddLeftChildren) {
                entry.leftChild = new Entry<>(s);
                entry.checkChildren();
                return true;
            } else {
                entry.rightChild = new Entry<>(s);
                entry.checkChildren();
                return true;
            }
        }
        return false;
    }

    public String getParent(String s) {
        String parentName = null;
        Queue<Entry<String>> queue = new LinkedList<>();
        ((LinkedList<Entry<String>>) queue).push(root);

        while (!queue.isEmpty()) {
            Entry<String> entry = queue.poll();
            if (!entry.availableToAddLeftChildren) {
                if (entry.leftChild.elementName.equals(s)) parentName = entry.elementName;
                else ((LinkedList<Entry<String>>) queue).offer(entry.leftChild);
            }
            if (!entry.availableToAddRightChildren) {
                if (entry.rightChild.elementName.equals(s)) parentName = entry.elementName;
                else ((LinkedList<Entry<String>>) queue).offer(entry.rightChild);
            }
        }
        return parentName;
    }

    @Override
    public String get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int size() {
        int size = 0;
        Queue<Entry<String>> queue = new LinkedList<>();
        ((LinkedList<Entry<String>>) queue).push(root);
        while (!queue.isEmpty()) {
            Entry entry = queue.poll();
            if (!entry.isAvailableToAddChildren()) {
                ((LinkedList<Entry<String>>) queue).push(entry.leftChild);
                ((LinkedList<Entry<String>>) queue).push(entry.rightChild);
                size += 2;
            } else {
                if (!entry.availableToAddLeftChildren) {
                    ((LinkedList<Entry<String>>) queue).push(entry.leftChild);
                    size++;
                }
                if (!entry.availableToAddRightChildren) {
                    ((LinkedList<Entry<String>>) queue).push(entry.rightChild);
                    size++;
                }
            }
        }
        return size;
    }

    @Override
    public boolean remove(Object o) {
        if (!(o instanceof String)) throw new UnsupportedOperationException();
        String name = (String) o;
        Queue<Entry<String>> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Entry entry = queue.poll();

            if (!entry.availableToAddLeftChildren) {
                if (entry.leftChild.elementName.equals(name)) {
                    entry.leftChild = null;
                    entry.checkChildren();
                    return true;
                } else {
                    queue.offer(entry.leftChild);
                }
            }
            if (!entry.availableToAddRightChildren) {
                if (entry.rightChild.elementName.equals(name)) {
                    entry.rightChild = null;
                    entry.checkChildren();
                    return true;
                } else queue.offer(entry.rightChild);
            } else {

            }
        }
        return false;
    }

    @Override
    public String set(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, String element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        throw new UnsupportedOperationException();
    }


    static class Entry<T> implements Serializable {
        String elementName;
        int lineNumber;
        boolean availableToAddLeftChildren, availableToAddRightChildren;
        Entry<T> parent, leftChild, rightChild;

        public Entry(String s) {
            elementName = s;
            availableToAddLeftChildren = true;
            availableToAddRightChildren = true;
        }

        void checkChildren() {
            if (leftChild == null) availableToAddLeftChildren = true;
            else availableToAddLeftChildren = false;
            if (rightChild == null) availableToAddRightChildren = true;
            else availableToAddRightChildren = false;
        }

        boolean isAvailableToAddChildren() {
            return availableToAddLeftChildren || availableToAddRightChildren;
        }
    }
}
