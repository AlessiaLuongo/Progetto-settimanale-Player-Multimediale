package entities;

import interfaces.Playable;
import interfaces.Visible;

import java.util.Scanner;

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
        System.out.println("Do you want to reduce the volume of: " + numberToVolumeDown + "? (y/n)");

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
    public void brightnessUp() {
        int currentBrightness = this.brightness;

        System.out.println("Insert a number to increase the brightness:");
        Scanner scannerBrightnessUp = new Scanner(System.in);
        int numberToBrightnessUp = scannerBrightnessUp.nextInt();
        System.out.println("Do you want to increase the brightness of: " + numberToBrightnessUp + "? (y/n)");

        Scanner scannerYesOrNoQuestion = new Scanner(System.in);
        String answer = scannerYesOrNoQuestion.nextLine();

        if (answer.equals("y")) {
            if (currentBrightness + numberToBrightnessUp >= 10) {;
                System.out.println("Brightness at maximum, set at 10");
                setBrightness(10);
            } else{
                int newBrightness = currentBrightness + numberToBrightnessUp;
                this.brightness = newBrightness;
                setBrightness(newBrightness);
                System.out.println("Brightness set at " + newBrightness);
            }
        } else {
            System.out.println("Cancel");
        }


    }

    @Override
    public void brightnessDown() {
        int currentBrightness = this.brightness;

        System.out.println("Insert a number to reduce the brightness of this Video:");
        Scanner scannerBrightnessDown = new Scanner(System.in);
        int numberToBrightnessDown = scannerBrightnessDown.nextInt();
        System.out.println("Do you want to reduce the brightness of this Video: " + numberToBrightnessDown + "? (y/n)");

        Scanner scannerYesOrNoQuestion = new Scanner(System.in);
        String answer = scannerYesOrNoQuestion.nextLine();

        if (answer.equals("y")) {
            if (currentBrightness + numberToBrightnessDown >= 0) {;
                System.out.println("Brightness at minimum, set at 0");
                setBrightness(0);
            } else{
                int newBrightness = currentBrightness + numberToBrightnessDown;
                this.brightness = newBrightness;
                setBrightness(newBrightness);
                System.out.println("Brightness set at " + newBrightness);
            }
        } else {
            System.out.println("Cancel");
        }

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
