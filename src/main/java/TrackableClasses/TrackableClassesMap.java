package TrackableClasses;

import java.awt.*;

public class TrackableClassesMap extends Canvas {
    private TrackableClassesDB database;

    public TrackableClassesMap(TrackableClassesDB database) {
        this.database = database;
    }

    public void paint(Graphics g){
        database.plotTrackables(g);
    }
}
