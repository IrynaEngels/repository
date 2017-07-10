package com.example.java.lists;

/**
 * Created by java on 10.07.2017.
 */

public class Element {
    int value;
    Element nextElement;

    Element(){
        value = 0;
    }

    Element(int value){
        this.value = value;

    }

    public Element getNextElement() {
        return nextElement;
    }

    public void setNextElement(Element nextElement) {
        this.nextElement = nextElement;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
