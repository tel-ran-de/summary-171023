package de.telran.summary_0202.box;

public class BoxExample {

    public static void main(String[] args) {
//        BigBox bigBox = new BigBox();
//        SmallBox smallBox = new SmallBox();

//        BoxFactory boxFactory = new BoxFactory();
//        BoxFactory boxFactory2 = new BoxFactory();

        Box smallBox2 = BoxFactory.createBox("s");
        Box bigBox2 = BoxFactory.createBox("b");

        System.out.println(smallBox2);
        System.out.println(bigBox2);

//        System.out.println(new BoxType());
//        System.out.println(new BoxType());

        System.out.println("SMALL == SMALL = " +
                (BoxType.SMALL.equals(BoxType.SMALL)));

        System.out.println("big() == big() = " + (StaticOtherBoxType.big() ==
                StaticOtherBoxType.big()));

        BoxType[] boxTypes = new BoxType[]{BoxType.SMALL, BoxType.SMALL, BoxType.BIG};

        BoxType[] smallBoxes = new BoxType[boxTypes.length];
        BoxType[] bigBoxes = new BoxType[boxTypes.length];



    }
}
