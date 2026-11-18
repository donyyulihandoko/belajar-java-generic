package programmer.zaman.now.generic.application;

public class MultipleConstraintApp {
    static void main(String[] args) {

//        MyDaya<VicePresident> employeeMyDaya = new MyDaya<VicePresident>(12);

    }

    public static abstract class Employee{

    }

    public  static interface SayHello{
        public void sayHello(String name);
    }

    public static class Manager extends Employee{

    }

    public static class VicePresident extends Employee implements SayHello{

        @Override
        public void sayHello(String name) {

        }
    }

    public static class MyDaya<T extends Employee & SayHello >{
        private T data;

        public MyDaya(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

}
