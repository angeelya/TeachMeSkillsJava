package work30.home.proxy;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ObjectImage implements Image {
    private String name;
    private String path = "src/work30/home/proxy/";
    private BufferedImage image;

    public ObjectImage(String name) {
        this.name = name;
        loadImage();
    }

    private void loadImage() {
        try {
            image = ImageIO.read(new File(path + name));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void display() {
        if (image != null) {
            JFrame jFrame = new JFrame();
            JLabel jLabel = new JLabel(new ImageIcon(image));
            jFrame.getContentPane().add(jLabel, BorderLayout.CENTER);
            jFrame.pack();
            jFrame.setVisible(true);
        } else System.out.println("Can't display image");
    }
}
