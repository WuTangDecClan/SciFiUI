package ie.tudublin;

import processing.core.PApplet;
import java.util.ArrayList;

public class MovingBar {

    private float zY;
    private float zX;
    private float ranY;
    private float heightY;
    private float radius;

    ArrayList<Float> size = new ArrayList<Float>(7);
    ArrayList<Integer> dy = new ArrayList<Integer>(7);
    UI ui;
    
    // new MovingBar(this, (outln * 2), height - (outln * 2));
    public MovingBar(UI ui, float zX, float zY, float heightY, float radius) {
        this.ui = ui;
        this.zX = zX;
        this.zY = zY;
        this.heightY = heightY;
        this. radius = radius /8;
        for(int i = 0; i < 7; i++){
            ranY = ui.random((ui.height/4) * -1, 0);
            size.add(ranY);
            dy.add(-1);
        }
    }   
    
    public void render() {
        
        ui.stroke(127, 127, 127);
        ui.fill(255, 255, 255);
        for(int i = 0; i < 7; i++) {
            ui.fill(ui.map(i, 0, 7, 0, 255), 255, 255);
            ui.rect(zX + (radius * i), zY, 50, size.get(i));
        }
    }

    public void update() {
        for(int i = 0; i < 7; i ++) {
            size.set(i, size.get(i) + dy.get(i));
        }
        for(int i = 0; i < 7; i ++) {
            if ((size.get(i) >= heightY) && (size.get(i) <= (heightY + 5)) || (size.get(i) >= 1)) {
                dy.set(i, dy.get(i) * -1);
            }
        }
    }
}
