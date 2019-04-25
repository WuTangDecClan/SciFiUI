package ie.tudublin;

import processing.core.PApplet;

public class Window
{
    UI ui;
    private float gap;
    private float xZ;
    private float xR = gap*.5f;

    private static float red;
    private static float blue;

    public Window(UI ui, float gap, float xZ)
    {
        this.ui = ui;
        this.gap = gap;
        this.xZ = xZ;
    }

    public void render()
    {
        colourMouse();
        colourBox();
        bigBox();
    }

    public void update() {

    }
    
    public void colourMouse() {
        //Outline for colour box.
       red = ui.map(ui.mouseX, 0, ui.width, 0, 255);
       blue = ui.map(ui.mouseX, 0, ui.width, 255, 0);
    }
    public void colourBox() {
       
       ui.fill(blue,red,red);
       //Drawing colour bar above.
       ui.rect( gap*.5f, gap*.5f, xZ -gap, gap*.3f);
    }

    public void bigBox() {
        
        //Drawing Big box & outer box.
       ui.stroke(127, 127, 127);
       ui.strokeWeight(3);
       ui.fill(blue,red,red);
       ui.rect(gap - (gap*.3f), gap, ui.width - gap * 2, ui.height - 350);
       ui.fill(0);
       ui.rect(gap - (gap*.3f), gap, ui.width - gap * 2, ui.height - 350, 80, 80, 80 ,80);
    
    }
}