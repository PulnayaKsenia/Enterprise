package ua.goit.enterprise.CollectionsFirstMod;

import java.util.*;

public class TimeForSet {
    private Set<Integer> set;
    private int value;

    public TimeForSet(TreeSet<Integer> treeSet, int value) {
        this.set = treeSet;
        this.value = value;
    }

    public TimeForSet(HashSet<Integer> hashSet, int value) {
        this.set = hashSet;
        this.value = value;
    }

    private final int DIMENSION = 100;

    private long adding = 0;
    private long containing = 0;
    private long removing = 0;

    Random random = new Random();

    public long setAdd() {
        for (int j = 0; j < DIMENSION; j++) {
            long startTimeAdd = System.nanoTime();

            for (int i = 0; i < value; i++) {
                set.add(random.nextInt(50));
            }
            long endTimeAdd = System.nanoTime();
            adding = endTimeAdd - startTimeAdd;
        }
        return adding / DIMENSION;
    }

    public long setContains() {
        for (int j = 0; j < DIMENSION; j++) {
            long startTimeContains = System.nanoTime();

            for (int i = 0; i < value; i++) {
                set.contains(random.nextInt(50));
            }
            long endTimeContains = System.nanoTime();
            containing = endTimeContains - startTimeContains;
        }
        return containing / DIMENSION;
    }

    public long setRemove() {
        for (int j = 0; j < DIMENSION; j++) {
            long startTimeRemove = System.nanoTime();

            for (int i = 0; i < value; i++) {
                set.remove(random.nextInt(20));
            }
            long endTimeRemove = System.nanoTime();
            removing = endTimeRemove - startTimeRemove;
        }
        return removing / DIMENSION;
    }

    public String tableResultSet() {
        return String.format("%-6s%-7s%-10s%-8s%-14s%-14s%n",
                setAdd(), "-", setContains(), setRemove(), "-", "-");
    }
}
