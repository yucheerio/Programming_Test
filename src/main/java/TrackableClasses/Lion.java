package TrackableClasses;

import Systems.LocationSystem;

import java.awt.*;
import java.io.IOException;

public class Lion extends ReserveMembers {
    private final String name;
    private final int GPSTag;
    private int age;

    public Lion(String name, int GPSTag, int age) {
        super(name, GPSTag);
        this.age = age;
        this.GPSTag = GPSTag;
        this.name = name;
    }

    public void plotLocation(Graphics g) {
        try {
            Point p = LocationSystem.getCoords(GPSTag);
            if (!(p == null)) {
                g.setColor(Color.RED);
                g.drawOval(p.x, p.y, 3, 3);
                g.drawString(name, p.x + 3, p.y + 3);
                g.drawString(String.valueOf(age), p.x - 3, p.y - 3);
            }
        } catch (IOException IOe) {
            System.out.println(IOe.getMessage());
        }
    }


    public int getGPSTag() {
        return GPSTag;
    }

}


