package TrackableClasses;

import Interfaces.Trackable;

import java.awt.*;
import java.util.ArrayList;

public class TrackableClassesDB {
    private ArrayList<Trackable> trackables;

    public TrackableClassesDB() {
        this.trackables = new ArrayList<>();
    }

    public ArrayList<Trackable> getDB() {
        return trackables;
    }

    public void addTrackable(Trackable trackable) {
        this.trackables.add(trackable);
    }

    public void plotTrackables(Graphics g){
        for (Trackable trackable : trackables) {
            trackable.plotLocation(g);
        }
    }

}
