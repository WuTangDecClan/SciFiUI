package ie.tudublin;

import processing.core.PApplet;

public class Dna
{
    private float x1;
    private float dy1 = .5f;
    private float dx1 = 1;
    private float y1;

    private float x2;
    private float dy2 = .5f;
    private float dx2 = 1;
    private float y2;
    private float diameter;
    private float radius;
    UI ui;

    public Dna(UI ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x1 = x;
        this.y1 = y;
        this.x2 = x;
        this.y2 = y;
        this.diameter = diameter;
        radius = diameter / 2;
    }
    
    public void render()
    {
        ui.stroke(255);
        ui.noFill();
        ui.ellipse(x1, y1, diameter, diameter);
        ui.ellipse(x2, y2, diameter, diameter);
        x1++; y1++; x2++; y2++;
    }

    public void update()
    {
        y1 += dy1;
        x1 += dx1;
        y2 -= dy2;
        x2 -= dx2;

        if ((y1 > ui.height - radius) || (y1 < radius))
        {
            dy1 *= -1;
        }
        if ((x1 > ui.width) || (x1 < ui.width-200))
        {
            dx1 *= -1;
        }

        if ((y2 > ui.height - radius) || (y2 < radius))
        {
            dy2 *= 1;
        }
        if ((x2 > ui.width) || (x2 < ui.width-200))
        {
            dx2 *= 1;
        }
    }
}
