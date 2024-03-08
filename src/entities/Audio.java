package entities;

import interfaces.Playable;

import java.util.Objects;
import java.util.Scanner;

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


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }



// INTERFACES
    @Override
    public void play() {
        String howMuchVolume = "";
        for (int i = 0; i < volume ; i++) {
            howMuchVolume = howMuchVolume + "!";

        }
        for (int i = 0; i < duration; i++) {
            System.out.println("You're listening to: " + title + " at volume: " + howMuchVolume);
        }


    };

    @Override

    public void volumeUp() {
        int currentVolume = this.volume;

        System.out.println("Insert a number to volume up:");
        Scanner scannerVolumeUp = new Scanner(System.in);
        int numberToVolumeUp = scannerVolumeUp.nextInt();
        System.out.println("Do you want to increase the volume of: " + numberToVolumeUp + "? (y/n)");

        Scanner scannerYesOrNoQuestion = new Scanner(System.in);
        String answer = scannerYesOrNoQuestion.nextLine();

        if (answer.equals("y")) {
            if (currentVolume + numberToVolumeUp >= 10) {;
                System.out.println("Volume at maximum, set at 10");
                setVolume(10);
            } else{
                int newVolume = currentVolume + numberToVolumeUp;
                this.volume = newVolume;
                setVolume(newVolume);
                System.out.println("Volume set at " + newVolume);
            }
        } else {
            System.out.println("Cancel");
        }
    }

    @Override
    public void volumeDown() {
        int currentVolume = this.volume;

        System.out.println("Insert a number to volume down:");
        Scanner scannerVolumeDown = new Scanner(System.in);
        int numberToVolumeDown = scannerVolumeDown.nextInt();
        System.out.println("Do you want to reduce the volume of : " + numberToVolumeDown + "? (y/n)");

        Scanner scannerYesOrNoQuestion = new Scanner(System.in);
        String answer = scannerYesOrNoQuestion.nextLine();

        if (answer.equals("y")) {
            if (currentVolume - numberToVolumeDown <= 0) {;
                System.out.println("volume at minimum, set at 0");
                setVolume(0);
            } else{
                int newVolume = currentVolume - numberToVolumeDown;
                this.volume = newVolume;
                setVolume(newVolume);
                System.out.println("Volume set at " + newVolume);
            }
        } else {
            System.out.println("Cancel");
        }

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
