package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Radar
{
    private float radius;
    private PVector pos;
    private float frequency;
    private float colour1 = 255;
    private float colour2 = 255;
    private float colour3 = 255;
    private float count = 100;
    private UI ui;
    private float theta = 0;

    public Radar(UI ui, float frequency, float x, float y, float radius)
    {
        this.ui = ui;
        this.frequency = frequency;
        pos = new PVector(x, y);
        this.radius = radius;
    }

    public void render()
    {
        ui.fill(colour2, colour3, colour1);
        ui.ellipse(pos.x, pos.y, radius * 2, radius * 2);
        float x2 = pos.x + (float) Math.sin(theta) * radius;
        float y2 = pos.y - (float) Math.cos(theta) * radius;
        ui.line(pos.x, pos.y, x2, y2);
        
        ui.strokeWeight(2);
        ui.fill(colour1, colour2, colour3);
        ui.triangle(560, 580, 570, 560, 580, 580 );
        ui.fill(colour3, colour2, colour1);
        ui.square(500, 561, 20);    
    }

    float timeDelta = 1.0f / 60.0f;

    public void update()
    {
        theta += PApplet.TWO_PI * timeDelta * frequency;
        if( ui.frameCount > count) {
            count += 100;
            colour1 = ui.random(0, 255); colour2 = ui.random(0, 255); colour3 = ui.random(0, 255);
        }
    }

    /**
     * @return the radius
     */
    public float getRadius() {
        return radius;
    }

    /**
     * @param radius the radius to set
     */
    public void setRadius(float radius) {
        this.radius = radius;
    }

    /**
     * @return the pos
     */
    public PVector getPos() {
        return pos;
    }

    /**
     * @param pos the pos to set
     */
    public void setPos(PVector pos) {
        this.pos = pos;
    }

    /**
     * @return the frequency
     */
    public float getFrequency() {
        return frequency;
    }

    /**
     * @param frequency the frequency to set
     */
    public void setFrequency(float frequency) {
        this.frequency = frequency;
    }

    
}