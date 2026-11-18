package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class CovariantApp {
    static void main(String[] args) {
        MyData<String> myData = new MyData<>("Programmer Zaman Now");

        process(myData);

    }

    public  static void process(MyData<? extends Object> myData){
        System.out.println(myData.getData());
//        myData.setData("Hallo");  ERROR
    }
}
