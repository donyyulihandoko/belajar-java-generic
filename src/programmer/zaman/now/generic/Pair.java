package programmer.zaman.now.generic;

public class Pair <T, U>{
    private T first;
    private U second;

    public Pair(T first, U second){
        this.first = first;
        this.second = second;
    }

    public void setFirst(T first){
        this.first = first;
    }

    public T getFirst(){
        return this.first;
    }

    public void setSecond(U second){
        this.second = second;
    }

    public U getSecond(){
        return this.second;
    }
}
