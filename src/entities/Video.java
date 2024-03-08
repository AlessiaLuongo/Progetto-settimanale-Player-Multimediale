package entities;

import interfaces.Playable;
import interfaces.Visible;

public class Video extends ElementMultimedia implements Playable, Visible {
    private int duration;
    private int volume;
    private int brightness;

    public Video(String title) {
        super(title);
    }

    public Video(String title, int duration) {
        super(title);
        this.duration = duration;
        this.volume = 10;
        this.brightness = 10;
    }

    //GETTERS AND SETTERS

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

//INTERFACES
    @Override
    public void play() {
        String howMuchVolume = "";
        for (int i = 0; i < volume; i++) {
            howMuchVolume = howMuchVolume + "!";
        }
        String howMuchBrightness = "";
        for (int i = 0; i < brightness; i++) {
            howMuchBrightness = howMuchBrightness + "*";
        }
        for (int i = 0; i < duration; i++) {
            System.out.println("You're watching: " + title + " at volume: " + howMuchVolume + " and brigntness: " + howMuchBrightness);
        }
    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void VolumeDown() {

    }

    @Override
    public void brightnessUp() {

    }

    @Override
    public void brightnessDown() {

    }

    @Override
    public String toString() {
        return "Video{" +
                "duration=" + duration +
                ", volume=" + volume +
                ", brightness=" + brightness +
                ", title='" + title + '\'' +
                '}';
    }
}
