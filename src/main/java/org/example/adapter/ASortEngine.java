package org.example.adapter;

public class ASortEngine implements ISortEngine{

    private ISortEngine engine;

    @Override
    public void setList() {
        System.out.println("A 정렬 세팅");
    }

    @Override
    public void sort() {
        System.out.println("A 정렬");
    }

    @Override
    public void reverseSort() {
        System.out.println("A 정렬 리버스");
    }

    @Override
    public void printSortListPretty() {
        System.out.println("A 정렬 프린트");
    }
}
