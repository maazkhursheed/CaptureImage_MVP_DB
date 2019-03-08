package com.digimaklabs.captureimage.controllers.events;

import android.location.Location;

/**
 * Created by Maaz Khursheed on 12/02/19.
 */
public class LocationResponseEvent {

    public static final int LAST_KNOWN_LOCATION = 1;
    public static final int LOCATION_UPDATE = 2;

    private int type;
    private Location location;

    public LocationResponseEvent(int type, Location location) {
        this.type = type;
        this.location = location;
    }

    public int getType() {
        return type;
    }

    public Location getLocation() {
        return location;
    }
}
