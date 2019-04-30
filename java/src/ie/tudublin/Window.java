package ie.tudublin;

import processing.core.PImage;

public class Window
{
    UI ui;
    private float gap;
    private float xZ;
    private float xR = gap * .5f;

    private static float red;
    private static float blue;
    PImage webImg2;
    PImage webImg3;

    public Window(UI ui, float gap, float xZ) {
        this.ui = ui;
        this.gap = gap;
        this.xZ = xZ;
        
        String url2 = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Devils_Tower_Wyoming.jpg/1200px-Devils_Tower_Wyoming.jpg";
        String url3 = "https://airandspace.si.edu/sites/default/files/images/collection-objects/record-images/A19790906000d7.jpg";
        webImg2 = ui.loadImage(url2, "jpg");
        webImg3 = ui.loadImage(url3, "jpg");
    }

    /**
     * @return the xR
     */
    public float getxR() {
        return xR;
    }

    /**
     * @param xR the xR to set
     */
    public void setxR(float xR) {
        this.xR = xR;
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
       
        ui.fill(red,blue,blue);
       //Drawing colour bar above.
       ui.rect( gap*.5f, gap*.5f, xZ -gap, gap*.3f);
       ui.rect( gap*.5f, ui.height/2 + gap*.3f, xZ -gap, gap*.3f);
       ui.rect( gap*.5f, ui.height/2 + gap*.7f, xZ -gap, gap*.3f);
    }

    public void bigBox() {
    
        //Drawing Big box & outer box.
       ui.stroke(127, 127, 127);
       ui.strokeWeight(3);
       ui.fill(blue,red,red);
       ui.rect(gap - (gap*.3f), gap, ui.width - gap * 2, ui.height - 350);
       ui.fill(0);
       ui.rect(gap - (gap*.3f), gap, ui.width - gap * 2, ui.height - 350, 80, 80, 80 ,80);
       if (ui.checkKey('w'))
        {
            ui.image(webImg2,160,70, 240, 230);     
        } else {
            ui.image(webImg3, 160, 70, 240 ,230);
        }
    }
}