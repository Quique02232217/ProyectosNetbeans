/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.imagenleer;

import javax.imageio.*;
import java.io.*;
import java.awt.image.*;

public class ImagenLeer {

    BufferedImage imagen = null;

    public void leerArchivo() {
        try {
            File imagen_leer = new File("C://Users/User/Desktop/1.png");
            imagen = ImageIO.read(imagen_leer);
            System.out.println("SE HA LEIDO CORRECTAMENTE");
            ImageIO.write(imagen, "png", new File("C://Users/User/Desktop/copia.png"));
            System.out.println("SE HA ESCRITO CORRECTAMENTE");

        } catch (Exception e) {
            System.out.println("ERROR");

        }

    }

    public static void main(String[] args) {
        new ImagenLeer().leerArchivo();

    }
}
