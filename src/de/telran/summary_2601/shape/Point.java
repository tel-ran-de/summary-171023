package de.telran.summary_2601.shape;

public class Point implements Shape {

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            return true;
        }
        return super.equals(obj);
    }
}
