import entities.Audio;
import entities.Image;
import entities.Video;

public class Main {
    public static void main(String[] args) {
    Audio canzone1 = new Audio("Heaven and Hell", 5);
    Audio canzone2 = new Audio("Mr Crowley", 7);
    Video video1 = new Video("Bat out of Hell", 8);
    Video video2 = new Video("Paradise By the Dashboard Light", 10);
    Image image1 = new Image("Black Sabbath");
    Image image2 = new Image("MeatLoaf");

        canzone1.play();
    }
}