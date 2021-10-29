import processing.core.PApplet;

public class Main extends PApplet {

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public void settings() {
        //origin coordinate is (0, 0) which starts in the top left corner of screen
        size(600, 600);
    }

    public void setup() {
        //background color of canvas
        background(0);
    }

    public void draw() {
        //draw method is constantly being drawn, specifically at 60 frames per second
        int framePerSecond = frameCount % 60;

        float colorValueShift = ((float) framePerSecond / 60) * 255;

        stroke(255, 0, 0);
        fill(colorValueShift,255 - colorValueShift, 255 - colorValueShift);

        //rect(x, y, width, height) draws (x, y) as top left corner of rect
        rect(0, 0, 50, 100);

        //ellipse(x, y, width, height) draws (x, y) as middle point of ellipse
        ellipse(25, 125, 50, 50);

        //stroke value is stored and maintained in next frame (persistent)
        stroke(255, 255, 255);
        line(502, 256, 200, 150);
    }
}