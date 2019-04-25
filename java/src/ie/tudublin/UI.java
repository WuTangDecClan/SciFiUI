package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    //Declaring objects.
    Button b;
    MovingCircle mc; 
    Radar radar;
    MovingBar bars;
    Window view;
    
    //Declaring variables.
    float outln = 10;

    public void settings() {
        size(600, 600);
    }

    public void setup() {
        colorMode(HSB);  //Changing colour mode.
        //Creating instances of the classes.
        radar = new Radar(this, 1, width - 60 , height - 30, 10);
        bars = new MovingBar(this, (outln * 4), height - (outln * 2), (height/4f) * -1, width * .8f);
        view = new Window(this, width * .1f, width);
        
    }

    public void draw() {
        background(0,0,165); //Setting the backdrop to a grey.
        backdrop(); //Calling backdrop() method.

        //calling object methods.
        radar.update();
        radar.render();

        bars.update();
        bars.render();

        view.update();
        view.render();

    }

    //backdrop() method.
    public void backdrop() {
        
        stroke(127, 127, 127);
        strokeWeight(3);
        //This is drawing the outer lines of the UI.
        line(outln, outln, width - outln, outln);
        line(outln, outln, outln, height - outln);
        line(outln, height - outln, width - outln, height - outln);
        line(width - outln, height - outln, width - outln, outln);
        //Drawing more lines to the screen.
        line( (outln * 2), outln, (outln * 2), height - (outln * 2) );
        line( (outln * 2), height - (outln * 2), width * .8f, height - (outln * 2) ); 
        line( width * .8f, height - (outln * 2), width * .8f + outln, height - (outln * 5) );
        line( width * .8f + outln, height - (outln * 5), width - outln  ,height - (outln * 5) );
    }
}

