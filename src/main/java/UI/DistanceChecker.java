package UI;

import Interfaces.Trackable;
import Systems.AlertSystem;
import TrackableClasses.Keeper;
import TrackableClasses.ReserveMembers;
import TrackableClasses.TrackableClassesDB;

import java.awt.*;
import java.io.IOException;

public class DistanceChecker {
    TrackableClassesDB database;
    Keeper keeper;

    public DistanceChecker(TrackableClassesDB database, Keeper keeper) throws IOException {
        this.database = database;
        for (Trackable trackable : database.getDB()){
            if (trackable instanceof ReserveMembers){
                Point p = ((ReserveMembers) trackable).getLocation();
                if (Math.hypot(p.x, p.y) > 60){
                    // AlertSystem.alertADrone();
                    AlertSystem.alertAKeeper(keeper.toString());
                }
            }
        }
    }
}
