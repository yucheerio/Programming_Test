package TrackableClasses;

import Interfaces.Trackable;
import Systems.LocationSystem;

import java.awt.*;
import java.io.IOException;

public abstract class ReserveMembers implements Trackable {
    private final String name;
    private final int GPSTag;

    public ReserveMembers(String name, int GPSTag) {
        this.name = name;
        this.GPSTag = GPSTag;
    }

    public Point getLocation() throws IOException {
        return LocationSystem.getCoords(GPSTag);
    }
}
