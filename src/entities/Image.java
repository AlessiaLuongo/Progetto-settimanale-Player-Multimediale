package entities;

public class Image extends ElementMultimedia {
    private int brightness;
    public Image(String title) {
        super(title);
    }

    public Image(String title, int brightness) {
        super(title);
        this.brightness = brightness;
    }

    public String show(){
        return null;
    };

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
}
