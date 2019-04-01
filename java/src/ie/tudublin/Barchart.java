package ie.tudublin;

import processing.core.PApplet;
import processing.core.PVector;

public class Barchart extends UI
{
    private float radius;
    private PVector pos;
    private float frequency;
    private UI ui;
    private float theta = 0;

    public Barchart()
    {

    }

    public void render()
    {
        ellipse(ui.width/2, ui.height/2, 40, 40);
    }


    public void update()
    {

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