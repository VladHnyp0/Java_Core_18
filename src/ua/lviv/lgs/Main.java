package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main ( String [] args ) {
        List<Integer> list = new ArrayList<>();

        // #1
        AddToList.addToList(list);

        // OR BELOW

        // #2
        String strNum="456";
        int numStr = Integer.parseInt(strNum);
        list.add(numStr);

        System.out.println(list);

        // #1 Додавання типу String можливо через Erasure - стирання типів, цим самим після коспіляції <Integer> стирається
        // #2 Переобразовуєму строку в число
    }
}