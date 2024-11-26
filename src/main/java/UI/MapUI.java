package UI;
import java.awt.Color;
import java.awt.Graphics;
import Systems.*;
import TrackableClasses.*;

import javax.swing.*;

public class MapUI {
    private JPanel mapPanel;
    private TrackableClassesMap map;

    public MapUI(TrackableClassesMap map){
        this.mapPanel = new JPanel();
        mapPanel.setBorder(BorderFactory.createTitledBorder("Map of Simba's World"));
        this.map = map;
        mapPanel.add(map);
    }

    public JPanel getMapPanel(){
        return mapPanel;
    }

    public void refresh(){
        map.repaint();

    }
}

