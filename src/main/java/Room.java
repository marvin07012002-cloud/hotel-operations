public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;



    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isDirty && !isOccupied;
    }

    public boolean checkIn (){
        return !cleanRoom() && isOccupied;
    }
    public boolean checkOut(){
        return isDirty;
    }

    public boolean cleanRoom(){
        return !isOccupied;
    }
}
