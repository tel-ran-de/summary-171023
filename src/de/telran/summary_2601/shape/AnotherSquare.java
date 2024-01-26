package de.telran.summary_2601.shape;

public class AnotherSquare extends AbstractShape {

    private final int width;
    private final int height;

    public AnotherSquare(int width, int height) {
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

    @Override
    public String getColor() {
        return null;
    }

//    @Override
//    int getSquare() {
//        return 0;
//    }
}
