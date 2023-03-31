package com.knoldus.Java;

public class Storage {

    int[] array;
    //capacity is to define the storage size
    public void capacity(int sizeOfArray) {
        array = new int[sizeOfArray];
    }

    //method is used to add in array
    public void addInArray(int element) {
        loopOfAddInArray(0, element);
    }
    public void loopOfAddInArray(int index, int element) {
        if (index == array.length) {
            System.out.println("Array is full");
            return;
        }
        if (array[index] == 0) {
            array[index] = element;
            return;
        }
        loopOfAddInArray(index + 1, element);
    }

    //method to remove an element
    public void removeAnElementInArray(int element) {
        loopToRemoveAnElement(0, element);
    }
    public void loopToRemoveAnElement(int index, int element) {
        if (index == array.length) {
            System.out.println("Element is not found");
            return;
        }
        if (array[index] == element) {
            array[index] = 0;
            return;
        }
        loopToRemoveAnElement(index + 1, element);
    }

    //removeAll Elements from array
    public void removeAll() {
        loopToRemoveAllElement(0);
    }
    public void loopToRemoveAllElement(int index) {
        if (index == array.length) {
            return;
        }
        if (array[index] != 0) {
            array[index] = 0;
        }
        loopToRemoveAllElement(index + 1);
    }

    //method to check that the particular element is present in array or not
    public void containsInArray(int element) {
        loopForContainsInArray(0, element);
    }
    public void loopForContainsInArray(int i, int element) {
        if (i == array.length) {
            System.out.println("Element is not found");
            return;
        }
        if (array[i] == element) {
            System.out.println("Element is found at index " + i);
            return;
        }
        loopForContainsInArray(i + 1, element);
    }

    //method to display elements of array
    public void displayArray() {
        loopToDisplay(0, array);
    }
    public void loopToDisplay(int i, int[] array) {
        if (i == array.length) return;
        System.out.println(array[i]);
        loopToDisplay(i + 1, array);
    }

}
