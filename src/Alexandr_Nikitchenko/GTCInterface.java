package Alexandr_Nikitchenko;

import javax.swing.*;

public class GTCInterface {

    public static void main(String[] args) {

        Reader s = new Reader("Температурный конвертер");

        // Размер окна
        s.setSize(500, 140);

        //Делаем окно видимым
        s.setVisible(true);

        //Запрещаем изменять размер окна
        s.setResizable(false);

        // Создаем расположение окна по центру
        s.setLocationRelativeTo(null);

        //Действие при закрытии окна
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}


