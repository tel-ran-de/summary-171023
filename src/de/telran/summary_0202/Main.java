package de.telran.summary_0202;

public class Main {

    static int a = 1;
    int b = 2;

    public void exampleMethod() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        System.out.println(a);
//        System.out.println(b);

        new Main().nonStaticMain();
    }

    public void nonStaticMain() {
        InnerMain innerMain = new InnerMain();
        innerMain.exampleMethodInnerMain();
    }

    public class InnerMain {
        int c = 3;

        public void exampleMethodInnerMain() {
            System.out.println("a = " + Main.a);
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }

}

class OuterMain {
    int c = 3;

    public void exampleMethodInnerMain() {
        System.out.println("a = " + Main.a);
//        System.out.println("b = " + b);
    }
}
