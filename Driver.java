// Driver class - stores info about each driver
// NO "static" on the fields - each Driver object needs its OWN name/team/etc.
import java.util.*;
public class Driver implements Comparable<Driver> {
    String name;
    String team;
    int position;
    double fastestLap;

    Driver(String name, String team, int position, double fastestLap) {
        this.name = name;
        this.team = team;
        this.position = position;
        this.fastestLap = fastestLap;
    }

    // Tells PriorityQueue how to sort Drivers (smallest lap time = first)
    @Override
    public int compareTo(Driver o) {
        return Double.compare(this.fastestLap, o.fastestLap);
    }
}

