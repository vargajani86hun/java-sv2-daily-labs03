package day05;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<String> students = new ArrayList<>();

    public boolean addStudent(String studentName) {
        if (!studentName.trim().contains(" ")) {
            System.out.println("Hiányzó család vagy keresztnév!");
            return false;
        }
        students.add(studentName.trim());
        return true;
    }

    public void printNames() {
        for (String s : students) {
            System.out.println(s);
        }
    }
}
