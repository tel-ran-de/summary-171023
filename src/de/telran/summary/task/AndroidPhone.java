package de.telran.summary.task;

public class AndroidPhone extends Phone {

    public String androidVersion;

    public AndroidPhone(String model,
                        String color,
                        int memory,
                        int megaPx,
                        int simCount,
                        String androidVersion) {
        super(model, color, memory, megaPx, simCount);
        this.androidVersion = androidVersion;
    }

    //    @Override
    public String getVersion() {
        return androidVersion;
    }

    @Override
    public String toString() {
        return "AndroidPhone{" +
                "androidVersion='" + androidVersion + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", memory=" + memory +
                ", megaPx=" + megaPx +
                ", simCount=" + simCount +
                '}';
    }
}