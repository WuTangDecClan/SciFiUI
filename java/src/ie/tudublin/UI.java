package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button b;
    MovingCircle mc;

    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()
    {
        size(800, 800);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(P3D); 
    }

    public void setup()
    {
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, width / 2, height * .75f, 50);
        radar = new Radar(this, 1, width / 2, height / 2, 100);
    }

    Radar radar;

    public void draw()
    {
        background(0);
        b.render();

        mc.update();
        mc.render();

        radar.update();
        radar.render();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
        
        //Drawing Dinosaur box 
        
        fill(0,77,0);
        noStroke();
        rect(70, 100, 350, 250, 0, 0, 50 ,50);
        
        for( int i = 0; i < 11; i ++) {
            fill(255,255,0);
            rect(70, 60, 100, 20);
        }
        fill(0,250,250);
        rect(70, 80, 350, 20);

    }
}

