package Talleres.Taller01;

public class TestThermometer {
    public static void main(String[] args) {

        var temp = new Thermometer();

        if (temp.setTemperature(75) == true) {
            System.out.println("The temperature is accepted");
        } else {
            System.out.println("The temperature is not accepted");
        }

        if (temp.setTemperature(-70) == true) {
            System.out.println("The temperature is accepted");
        } else {
            System.out.println("The temperature is not accepted");
        }

        if (temp.setTemperature(300) == true) {
            System.out.println("The temperature is accepted");
        } else {
            System.out.println("The temperature is not accepted");
        }

    }
}
