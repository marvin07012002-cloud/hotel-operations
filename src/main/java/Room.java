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

    public void setIsOccupied(boolean occupied) {
        this.isOccupied = occupied;
    }

    public boolean getIsOccupied() {
        return this.isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isDirty && !isOccupied;
    }

    public void checkIn() {

        this.isOccupied = true;
        this.isDirty = true;

    }

    public void checkOut() {
        this.isOccupied = false;

    }

    public void cleanRoom() {
        if (!this.isOccupied) {
            this.isDirty = false;
        } else {
            System.out.println("my bad");
        }

    }
}
