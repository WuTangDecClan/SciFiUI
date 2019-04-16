package ie.tudublin;

import processing.core.PApplet;

public class Dna
{
    private float dy = 1;
    private float y;
    private float diameter;
    private float radius;
    private float chart;
    UI ui;
    //st = new Barchart(this, width/2, height, width*.1f, 0);
    public Dna(UI ui, float y, float diameter, float chart)
    {
        this.ui = ui;
        this.y = y;
        this.diameter = diameter;
        this.chart = chart;
        radius = diameter / 2;
    }   //new Barchart(this, width, height, width*.1f, 0);
    
    public void render()
    {
        ui.fill(0);
        ui.ellipse(y, chart, 10, 10);
    }

    public void update()
    {
        chart = chart + dy;
        if ((chart == ui.height) || chart == 1) {
            dy = dy * -1;
        }
    }
}
