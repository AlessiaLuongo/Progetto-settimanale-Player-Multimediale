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
        this.volume = getVolume();
    }



    //GETTER AND SETTER
    public int getDuration() {
        return duration;
    }


    public int getVolume() {
        for (int i = 0; i < duration; i++) {
        }
        return (10);
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }



// INTERFACES
    @Override
    public void play() {
        for (int i = 0; i < duration; i++) {
            System.out.println("Stai ascoltando: " + title + "a volume: " + volume);
        }


    };

    @Override
    public void volumeUp() {

    }

    @Override
    public void VolumeDown() {

    }

    @Override
    public String toString() {
        return "Song{" +
                "duration=" + duration +
                ", volume=" + volume +
                ", title='" + title + '\'' +
                '}';
    }
}
