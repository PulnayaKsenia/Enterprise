package ua.goit.enterprise.CollectionsFirstMod;

import java.util.*;

public class TimeForList {
    private List<Integer> list;
    private int value;

    public TimeForList(ArrayList<Integer> arrayList, int value) {
        this.list = arrayList;
        this.value = value;
    }

    public TimeForList(LinkedList<Integer> linkedList, int value) {
        this.list = linkedList;
        this.value = value;
    }

    private final int DIMENSION = 100;

    private long adding = 0;
    private long getting = 0;
    private long containing = 0;
    private long removing = 0;
    private long iteratorAdding = 0;
    private long iteratorRemoving = 0;

    public long listAdd() {
        for (int j = 0; j < DIMENSION; j++) {
            long startTimeAdd = System.nanoTime();

            for (int i = 0; i < value; i++) {
                list.add(i);
            }
            long endTimeAdd = System.nanoTime();
            adding = endTimeAdd - startTimeAdd;
        }
        return adding / DIMENSION;
    }

    public long listGet() {
        for (int j = 0; j < DIMENSION; j++) {
            long startTimeGet = System.nanoTime();

            for (int i = 0; i < value; i++) {
                list.get(i);
            }
            long endTimeGet = System.nanoTime();
            getting = endTimeGet - startTimeGet;
        }
        return getting / DIMENSION;
    }

    public long listContains() {
        for (int j = 0; j < DIMENSION; j++) {
            long startTimeContains = System.nanoTime();

            for (int i = 0; i < value; i++) {
                list.contains(i);
            }
            long endTimeContains = System.nanoTime();
            containing = endTimeContains - startTimeContains;
        }
        return containing / DIMENSION;
    }

    public long listIteratorAdd() {
        for (int j = 0; j < DIMENSION; j++) {
            long startTimeIteratorAdd = System.nanoTime();

            for (int i = 0; i < value; i++) {
                list.listIterator().add(i);
            }
            long endTimeIteratorAdd = System.nanoTime();
            iteratorAdding = endTimeIteratorAdd - startTimeIteratorAdd;
        }
        return iteratorAdding / DIMENSION;
    }

    public long listRemove() {
        for (int j = 0; j < DIMENSION; j++) {
            long startTimeRemove = System.nanoTime();

            for (int i = 0; i < value; i++) {
                list.remove(0);
            }
            long endTimeRemove = System.nanoTime();
            removing = endTimeRemove - startTimeRemove;
        }
        return removing / DIMENSION;
    }

    public long listIteratorRemove() {
        for (int j = 0; j < DIMENSION; j++) {
            long startTimeIteratorRemove = System.nanoTime();

            Iterator<Integer> iterator = list.iterator();
            if (iterator.next() > 10) {
                iterator.remove();
            }
            long endTimeIteratorRemove = System.nanoTime();
            iteratorRemoving = endTimeIteratorRemove - startTimeIteratorRemove;
        }
        return iteratorRemoving / DIMENSION;
    }

    public String tableResultList() {
        return String.format("%-6s%-7s%-10s%-8s%-14s%-14s%n",
                listAdd(), listGet(), listContains(), listRemove(), listIteratorAdd(), listIteratorRemove());
    }
}
