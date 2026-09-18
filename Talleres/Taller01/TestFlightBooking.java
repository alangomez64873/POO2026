package Talleres.Taller01;

public class TestFlightBooking {
    public static void main(String[] args) {
        var booking = new FlightBooking();

        // Asignación de pasajero
        if (booking.setPassengerName("Alan") == true) {
            System.out.println("The passenger name is accepted");
        } else {
            System.out.println("The passenger name is not accepted");
        }

        // Asignación de habitación
        if (booking.setroomNumber("12B") == true) {
            System.out.println("The room number is accepted");
        } else {
            System.out.println("The room number is not accepted");
        }

        // verificación número de noches
        if (booking.setNights(4) == true) {
            System.out.println("The number of nights is confirmed");
        } else {
            System.out.println("The number of nights is not confirmed");
        }

        // verificación precioF
        if (booking.setPrice(123.87) == true) {
            System.out.println("The price is confirmed");
        } else {
            System.out.println("The price is not confirmed");
        }

    }
}
