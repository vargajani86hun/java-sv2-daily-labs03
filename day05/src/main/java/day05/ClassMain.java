package day05;

public class ClassMain {
    public static void main(String[] args) {
        Journal journal = new Journal();
        if (journal.addStudent("Tóth Máté")) {
            journal.printNames();
        }

        if (journal.addStudent("Márki-Kira Zalán")) {
            journal.printNames();
        }

        if (journal.addStudent("Madonna")) {
            journal.printNames();
        }
        if (journal.addStudent("Szabó Botond")) {
            journal.printNames();
        }
    }
}
