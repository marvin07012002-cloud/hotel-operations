public class Reservation {
    private String roomType;
    private double price;
    private int numbersOfNights;
    private boolean isWeekend;
    private double reservationTotal;

    public double roomType() {
        double price = 0;

        if (roomType.equalsIgnoreCase("King")) {
            price = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            price = 124.00;
        }


        return price;
    }

    public Reservation(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getNumbersOfNights() {
        return numbersOfNights;
    }

    public void setNumbersOfNights(int numbersOfNights) {
        this.numbersOfNights = numbersOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal() {
        double total = getPrice();
        if (isWeekend) {
            double totalPrice = total * 1.1;
            return total;
        }
        return reservationTotal;
    }
}
