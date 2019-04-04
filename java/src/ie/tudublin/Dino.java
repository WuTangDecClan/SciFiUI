package ie.tudublin;

import processing.core.PApplet;

public class Dino
{
    UI ui;
    private float colorBars;

    public Dino(UI ui)
    {
        this.ui = ui;
    }

    public void render()
    {
        colorBars = 70;
       //Drawing Dinosaur box.
       ui.fill(0,222,0);
       ui.rect(70, 100, 350, 250, 0, 0, 50 ,50);
       
       //Drawing color box above Dinosaur box.
       for(int i = 0; i < 11; i++) {
            
            ui.rect(colorBars, 70, 350/11, 30);
            colorBars += 70;
       }

    }

    public void update()
    {

    }
}