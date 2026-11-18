package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class ContravariantApp {
    static void main(String[] args) {
        MyData<Object> myData = new MyData<>("Programmer Zaman Now");
        MyData<? super String> stringMyData = myData;

        doIt(myData);
        System.out.println(myData.getData());


    }

    public  static void doIt(MyData<? super String> myData){
        String value = (String) myData.getData();
        System.out.println("Process parameter " + value);
        myData.setData("Dony Yuli Handoko");
    }
}
