package day03;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    private int taskNumber;

    public GuessTheNumber() {
        taskNumber = (new Random()).nextInt(100) + 1;
    }

    public int different(int askedNumber) {
        return askedNumber - taskNumber;
    }

    public static void main(String[] args) {
        GuessTheNumber gtn = new GuessTheNumber();
        Scanner scr = new Scanner(System.in);
        int number;

        System.out.println("Gondoltam egy számra 1 és 100 között. Találd ki, melyikre! Hatszor próbálkozhatsz.");
        for (int i = 0; i < 6; i++) {
            System.out.println("A(z) " + (i+1) + ". tipped:");
            number = scr.nextInt();
            scr.nextLine();
            if (gtn.different(number) == 0) {
                System.out.println("Gratulálok, kitaláltad!");
                break;
            }
            else if (gtn.different(number) < 0) {
                System.out.println("Ettől nagyobb számra gondoltam.");
            }
            else {
                System.out.println("Ettől kisebb számra gondoltam.");
            }
        }
    }
}
