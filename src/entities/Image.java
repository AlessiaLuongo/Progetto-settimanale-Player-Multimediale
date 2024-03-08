package entities;

import interfaces.Visible;

public class Image extends ElementMultimedia implements Visible {
    private int brightness;

    public Image(String title) {
        super(title);
        this.brightness = 10;
    }

    public void show(){

        System.out.println("This is the picture of: " + title + "at brigntness " + brightness);
}

    //GETTERS AND SETTERS

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    @Override
    public String toString() {
        return "Image{" +
                "brightness=" + brightness +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public void brightnessUp() {

    }

    @Override
    public void brightnessDown() {

    }
}
