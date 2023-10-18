package org.example.builder;

import java.time.LocalDate;

public class TourPlanDirector {
    private TourPlanBuilder tourPlanBuilder;

    public TourPlanDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan busanTrip() {
        return tourPlanBuilder
                .title("부산 종주")
                .startDate(LocalDate.parse("2023-10-21"))
                .endDate(LocalDate.parse("2023-10-24"))
                .startPlace("하남")
                .endPlace("부산")
                .addCyclist("나", "Merida")
                .addCyclist("동료", "Look")
                .build();
    }
}
