package de.telran.summary_0202.box;

public class BoxFactory {

    private BoxFactory() {
    }

    public static Box createBox(String size) {
        switch (size) {
            case "s":
                return new SmallBox(1, 2);
            case "b":
                return new BigBox();
            default:
                throw new IllegalStateException("No such box size");
        }
    }
}
