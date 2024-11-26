package TrackableClasses;

import Systems.LocationSystem;

import java.awt.*;
import java.io.IOException;

public class Keeper extends ReserveMembers {
    private final String name;
    private final int GPSTag;
    private final int phoneNum;

    public Keeper(String name, int GPSTag, int phoneNum) {
        super(name, GPSTag);
        this.name = name;
        this.GPSTag = GPSTag;
        this.phoneNum = phoneNum;
    }

    public void plotLocation(Graphics g) {
        try {
            Point p = LocationSystem.getCoords(GPSTag);
            if (!(p == null)) {
                g.setColor(Color.BLUE);
                g.drawOval(p.x, p.y, 2, 2);
                g.drawString(name, p.x + 3, p.y + 3);
                g.drawString(String.valueOf(phoneNum), p.x + 4, p.y + 4);
            }
        } catch (IOException IOe) {
            System.out.println(IOe.getMessage());
        }
    }


    public int getGPSTag() {
        return GPSTag;
    }
}