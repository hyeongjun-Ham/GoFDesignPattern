package org.example.builder;

import java.time.LocalDate;

public interface TourPlanBuilder {
    TourPlanBuilder title(String title);

    TourPlanBuilder startDate(LocalDate startDate);

    TourPlanBuilder endDate(LocalDate endDate);

    TourPlanBuilder startPlace(String startPlace);

    TourPlanBuilder endPlace(String endPlace);

    TourPlanBuilder addCyclist(String name, String bikeName);

    TourPlan build();
}