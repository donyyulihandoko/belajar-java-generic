package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class InvariantApp {
    static void main(String[] args) {
        MyData<String> myData = new MyData<>("Dony Yuli H");
//        MyData<Integer> integerMyData = myData;  Error

//        doIt(myData); //Error
    }

    public  static void doIt(MyData<Object> myData){
//        do nothing
    }
}
