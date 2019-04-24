package ie.tudublin;

import processing.core.PApplet;

public class Window
{
    UI ui;
    private float gap;
    private float xZ;
    private float count = 100;
    private float colour1 = 255;
    private float colour2 = 255;
    private float colour3 = 255;
    private float x;
    private float y;
    private float z;
    private  static float red;
    private  static float blue;

    public Window(UI ui, float gap, float xZ)
    {
        this.ui = ui;
        this.gap = gap;
        this.xZ = xZ;

        x = ui.random(0, xZ);
        y = ui.random(0, xZ);
        z = ui.random(0, xZ);

    }

    public void render()
    {
       //Outline for colour box.
       red = ui.map(ui.mouseX, 0, ui.width, 0, 255);
       blue = ui.map(ui.mouseX, 0, ui.width, 255, 0);
       ui.fill(blue,red,red);
       ui.rect( gap*.5f, gap*.5f, xZ -gap, gap*.3f);
       //Drawing Dinosaur box.
       ui.stroke(127, 127, 127);
       ui.strokeWeight(3);
       ui.fill(blue,red,red);
       ui.rect(gap - (gap*.3f), gap, ui.width - gap * 2, ui.height - 350);
       ui.fill(0);
       ui.rect(gap - (gap*.3f), gap, ui.width - gap * 2, ui.height - 350, 80, 80, 80 ,80);
       
       //ui.ellipse(ui.width - gap, ui.height - gap/3, 25, 25);
    }

    public void update()
    {
        if( ui.frameCount > count) {
            count += 100;
            colour1 = ui.random(0, 255); colour2 = ui.random(0, 255); colour3 = ui.random(0, 255);
        }
    }
}