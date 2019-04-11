package ie.tudublin;

import processing.core.PApplet;

public class Barchart
{
    private float x;
    private float dy = -1;
    private float ranY;
    private float y;
    private float diameter;
    private float radius;
    private float chart;
    UI ui;
    //st = new Barchart(this, width/2, height, width*.1f, 0);
    public Barchart(UI ui, float x, float y, float diameter, float chart)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.chart = chart;
        radius = diameter / 2;
        ranY = ui.random(0, -99);
    }   //new Barchart(this, width, height, width*.1f, 0);
    
    public void render()
    {
        ranY = ui.random(0, -99);
        ui.stroke(255);
        ui.line(diameter, y - diameter, diameter*6 - (diameter *.5f), y - diameter);
        ui.rect(diameter, y - diameter, 30, chart);
        for (int i = 0; i < 5; i ++ ) {
            ui.rect(diameter + radius, y - diameter, 30, chart - ranY);
            radius += 25;
        }
    }

    public void update()
    {
        chart = chart + dy;
        if ((chart == -100) || chart == 1) {
            dy = dy * -1;
        }
    }
}
