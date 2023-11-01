package com.example.locationweb.service;

import com.example.locationweb.entities.Location;

import java.util.List;

public interface LocationService {
    Location saveLocation(Location location);
    Location updateLocation(Location location);
    void deleteLocation(Location location);
    Location getLocationById(int id);
    List<Location> getAllLocation();

}
