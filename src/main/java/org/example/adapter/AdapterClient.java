package org.example.adapter;

public class AdapterClient {

    public static void main(String[] args) {
        //origin
        System.out.println("============ origin ============");
        SortingMachine machine = new SortingMachine(new ASortEngine());
        machine.sortingRun();

        System.out.println("============ origin end ============");

        //change
        System.out.println("============ change ============");
        SortEngineAdapter sortAdapter = new SortEngineAdapter(new ASortEngine(), new BSortEngine());
        SortingMachine machine2 = new SortingMachine(sortAdapter);
        machine2.sortingRun();

        System.out.println("============ change end ============");
    }

}
