package ie.tudublin;

import processing.core.PApplet;

public class Barchart
{
    private float dy = -1;
    private float y;
    private float diameter;
    private float radius;
    private float chart;
    UI ui;
    //st = new Barchart(this, width/2, height, width*.1f, 0);
    public Barchart(UI ui, float y, float diameter, float chart)
    {
        this.ui = ui;
        this.y = y;
        this.diameter = diameter;
        this.chart = chart;
        radius = diameter / 2;
    }   //new Barchart(this, width, height, width*.1f, 0);
    
    public void render()
    {
        ui.stroke(255);
        ui.line(diameter, y - diameter, diameter*6 - (diameter *.7f), y - diameter);
        
        for (int i = 0; i < 9; i ++ ) {
            ui.fill(ui.map(i, 0, 9, 0, 255), 255, 255);
            ui.rect(diameter + radius * i, y - diameter, 30, chart - i * 8);
            
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
