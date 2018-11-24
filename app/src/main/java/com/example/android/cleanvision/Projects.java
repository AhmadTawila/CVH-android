package com.example.android.cleanvision;

public class Projects {
    String title;

    String address;

    String description;

    String startDate;

    String endDate;

    //private int mImageResourceId;


    public Projects(String ti, String add, String desc, String startdate, String enddate/*, int image*/){
        title = ti;
        address = add;
        description = desc;
        startDate = startdate;
        endDate = enddate;
       // mImageResourceId = image;
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

    //public int getImageResourceId(){return  mImageResourceId;}
}
