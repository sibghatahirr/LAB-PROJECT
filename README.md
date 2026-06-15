# Silverstone Race Tracker

A simple Java DSA project simulating an F1 race tracker using 5 core data structures.

# Data Structures Used
- Array– Starting grid of drivers
- Queue (FIFO)– Pit lane order
- Stack (LIFO) – Overtake log
- PriorityQueue – Live leaderboard sorted by fastest lap
- HashMap – Fast driver lookup by name

# How to Run
cd src
javac Main.java Driver.java
java Main

# Files
- Main.java – Program entry point, builds and displays all data structures
- Driver.java – Driver class (name, team, position, fastest lap)
