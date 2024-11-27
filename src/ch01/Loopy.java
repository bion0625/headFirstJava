package ch01;

public class Loopy {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("before loop");
        while(x < 4) {
            System.out.println("i loop");
            System.out.println("x's value is ' " + x);
            x = x + 1;
        }
        System.out.println("after loop");
    }
}