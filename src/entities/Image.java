package entities;

import interfaces.Visible;

import java.util.Scanner;

public class Image extends ElementMultimedia implements Visible {
    private int brightness;

    public Image(String title) {
        super(title);
        this.brightness = 10;
    }

    public void show(){
        String howMuchBrightness = "";
        for (int i = 0; i < brightness; i++) {
            howMuchBrightness = howMuchBrightness + "*";
        }

        System.out.println("This is the picture of: " + title + " at brigntness " + howMuchBrightness);
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

        System.out.println("Insert a number to reduce the brightness: ");
        Scanner scannerBrightnessDown = new Scanner(System.in);
        int numberToBrightnessDown = scannerBrightnessDown.nextInt();
        System.out.println("Do you want to reduce the brightness of this Image: " + numberToBrightnessDown + "? (y/n)");

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
}
