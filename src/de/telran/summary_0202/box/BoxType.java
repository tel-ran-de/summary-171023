package de.telran.summary_0202.box;

public enum BoxType {
    SMALL,
    BIG;
}

interface OtherBoxType {

    OtherBoxType SMALL = new OtherBoxType() {
    };
    OtherBoxType BIG = new OtherBoxType() {
    };
}

class StaticOtherBoxType {

    private StaticOtherBoxType() {
    }

    private interface InnerBoxType {

        InnerBoxType SMALL = new InnerBoxType() {
        };
        InnerBoxType BIG = new InnerBoxType() {
        };
    }

    public static InnerBoxType small() {
        return InnerBoxType.SMALL;
    }

    public static InnerBoxType big() {
        return InnerBoxType.BIG;
    }
}

class CustomBox implements OtherBoxType {

}
