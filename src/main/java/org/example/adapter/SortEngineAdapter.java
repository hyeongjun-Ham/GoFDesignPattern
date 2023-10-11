package org.example.adapter;

public class SortEngineAdapter implements ISortEngine{

    private final ASortEngine aSortEngine;

    private final BSortEngine bSortEngine;

    public SortEngineAdapter(ASortEngine aSortEngine, BSortEngine bSortEngine) {
        this.aSortEngine = aSortEngine;
        this.bSortEngine = bSortEngine;
    }

    @Override
    public void setList() {
        bSortEngine.setList();
    }

    @Override
    public void sort() {
        bSortEngine.sorting(false);
    }

    @Override
    public void reverseSort() {
        bSortEngine.sorting(true);
    }

    @Override
    public void printSortListPretty() {
        aSortEngine.printSortListPretty();
    }
}
