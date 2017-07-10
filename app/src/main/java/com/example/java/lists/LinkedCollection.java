package com.example.java.lists;

/**
 * Created by java on 10.07.2017.
 */

public class LinkedCollection implements ListInterface {
    Element element;
    Element next = new Element();

    //simple text


    @Override
    public void add(int number) {
        Element tmp = next;
        Element tmp1 = new Element();
        if (element == null) {
            element = new Element();
            element.setValue(number);
            element.setNextElement(next);
        }
        else {
            while (tmp.getNextElement()!=null) {
                tmp = tmp.getNextElement();
            }
            tmp.setValue(number);
            tmp.setNextElement(tmp1);
        }
    }

    @Override
    public void addToIndex(int number, int index) {
        Element tmp = element;
        for (int i = 1; i < index; i++) {
            tmp = tmp.getNextElement();
        }
        tmp.setValue(number);
    }

    @Override
    public void addAll(int[] arr) {

    }

    @Override
    public void delete(int index) {
        Element tmp = element;
        Element tmp1 = element;
        if (index == 1){
            element = element.getNextElement();
        }
        for (int i = 1; i < index-1; i++) {
            tmp = tmp.getNextElement();
        }
        for (int i = 1; i < index; i++) {
            tmp1 = tmp1.getNextElement();
        }
        tmp.setNextElement(tmp1.getNextElement());


    }

    @Override
    public int getElementByIndex(int index) {
        Element tmp = element;
        for (int i = 1; i < index; i++) {
            tmp = tmp.getNextElement();
        }
        return tmp.getValue();
    }

    @Override
    public int length() {
        int length = 0;
        Element tmp = element;
        while (tmp.getNextElement()!=null){
            tmp = tmp.getNextElement();
            length++;
        }
        return length;
    }

    @Override
    public void sort() {
        Element tmp = element;
        Element[] elements = new Element[length()];
        for (int i = 0; i < length(); i++) {
            elements[i] = tmp;
            tmp = tmp.getNextElement();
        }

        int counter = 0;
        while (counter < length() - 1) {
            counter = 0;
            for (int i = 0; i < length() -1; i++) {
                if (elements[i].getValue() <= elements[i + 1].getValue()) {
                    counter++;
                } else {
                    Element n = elements[i];
                    elements[i] = elements[i + 1];
                    elements[i + 1] = n;
                }
            }
        }
    }

    @Override
    public void print() {
        Element tmp = element;
        while (tmp.getNextElement()!=null){
            System.out.println(tmp.getValue()+ " ");
            tmp = tmp.getNextElement();
        }
    }
}


