package org.example.builder;

import java.time.LocalDate;
import java.util.List;

public class TourPlan {

    private String title;
    private LocalDate startDate;
    private LocalDate endDate;
    private String startPlace;
    private String endPlace;
    private List<Cyclist> cyclists;

    public TourPlan() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getStartPlace() {
        return startPlace;
    }

    public void setStartPlace(String startPlace) {
        this.startPlace = startPlace;
    }

    public String getEndPlace() {
        return endPlace;
    }

    public void setEndPlace(String endPlace) {
        this.endPlace = endPlace;
    }

    public List<Cyclist> getCyclists() {
        return cyclists;
    }

    public void setCyclists(List<Cyclist> cyclists) {
        this.cyclists = cyclists;
    }

    @Override
    public String toString() {
        return "TourPlan{" +
                "title='" + title + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", startPlace='" + startPlace + '\'' +
                ", endPlace='" + endPlace + '\'' +
                ", cyclists=" + cyclists +
                '}';
    }
}
