package programmer.zaman.now.generic.application;

public class ConstraintApp {
    static void main(String[] args) {

        NumberData<Integer> integerNumberData = new NumberData<>(100);
//        NumberData<String> stringNumberData = new NumberData<String>("hallo"); ERROR

    }

    public static class NumberData<T extends Number>{
        private T data;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public NumberData(T data) {
            this.data = data;
        }
    }
}
