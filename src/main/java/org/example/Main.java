package org.example;

public class Main {
    public static void main(String[] args) {
        Boolean[] isEmpty = {true,true,true,true,null};
        int result = countSheeps(isEmpty);
        System.out.println(result);
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] == null) {
                continue;
            }
            if (arrayOfSheeps[i] == true) {
                counter++;
            }
        }
        return counter;
    }
}