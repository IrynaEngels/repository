package com.example.kapusta.linked;

/**
 * Created by Kapusta on 06.07.2017.
 */

public interface ListInterface {
    public void add(int number);
    public void addToIndex(int number, int index);
    public void addAll(int[] arr);
    public void delete(int index);
    public int getElementByIndex(int index);
    public int length();
    public void sort();
    public void print();

}
