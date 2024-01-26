package de.telran.summary.task;

public abstract class Phone {
    String model;
    String color;
    int memory;
    int megaPx;
    int simCount;

    public Phone(String model, String color, int memory, int megaPx, int simCount) {
        this.model = model;
        this.color = color;
        this.memory = memory;
        this.megaPx = megaPx;
        this.simCount = simCount;
    }

    public String getDescription() {
        return "Base phone";
    }

//    public abstract String getVersion();
}