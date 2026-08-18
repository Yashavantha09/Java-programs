package Yashavantha;

public class Overlpoading {

    void m1() {
        System.out.println("sdfa");
    }

    void m1(int a) {
        System.out.println("dfasdfasdfasfas");
    }

    public static void main(String[] args) {

        Overlpoading test = new Overlpoading(); // object

        test.m1();
        test.m1(3);
    }
}