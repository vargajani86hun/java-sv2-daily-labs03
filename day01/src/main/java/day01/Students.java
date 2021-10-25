package day01;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private List<Integer> heightsOfSutdents;

    public Students() {
        heightsOfSutdents = new ArrayList<>();
    }

    public void addHeight(int height) {
        heightsOfSutdents.add(height);
    }

    public boolean isHeightsIncreasing() {
        for (int i = 1; i < heightsOfSutdents.size(); i++){
            if (heightsOfSutdents.get(i-1) > heightsOfSutdents.get(i)){
                return false;
            }
        }
        return true;
    }
}
