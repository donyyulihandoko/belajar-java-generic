package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.util.ArrayHelper;

public class ArrayHelperApp {
    static void main(String[] args) {
        String[] abjad = {"a", "b", "c", "d", "e"};
        Integer[] numbers = {1,2,3,4,5,6};

        System.out.println(ArrayHelper.count(abjad));
        System.out.println(ArrayHelper.count(numbers));
    }
}
