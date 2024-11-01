package Singleton;

public class Main {
    public static void main(String args[]){
        Logger l1=Logger.getInstance();
        System.out.println(l1);
        Logger l2=Logger.getInstance();
        System.out.println(l2);
    }
}
