package Talleres.Taller01;

public class FlightBooking {
    private String passengerName;
    private String roomNumber;
    private int nights;
    private double price;

    public String getPassengerName() {
        return passengerName;
    }

    public boolean setPassengerName(String newName) {
        if (newName != null && !newName.trim().isEmpty()) {
            passengerName = newName;
            return true;
        } else {
            return false;
        }
    }

    public String getroomNumber() {
        return roomNumber;
    }

    public boolean setroomNumber(String newRoomNumber) {
        if (newRoomNumber != null && !newRoomNumber.trim().isEmpty()) {
            roomNumber = newRoomNumber;
            return true;
        } else {
            return false;
        }
    }

    public int getNights() {
        return nights;
    }

    public boolean setNights(int newNights) {
        if (newNights > 0) {
            nights = newNights;
            return true;
        } else {
            return false;
        }
    }

    public double getPrice() {
        return price;
    }

    public boolean setPrice(double newPrice) {
        if (newPrice > 0.0) {
            price = newPrice;
            return true;
        } else {
            return false;
        }
    }

    double cost = nights * price;

}
