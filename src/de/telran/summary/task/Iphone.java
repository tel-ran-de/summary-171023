package de.telran.summary.task;

public class Iphone extends Phone {

    String iosVersion;

    public Iphone(String model,
                  String color,
                  int memory,
                  int megaPx,
                  int simCount,
                  String iosVersion) {
        super(model, color, memory, megaPx, simCount);
        this.iosVersion = iosVersion;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "iosVersion='" + iosVersion + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", memory=" + memory +
                ", megaPx=" + megaPx +
                ", simCount=" + simCount +
                '}';
    }
}