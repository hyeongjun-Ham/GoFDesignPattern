package org.example.builder;

public class Client {
    public static void main(String[] args) {
        TourPlanDirector tourPlanDirector = new TourPlanDirector(new DefaultTourBuilder());

        TourPlan tourPlan = tourPlanDirector.busanTrip();

        System.out.println(tourPlan.toString());
    }
}
