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


}
