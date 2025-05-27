import java.time.LocalTime;

public abstract class Vehicle{
    private String plate;
    private LocalTime lastEntry;

    public Vehicle(String plate, LocalTime lastEntry) {
        this.plate = plate;
        this.lastEntry = lastEntry;
    }

    public String getPlate() {
        return this.plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public LocalTime getLastEntry() {
        return this.lastEntry;
    }

    public void setLastEntry(LocalTime lastEntry) {
        this.lastEntry = lastEntry;
    }

    public String toString() {
        return " Placa: " + getPlate() +
            ", Ultimo ingreso: " + getLastEntry();
    }

}