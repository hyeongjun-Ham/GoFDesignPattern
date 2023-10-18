package org.example.builder;

import java.time.LocalDate;
import java.util.ArrayList;

public class DefaultTourBuilder implements TourPlanBuilder {

    private final TourPlan tourPlan = new TourPlan();

    public DefaultTourBuilder() {
    }

    @Override
    public TourPlanBuilder title(String title) {
        this.tourPlan.setTitle(title);
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate startDate) {
        this.tourPlan.setStartDate(startDate);
        return this;
    }

    @Override
    public TourPlanBuilder endDate(LocalDate endDate) {
        this.tourPlan.setEndDate(endDate);
        return this;
    }

    @Override
    public TourPlanBuilder startPlace(String startPlace) {
        this.tourPlan.setStartPlace(startPlace);
        return this;
    }

    @Override
    public TourPlanBuilder endPlace(String endPlace) {
        this.tourPlan.setEndPlace(endPlace);
        return this;
    }

    @Override
    public TourPlanBuilder addCyclist(String name, String bikeName) {
        if (this.tourPlan.getCyclists() == null) {
            this.tourPlan.setCyclists(new ArrayList<>());
        }
        this.tourPlan.getCyclists().add(new Cyclist(name, bikeName));
        return this;
    }

    @Override
    public TourPlan build() {
        return tourPlan;
    }
}
