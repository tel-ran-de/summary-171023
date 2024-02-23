package de.telran.summary_0202.box2;


public class Box {

    private final int width;

    private BoxSize boxSize;

    public Box(int width) {
        this.width = width;

        if (width < BoxSize.SMALL.getMaxWidth()) {
            this.boxSize = BoxSize.SMALL;
        } else {
            this.boxSize = BoxSize.BIG;
        }
    }

    public BoxSize getType() {
        return boxSize;
    }

//    public Box createBox() {
//        Box<String> box = new Box<>(12);
//        Box<Integer> box2 = new Box<>(12);
//
//        List<String> list = new ArrayList<>();
//        List<Double> list2 = new ArrayList<>();

//        list = list2;
//
//        box = box2;
//        return box;
//    }
}
