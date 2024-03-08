package entities;

import interfaces.Playable;

public class Audio extends ElementMultimedia implements Playable {
    private  int duration;
    private int volume;

    public Audio(String title) {
        super(title);
    }

    public Audio(String title, int duration) {
        super(title);
        this.duration = duration;
        this.volume = 10;
    }



    //GETTER AND SETTER
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



// INTERFACES
    @Override
    public void play() {

    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void VolumeDown() {

    }

    @Override
    public String toString() {
        return "Audio{" +
                "duration=" + duration +
                ", volume=" + volume +
                ", title='" + title + '\'' +
                '}';
    }
}
