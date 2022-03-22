import java.util.Objects;

public class PlaceOfInterest implements Comparable<PlaceOfInterest> {
    private String name;
    private double time;
    private int important;
    private Double useful;

    public PlaceOfInterest(String name, double time, int important) {
        this.name = name;
        this.time = time;
        this.important = important;
        this.useful = important / time;
    }

    public double getTime() {
        return time;
    }

    @Override
    public String toString() {
        return name + ": Затраты времени на посещение в часах - " + time + " Важность - " + important;
    }

    @Override
    public int compareTo(PlaceOfInterest o) {
        return this.useful.compareTo(o.useful);
    }
}
