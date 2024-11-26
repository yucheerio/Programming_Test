package TrackableClasses;

import Interfaces.Trackable;
import Systems.LocationSystem;

import java.awt.*;
import java.io.IOException;

public class Monitor implements Trackable {
    private final String name;
    private final int GPSTag;
    private final String radioFreq;

    public Monitor(String name, String radioFreq, int GPSTag){
        this.name = name;
        this.GPSTag = GPSTag;
        this.radioFreq = radioFreq;
    }

    public void plotLocation(Graphics g){
        try{
            Point p = LocationSystem.getCoords(GPSTag);
            if(!(p ==null)) {
                g.setColor(Color.BLACK);
                g.drawRect(p.x, p.y, 3, 3);
                g.drawString(name, p.x+3, p.y+3);
                g.drawString(radioFreq, p.x-3, p.y-3);
            }
        }
        catch(IOException IOe){
            System.out.println(IOe.getMessage());
        }
    }


    public int getGPSTag(){
        return GPSTag;
    }

}
