public class Reservation {
    private String roomType;
    private double price;
    private int numbersOfNights;
    private boolean isWeekend;
    private double reservationTotal;

    public double roomType(double bedPrice) {
        double kingBedPrice = 139.00;
        double doubleBed = 124.00;
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
        return reservationTotal;
    }
}
