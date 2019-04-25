package ie.tudublin;

import processing.core.PApplet;

public class Button
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private String text;

    public Button(UI ui, float x, float y, float width, float height, String text)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;
    }

    public void render()
    {
        button_1();
    }

    public void button_1() {
        ui.noFill();
        ui.stroke(255);
        ui.ellipse(200, 340, 40, 40);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
    }
    public void base() {
        ui.noFill();
        ui.stroke(255);
        ui.ellipse(400, 340, 40, 40);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
    }

}