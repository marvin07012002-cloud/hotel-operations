public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean checksInAndOut;


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

    public boolean checkIn (boolean in){
        this.checksInAndOut = in;
        return isDirty && isOccupied;
    }
    public boolean checkOut(boolean in){
        in = this.checksInAndOut;

        return isDirty;
    }

    public boolean cleanRoom(boolean ready){
        ready = this.isDirty;
        return !isOccupied;
    }
}
