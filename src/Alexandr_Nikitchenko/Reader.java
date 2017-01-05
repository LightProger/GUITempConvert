package Alexandr_Nikitchenko;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Александр Nikitchenko on 05.01.2017.
 */
public class Reader extends JFrame{

    //Объявление переменных
    JPanel p1, p2, p3;
    JRadioButton r1, r2;
    JButton buttonReset;
    JButton buttonconvert;
    JLabel l1; JLabel l2; JLabel l3; JLabel l4;
    JTextField displayfield;


    public Reader(String s){
        super(s);

        // Создаем панели и схему расположения
        p1 = new JPanel();
        GridLayout gl1 = new GridLayout(1, 3, 1, 1);
        p1.setLayout(gl1);


        // Создание текстового поля и кнопок выбора
        l1 = new JLabel("Выберите метод:");
        l2 = new JLabel("Введите температуру: ");
        l3 = new JLabel("");
        l4 = new JLabel("");
        displayfield = new JTextField(5);
        r1 = new JRadioButton("Цельсий");
        r2 = new JRadioButton("Фаренгейт");
        buttonReset = new JButton("Сброс");
        buttonconvert = new JButton("Конвертировать");

        //Добавление созданных компонентов на панель
        p1.add(l1);
        p1.add(r1);
        p1.add(r2);
        add("North", p1);

        //Создаем панель и схему расположения
        p2 = new JPanel();
        GridLayout gl = new GridLayout( 2, 2, 10, 10);
        p2.setLayout(gl);

        //Добавляем текстовое поле и поле ввода
        p2.add(l2);
        p2.add(displayfield);
        p2.add(l3);
        p2.add(l4);
        add("Center", p2);

        //Создаем новую панель
        p3 = new JPanel();

        //Добавляем на панель кнопку
        p3.add(buttonconvert);
        p3.add(buttonReset);
        add("South", p3);

        //Передача функций в класс Logyc
        Logyc lc = new Logyc(this);
        r1.addActionListener(lc);
        r2.addActionListener(lc);
        buttonconvert.addActionListener(lc);
        buttonReset.addActionListener(lc);
    }

}
