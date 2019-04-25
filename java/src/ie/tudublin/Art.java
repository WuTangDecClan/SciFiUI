package ie.tudublin;

import processing.core.PApplet;

public class Art
{
    UI ui;
    float x;
    float y;
    float z;

    public Art(UI ui) {
        this.ui = ui;
        x = ui.random(-70, 530);
        y = ui.random(-70, ui.height/2);
        z = ui.random(ui.width);
    }

    public void render() {
        
    }

    public void update() {
        z = z - 1;
    }

    public void show() {
        ui.fill(255);
        ui.noStroke();
        float sx = ui.map(x / z, 0, 1, 0, ui.width);
        float sy = ui.map(y / z, 0, 1, 0, ui.height);

        ui.ellipse(sx, sy, 8, 8);
    }
}