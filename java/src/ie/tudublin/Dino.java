package ie.tudublin;

import processing.core.PApplet;

public class Dino
{
    UI ui;
    private float gap;

    public Dino(UI ui)
    {
        this.ui = ui;
    }

    public void render()
    {
       gap = ui.width * .1f;
       
       //Outline for big box.
       ui.rect( gap*.5f, gap*.5f, gap*5.5f, ui.height - (ui.height/8) );
       //Drawing Dinosaur box.
       ui.stroke(127, 127, 127);
       ui.strokeWeight(3);
       ui.fill(0);
       ui.rect(gap - (gap*.3f), gap, ui.width/2f, ui.height/3, 0, 0, 50 ,50);
       
    }

    public void update()
    {

    }
}