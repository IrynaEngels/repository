package com.example.kapusta.linked;

/**
 * Created by Kapusta on 08.07.2017.
 */

public class Element {
    int value;
    Element nextElement;
    Element prevElement;

    Element(){
        value = 0;
    }

    public Element getPrevElement() {
        return prevElement;
    }

    public void setPrevElement(Element prevElement) {
        this.prevElement = prevElement;
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
