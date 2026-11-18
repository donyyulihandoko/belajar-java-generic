package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class MultipleApp {
    static void main(String[] args) {

        print(new MyData<Integer>(123));
    }

    public static void print(MyData<?> myData){
        System.out.println(myData.getData());
    }
}
