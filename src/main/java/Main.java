import TrackableClasses.*;
import UI.MapUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(600, 600);
        boolean running = true;
        while(true) {
            TrackableClassesDB database = new TrackableClassesDB();
            Keeper keeper1 = new Keeper("Geoff", 4392, 80);
            database.addTrackable(keeper1);
            Lion lion1 = new Lion("Simba", 7, 30);
            database.addTrackable(lion1);
            Monitor drone1 = new Monitor("Monitor1", "128MHz", 124);
            database.addTrackable(drone1);

            TrackableClassesMap map = new TrackableClassesMap(database);
            MapUI mapUI = new MapUI(map);
            mapUI.refresh();
            frame.add(mapUI.getMapPanel());
            frame.setVisible(true);
            frame.addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    frame.dispose();
                }
            });
        }
        
    }
}
