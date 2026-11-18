package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class GenericApp {
    static void main(String[] args) {
        MyData<String> stringMyData = new MyData<String>("Dony");
        MyData<Integer> integerMyData = new MyData<Integer>(10);

        System.out.println(integerMyData.getData());
        System.out.println(stringMyData.getData());
    }


}
