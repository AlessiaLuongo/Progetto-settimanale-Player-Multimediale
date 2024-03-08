import entities.Audio;
import entities.ElementMultimedia;
import entities.Image;
import entities.Video;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
    Audio canzone1 = new Audio("Heaven and Hell", 3);
    Audio canzone2 = new Audio("Mr Crowley", 7);
    Audio canzone3 = new Audio("Jailhouse Rock", 4);
    Video video1 = new Video("Bat out of Hell", 4);
    Video video2 = new Video("Paradise By the Dashboard Light", 10);
    Video video3 = new Video("Suspicious Minds", 10);
    Image image1 = new Image("Black Sabbath");
    Image image2 = new Image("MeatLoaf");
    Image image3 = new Image("Elvis Presley");

    ElementMultimedia[] multimediaDatabase = {canzone1, canzone2, canzone3, video1, video2, video3, image1, image1, image2, image3}; */
    String[] playList = new String[5];
    int currentFilesInArray = 0;
    while (currentFilesInArray < 5){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which kind of file are you searching for? Type -v- for Video, -s- for Song or -i- for Image or -x- for Exit");
        String typeOfFile = scanner.nextLine();
        switch (typeOfFile){
            case "v":
                System.out.println("Enter Video name: ");
                System.out.println("Enter Video duration: ");
                playList[currentFilesInArray] = String.valueOf(new Video(scanner.nextLine(), scanner.nextInt()));
                currentFilesInArray++;
                System.out.println("video");break;
            case "s":
                System.out.println("Enter Song name: ");
                System.out.println("Enter Song duration: ");
                playList[currentFilesInArray] = String.valueOf(new Audio(scanner.nextLine(), scanner.nextInt()));
                currentFilesInArray++;
                System.out.println("Song");break;
            case "i":
                System.out.println("Enter Image name: ");
                playList[currentFilesInArray] = String.valueOf(new Image(scanner.nextLine()));
                currentFilesInArray++;
                System.out.println("Image");break;
            case "x":
                System.out.println("Exit");break;
            default:
                System.out.println("BRAV* you broke the player!");
                break;
        }
    }

        System.out.println("Your Playlist:");
        for (int i = 0; i < playList.length; i++) {
            System.out.println(playList[i]);
        }
        }
    }
