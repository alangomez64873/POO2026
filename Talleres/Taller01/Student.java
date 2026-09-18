package Talleres.Taller01;

public class Student {
    private String name;
    private double grade1, grade2, grade3;
    private int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String newName) {
        if (newName != null && !newName.trim().isEmpty()) {
            name = newName;
            return true;
        } else {
            return false;
        }
    }

    public double getGrade1() {
        return grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public double getGrade3() {
        return grade3;
    }

    public boolean setGrade(double grade1, double grade2, double grade3) {
        if ((grade1 >= 0.0 && grade1 <= 5.0) && (grade2 >= 0.0 && grade2 <= 5.0) && (grade3 >= 0.0 && grade3 <= 5.0)) {
            return true;
        } else {
            return false;
        }
    }

}
