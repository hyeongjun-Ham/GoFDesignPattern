package org.example.adapter;

public class BSortEngine {

    public void setList() {
        System.out.println("B 정렬 세팅");
    }

    public void sorting(boolean desc) {
        if (desc) {
            System.out.println("B 정렬 역순");
        } else {
            System.out.println("B 정렬 정순");
        }
    }
}
