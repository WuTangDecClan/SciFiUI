package ie.tudublin;

import processing.core.PApplet;

public class Star
{
    UI ui;
    float x;
    float y;
    float z;

    public Star(UI ui) {
        this.ui = ui;
        x = ui.random(-ui.width, ui.width);
        y = ui.random(-ui.height, ui.height);
        z = ui.random(ui.width);
    }

    public void render() {
        
    }

    public void update() {
        z = z - 10;

        if( z < 1) {
            z = ui.width;
            x = ui.random(-ui.width, ui.width);
            y = ui.random(-ui.height, ui.height);
        }
    }

    public void show() {
        ui.fill(ui.random(0,255), ui.random(0,255), ui.random(0,255));
        ui.noStroke();
        
        float sx = ui.map(x / z, 0, 1, 0, ui.width);
        float sy = ui.map(y / z, 0, 1, 0, ui.height);

        float r = ui.map(z, 0, ui.width, 16, 0);
        ui.ellipse(sx, sy, r, r);
    }
}