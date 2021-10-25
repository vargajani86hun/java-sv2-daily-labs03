package day01;

public class School {
    public static void main(String[] args) {
        Students classMates = new Students();
        classMates.addHeight(160);
        classMates.addHeight(163);
        classMates.addHeight(168);
        classMates.addHeight(170);
        classMates.addHeight(178);
        System.out.println(classMates.isHeightsIncreasing());

    }
}
