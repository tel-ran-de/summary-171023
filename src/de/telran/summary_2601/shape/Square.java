package de.telran.summary_2601.shape;

public class Square implements Shape, TwoDShape {

    private final int width;
    private final int height;

    public Square(int width, int height) {

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

    @Override
    public int getSquare() {
        return height * width;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        Square square = (Square) other;
        return width == square.width && height == square.height;
    }
}
