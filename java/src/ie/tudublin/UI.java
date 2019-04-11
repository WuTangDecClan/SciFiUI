package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button b;
    Dna mc;
    Dino dc;
    Barchart st;
    boolean[] keys = new boolean[1024];
    float outln;

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = false;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()
    {
        size(800, 600);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(P3D); 
    }

    public void setup()
    { 
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new Dna(this, width - width*.20f, 5, 5);
        radar = new Radar(this, 1, width / 2, height / 2, 100);
        dc = new Dino(this);
        st = new Barchart(this, width/2, height, width*.1f, 0);
    }

    Radar radar;

    public void draw()
    {
        background(165, 165, 165);
        backdrop();
        b.render();

        mc.update();
        mc.render();

        dc.update();
        dc.render();

        st.render();
        st.update();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }

    }
    public void backdrop() {
        outln = 10;
        stroke(127, 127, 127);
        strokeWeight(3);
        //This is drawing the outer lines of the UI.
        line(outln, outln, width - outln, outln);
        line(outln, outln, outln, height - outln);
        line(outln, height - outln, width - outln, height - outln);
        line(width - outln, height - outln, width - outln, outln);

        line( (outln * 2), outln, (outln * 2), height - (outln * 2) );
        line( (outln * 2), height - (outln * 2), width * .8f, height - (outln * 2) ); 
        line( width * .8f, height - (outln * 2), width * .8f + outln, height - (outln * 5) );
        line( width * .8f + outln, height - (outln * 5), width - outln  ,height - (outln * 5) );
    }
}

