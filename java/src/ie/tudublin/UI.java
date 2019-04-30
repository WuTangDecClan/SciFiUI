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
    Star[] stars = new Star[1000];    
    //Declaring variables.
    float outln = 10;
    int counter = 2;
    int backdropp = 165;

    boolean[] keys = new boolean[1024];

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

    public void settings() {
        size(600, 600);
    }

    public void setup() {
        colorMode(HSB);  //Changing colour mode.
        //Creating instances of the classes.
        if ( counter % 2 == 0) {
            radar = new Radar(this, 1, width - 60 , height - 30, 10);
            bars = new MovingBar(this, (outln * 4), height - (outln * 2), (height/4f) * -1, width * .8f);
            view = new Window(this, width * .1f, width);
            b = new Button(this, 50, 50, 100, 50, "Nigga");
            
            for( int i = 0; i < stars.length; i++) {
                stars[i] = new Star(this);  
            }
        }
    }

    public void draw() {
        background(0,0,backdropp); //Setting the backdrop to a grey.
        if ( counter % 2 == 0) {
            backdrop(); //Calling backdrop() method.
            //calling object methods.
            radar.update();
            radar.render();

            bars.update();
            bars.render();

            view.update();
            view.render();
        }
        
        if ( counter % 2 != 0 ) {
            translate(width/2, height/2);
            for( int i = 0; i < stars.length; i++) {
                stars[i].render();
                stars[i].update();
                stars[i].show();  
            }
        }

    }
    
    public void mousePressed() {
        background(0);    
        counter ++;
        if ( backdropp == 165){
            backdropp = 0;
        } else {
            backdropp = 165;
        }
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

