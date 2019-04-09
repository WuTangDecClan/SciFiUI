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
        
       //Drawing Dinosaur box.
       ui.fill(0,222,0);
       ui.rect(gap - (gap*.3f), gap, ui.width/2f, ui.height/3, 0, 0, 50 ,50);
       
    }

    public void update()
    {

    }
}