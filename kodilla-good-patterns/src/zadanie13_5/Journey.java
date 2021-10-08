package zadanie13_5;

import java.util.Objects;

public class Journey {

    private final Airport first;
    private final Airport second;

    public Journey(final Airport first, final Airport second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Journey journey = (Journey) o;

        if (!Objects.equals(first, journey.first)) return false;
        return Objects.equals(second, journey.second);
    }

    @Override
    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (second != null ? second.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight from " + first.getDeparture() + " to " + second.getArrival() + " with stop at " +
                first.getArrival();
    }
}
