package com.example.user.dunsparcesbucketlist;

/**
 * Created by tiffanybui on 9/3/2017.
 */

//Each item will have a name, description, latitude, longitude and
// a way to record whether it has been completed or not.


import java.util.ArrayList;

public class BucketItem {

    private String name, description;
    private double latitude, longitude;
    boolean completed;

    public BucketItem(String name, String description, double latitude, double longitude, boolean completed) {
        this.name = name;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.completed = completed;
    }

    public String getName() {return name;}
    public String getDescription() {return description;}
    public double getLatitude() {return latitude;}
    public double getLongitude() {return longitude;}
    public boolean getCompleted() {return completed;}

    private static int lastBucketId = 0;

    /*
    public static ArrayList<BucketItem> createBucketList(int numBucket) {
        ArrayList<BucketItem> bucketItems = new ArrayList<BucketItem>();

        for (int i = 1; i <= numBucket; i++) {
            bucketItems.add(new BucketItem("Runk it up", "Eat at Runk Dining Hall", 100, 100, false));
        }

        return bucketItems;
    }
    */

}

