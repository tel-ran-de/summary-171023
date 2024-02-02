package de.telran.summary_0202.box;

public class SmallBox implements Box {

    private final int width;
    private final int height;

    public SmallBox(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }
}
