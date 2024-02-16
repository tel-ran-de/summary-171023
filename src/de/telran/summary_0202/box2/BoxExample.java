package de.telran.summary_0202.box2;

public class BoxExample {

    public static void main(String[] args) {
        Box box1 = new Box(100);
        Box box2 = new Box(50);
        Box box3 = new Box(100);
        System.out.println("Box1 = " + box1.getType());
        System.out.println("Box2 = " + box2.getType());
        System.out.println("Box3 = " + box3.getType());

        System.out.println(BoxSize.SMALL.getTitle());
//        new BoxSize(123, "2");
    }

}
