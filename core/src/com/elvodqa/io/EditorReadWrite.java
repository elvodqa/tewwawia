package com.elvodqa.io;

import java.io.File;
import java.io.IOException;

public class EditorReadWrite {

    public EditorReadWrite() {

    }

    public static void writeFile() {
        
    }

    public static void createMap(String songName) {
        try {
            File songsFolder = new File("Songs");
            File mapFolder = new File("Songs/" + songName);
            File songFile = new File(songName + 1 + ".bsu");

            if (songsFolder.mkdir()) {
                System.out.println("Songs folder created / It didn't exist before.");
            }
            else {
                System.out.println("Songs folder already exists");
            }

            if (mapFolder.mkdir()) {
                System.out.println("Map folder folder created / It didn't exist before.");
            }
            else {
                System.out.println("Map folder already exists");
            }

            if (songFile.createNewFile()) {
                System.out.println("File created: " + songFile.getName());
            } else {
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
