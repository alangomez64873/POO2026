package Talleres.Taller01;

public class TestStudent {
    public static void main(String[] args) {
        var student = new Student();

        // Nombre válido
        if (student.setName("Alan") == true) {
            System.out.println("The name is accepted");
        } else {
            System.out.println("The name is not accepted");
        }

        // Nota válida
        if (student.setGrade(4.5, 3.0, 5.0) == true) {
            System.out.println("The grades are accepted");
        } else {
            System.out.println("The grades are not accepted");
        }

        // Nota inválida
        if (student.setGrade(6.0, 5.0, 2.0) == true) {
            System.out.println("The grades are accepted");
        } else {
            System.out.println("The grades are not accepted");
        }

    }
}
