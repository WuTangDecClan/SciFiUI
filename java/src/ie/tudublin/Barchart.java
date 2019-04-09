package ie.tudublin;

import processing.core.PApplet;

public class Barchart
{
    private float x;
    private float dy = 1;
    private float y;
    private float diameter;
    private float radius;
    private float chart;
    UI ui;

    public Barchart(UI ui, float x, float y, float diameter, float chart)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.chart = chart;
        radius = diameter / 2;
    }
    
    public void render()
    {
        ui.stroke(255);
        ui.line(diameter, y - diameter, diameter*6 - (diameter *.5f), y - diameter);
        ui.rect(diameter, y - diameter, 30, chart);
        /*
        ui.stroke(255);
        ui.noFill();
        ui.ellipse(x, y, diameter, diameter);
        ui.fill(255);
        // Static field
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text("I am a moving circle", x, y);
        */

    }

    public void update()
    {
        chart += 1;
        if ((chart > 360) || (chart < chart - diameter))
        {
            chart *= -1;
        }
    }
}
