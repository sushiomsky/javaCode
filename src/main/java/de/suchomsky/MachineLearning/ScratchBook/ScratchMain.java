package de.suchomsky.MachineLearning.ScratchBook;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sushi on 16.03.17.
 */
public class ScratchMain {
    public static void main(String[] args) {
        List<String> results = new ArrayList<String>();
        BufferedImage img = null;

        File[] files = new File("/home/sushi/Downloads/smsgott/").listFiles();
        //If this pathname does not denote a directory, then listFiles() returns null.

        for (File file : files) {
            if (file.isFile()) {
                results.add(file.getName());
                System.out.println(file.getName());

                try {
                    img = ImageIO.read(new File("/home/sushi/Downloads/smsgott/" + file.getName()));
                } catch (IOException e) {

                }
            }
        }

    }

}
