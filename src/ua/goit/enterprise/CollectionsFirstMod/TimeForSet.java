package ua.goit.enterprise.CollectionsFirstMod;

import java.util.*;

public class TimeForSet {
    private final Random random = new Random();

    private Set<Integer> set;
    private int counter;

    public TimeForSet(TreeSet<Integer> treeSet, int counter) {
        this.set = treeSet;
        this.counter = counter;
    }

    public TimeForSet(HashSet<Integer> hashSet, int counter) {
        this.set = hashSet;
        this.counter = counter;
    }

    private final int DIMENSION = 100;
    private long sum;

    public long setAdd() {
        long adding = 0;

        for (int j = 0; j < DIMENSION; j++) {
            long startTimeAdd = System.nanoTime();

            for (int i = 0; i < counter; i++) {
                set.add(random.nextInt(50));
            }
            long endTimeAdd = System.nanoTime();
            sum = endTimeAdd - startTimeAdd;
            adding += sum;
        }
        return adding / DIMENSION;
    }

    public long setContains() {
        long containing = 0;

        for (int j = 0; j < DIMENSION; j++) {
            long startTimeContains = System.nanoTime();

            for (int i = 0; i < counter; i++) {
                set.contains(random.nextInt(50));
            }
            long endTimeContains = System.nanoTime();
            sum = endTimeContains - startTimeContains;
            containing += sum;
        }
        return containing / DIMENSION;
    }

    public long setRemove() {
        long removing = 0;

        for (int j = 0; j < DIMENSION; j++) {
            long startTimeRemove = System.nanoTime();

            for (int i = 0; i < counter; i++) {
                set.remove(random.nextInt(20));
            }
            long endTimeRemove = System.nanoTime();
            sum = endTimeRemove - startTimeRemove;
            removing += sum;
        }
        return removing / DIMENSION;
    }

    public String tableResultSet() {
        return String.format("%-6s%-7s%-10s%-8s%-14s%-14s%n",
                setAdd(), "-", setContains(), setRemove(), "-", "-");
    }
}
