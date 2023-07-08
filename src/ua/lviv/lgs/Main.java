package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main ( String [] args ) {
        List<Integer> list = new ArrayList<>();

        AddToList.addToList(list);

        System.out.println(list);

        //Пошукавши інформацію, я дізнався:
        //Додавання типу String можливо через Erasure - стирання типів, цим самим після коспіляції <Integer> стирається

        //P.S. Якщо я неправильно зрозумів і код працює по принципу "Пофіг як, головне що працює" - буду вдячний за пояснення
    }
}