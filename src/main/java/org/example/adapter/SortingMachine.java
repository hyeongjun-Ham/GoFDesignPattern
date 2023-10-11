package org.example.adapter;

public class SortingMachine {

    private final ISortEngine engine;

    public SortingMachine(ISortEngine iSortEngine) {
        this.engine = iSortEngine;
    }

    void sortingRun() {
        engine.setList();
        engine.sort();
        engine.printSortListPretty();
        engine.reverseSort();
        engine.printSortListPretty();
    }
}
