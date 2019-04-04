package ie.tudublin;

import processing.core.PApplet;

public class Dino
{
    UI ui;
    private float gap;
    private float square;
    private float colorBars;
    private float xBars;
    private float randomColor;

    public Dino(UI ui)
    {
        this.ui = ui;
    }

    public void render()
    {
        gap = ui.width/100;
        square = (ui.height / 2) -50;
        colorBars = 350f/11f;
        xBars = 70;
       //Drawing Dinosaur box.
       ui.fill(0,222,0);
       ui.rect(70, 100, square, 250, 0, 0, 50 ,50);
       
       //Drawing color box above Dinosaur box.
       for(int i = 0; i < 11; i++) {    //loop creating top bar.
        ui.fill(randomColor);
        ui.rect(xBars, 80, colorBars, 20);
        xBars = xBars + colorBars;
       }

    }

    public void update()
    {

    }
}