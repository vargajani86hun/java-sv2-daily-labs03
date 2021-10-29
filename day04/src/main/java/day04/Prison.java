package day04;

public class Prison {
    private boolean[] cells;

    public Prison() {
        cells = new boolean[100];
    }

    public void openFreeCells() {
        for (int i = 0; i < 100; i++) {
            for (int j = i; j < 100; j += (i + 1)) {
                cells[j] = !cells[j];
            }
        }
    }

    public void printFreeCells() {
        System.out.print('[');
        for (int i = 0; i < 100; i++) {
            if (cells[i]) {
                System.out.print((i + 1) + ", ");
            }
        }
        System.out.println(']');
    }
}
