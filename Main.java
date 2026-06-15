import java.util.*;

public class Main {

    // Print leaderboard sorted by fastest lap
    static void showLeaderboard(PriorityQueue<Driver> pq) {
        PriorityQueue<Driver> copy = new PriorityQueue<>(pq);

        System.out.println("\nLIVE LEADERBOARD (by Fastest Lap)");
        System.out.println("POS  DRIVER  TEAM  BEST LAP");
        int pos = 1;
        while (!copy.isEmpty()) {
            Driver d = copy.poll();
            System.out.println("P" + d.position + " " + d.name + " " + d.team);            pos++;
        }
    }

    public static void main(String[] args) {

        // ---------- DATA STRUCTURE 1: ARRAY (Starting Grid) ----------
        Driver[] grid = new Driver[10];
        grid[0] = new Driver("Max Verstappen", "Red Bull", 1, 83.456);
        grid[1] = new Driver("Lando Norris", "McLaren", 2, 83.712);
        grid[2] = new Driver("Charles Leclerc", "Ferrari", 3, 83.901);
        grid[3] = new Driver("Carlos Sainz", "Ferrari", 4, 84.100);
        grid[4] = new Driver("George Russell", "Mercedes", 5, 84.230);
        grid[5] = new Driver("Lewis Hamilton", "Mercedes", 6, 84.390);
        grid[6] = new Driver("Oscar Piastri", "McLaren", 7, 84.501);
        grid[7] = new Driver("Fernando Alonso", "Aston Martin", 8, 84.780);
        grid[8] = new Driver("Lance Stroll", "Aston Martin", 9, 85.120);
        grid[9] = new Driver("Pierre Gasly", "Alpine", 10, 85.340);

        System.out.println("SILVERSTONE RACE TRACKER - 2025");

        System.out.println("\nSTARTING GRID (Array):");
        for (int i = 0; i < grid.length; i++) {
            Driver d = grid[i];
            System.out.println("P" + d.position + " " + d.name + "  " + d.team + "  " + d.fastestLap + "s");        }

        // ---------- DATA STRUCTURE 2: QUEUE (Pit Lane - FIFO) ----------
        Queue<String> pitLane = new LinkedList<>();
        pitLane.add("Carlos Sainz");
        pitLane.add("Lewis Hamilton");
        pitLane.add("Lance Stroll");

        System.out.println("\nPIT LANE (Queue - FIFO):");
        while (!pitLane.isEmpty()) {
            String driver = pitLane.poll();
            System.out.println("Exiting: " + driver);
        }

        // ---------- DATA STRUCTURE 3: STACK (Overtake Log - LIFO) ----------
        Stack<String> overtakeLog = new Stack<>();
        overtakeLog.push("Lap 12: Norris passed Leclerc");
        overtakeLog.push("Lap 18: Verstappen passed Norris");
        overtakeLog.push("Lap 25: Sainz passed Russell");

        System.out.println("\nOVERTAKE LOG (Stack - LIFO):");
        while (!overtakeLog.isEmpty()) {
            String log = overtakeLog.pop();
            System.out.println(log);
        }

        // ---------- DATA STRUCTURE 4: PRIORITY QUEUE (Leaderboard) ----------
        PriorityQueue<Driver> leaderboard = new PriorityQueue<>();
        for (int i = 0; i < grid.length; i++) {
            leaderboard.add(grid[i]);
        }
        showLeaderboard(leaderboard);

        // ---------- DATA STRUCTURE 5: HASHMAP (Driver Search) ----------
        HashMap<String, Driver> db = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            db.put(grid[i].name, grid[i]);
        }

        Driver found = db.get("Carlos Sainz");
        System.out.println("\nSEARCH RESULT: " + found.name + " | " + found.team + " | P" + found.position);

        System.out.println("\nRACE COMPLETE.");
    }
}