package de.telran.summary_0202.box2;

public enum BoxSize {
    SMALL(100, "small size"),
    BIG(Integer.MAX_VALUE, "big size");

    private int maxWidth;
    private String title;

    BoxSize(int maxWidth, String title) {
        this.maxWidth = maxWidth;
        this.title = title;
    }

    public int getMaxWidth() {
        return maxWidth;
    }

    public String getTitle() {
        return title;
    }
}
