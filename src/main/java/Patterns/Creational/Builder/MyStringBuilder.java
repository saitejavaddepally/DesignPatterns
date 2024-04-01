package Patterns.Creational.Builder;

public class MyStringBuilder {
    private char[] value;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    public MyStringBuilder() {
        value = new char[DEFAULT_CAPACITY];
        size = 0;
    }

    public MyStringBuilder(int capacity) {
        value = new char[capacity];
        size = 0;
    }

    public MyStringBuilder append(String str) {
        ensureCapacity(size + str.length());
        for (int i = 0; i < str.length(); i++) {
            value[size++] = str.charAt(i);
        }
        return this;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > value.length) {
            int newCapacity = Math.max(value.length * 2, minCapacity);
            char[] newValue = new char[newCapacity];
            System.arraycopy(value, 0, newValue, 0, size);
            value = newValue;
        }
    }

    @Override
    public String toString() {
        return new String(value, 0, size);
    }

    public int length() {
        return size;
    }

    public void setCharAt(int index, char c) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        value[index] = c;
    }
}
