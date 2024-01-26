package de.telran.summary_2601.shape;

public interface Shape {

    Shape POINT = new Shape() {

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
    };

    double getWidth();

    double getHeight();

    String getColor();

    default String getDescription() {
        return "I'm a shape";
    }
}
