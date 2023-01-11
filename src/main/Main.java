package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame window=new JFrame(); // nueva ventana
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //para que al hacer clic en la x se detenga la ejecucion
        window.setResizable(false); //para que no se pueda modificar el tamaño de la ventana
        window.setTitle("Aventuras en 2D"); // titulo del programa

        GamePanel gamePanel = new  GamePanel();
        window.add(gamePanel);

        window.pack();

        window.setLocationRelativeTo(null); // para que la ventana se ejecute en el centro de la pantalla por defecto
        window.setVisible(true);//para que se vea la pantalla

        gamePanel.setupGame();
        gamePanel.startGameThread();




    }
}