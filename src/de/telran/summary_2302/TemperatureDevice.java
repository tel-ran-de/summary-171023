package de.telran.summary_2302;

import java.util.List;

public interface TemperatureDevice {

    // getMin(2) -> [1, 3] // O(1)
    List<Integer> getMin(int n);

    // 1
    // 7
    // 3
    // log(size)
    void addTemperature(int temperature);
}
