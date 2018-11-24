package com.example.android.cleanvision;

public class Projects {
    String title;

    String address;

    String description;

    String startDate;

    String endDate;

    public Projects(String ti, String add, String desc, String startdate, String enddate){
        title = ti;
        address = add;
        description = desc;
        startDate = startdate;
        endDate = enddate;
    }

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }
}
