package com.example.kapusta.linked;

/**
 * Created by Kapusta on 06.07.2017.
 */

public class Test extends LinkedCollection {
    public static void main(String[] args) {
     LinkedCollection collection = new LinkedCollection();

     collection.add(3);
     collection.add(7);
     collection.add(9);
     collection.add(15);
     collection.add(4);

     System.out.println(collection.length());

        System.out.println("ind2 " + collection.getElementByIndex(2));
        System.out.println("ind4 " + collection.getElementByIndex(4));

        collection.addToIndex(71, 2);
        System.out.println("ind2 " + collection.getElementByIndex(2));

//        collection.delete(2);
        collection.print();
        System.out.println("sort");
        collection.sort();
        collection.print();

    }
}
