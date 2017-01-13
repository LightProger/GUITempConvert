package Alexandr_Nikitchenko;

/* Программа температурный конвертер
Автор: Александр Никитченко
 */

import javax.swing.*;
import java.awt.*;

public class GTCInterface {

    public static void main(String[] args) {

        // Создание объекта
        GTCInterface gti = new GTCInterface ();

    }

        //Объявление переменных
    JPanel p1, p2, p3;
    JRadioButton r1, r2;
    JButton buttonReset;
    JButton buttonConvert;
    JLabel l1, l2, l3, l4;
    JTextField displayed;

        // Создание конструктора
    GTCInterface() {

         // Создание панели
        p1 = new JPanel ( );
        p1.setLayout ( new GridLayout (1, 3 ) );

         // Создание текстового поля
         l1 = new JLabel ( "Выберите метод:" );

        // Добавление текстового поля на панель
         p1.add(l1);

         // Создание кнопок
         r1   = new JRadioButton("Цельсий");
         r1.setSelected ( true );
         r2    = new JRadioButton("Фаренгейт");

         // Группирование кнопок
         ButtonGroup bgroup = new ButtonGroup();
         bgroup.add(r1);
         bgroup.add(r2);

         // Добавление кнопок на панель
         p1.add(r1);
         p1.add(r2);

         // Создание новой панели
         p2 = new JPanel (  );
         p2.setLayout ( new GridLayout ( 3,2 ) );

         // Добавление компонентов на панель
         l2 = new JLabel ( "Введите температуру: " );
         p2.add(l2);

         // Создаем дисплей
         displayed = new JTextField ( 5 );
         p2.add(displayed);

         l3 = new JLabel ( "" );
         l4 = new JLabel ( "" );
         p2.add ( l3 );
         p2.add ( l4 );

        //Создаем новую панель
        p3 = new JPanel ();
        p3.setLayout (new GridLayout ( 1, 2 ) );

        // Создаем кнопки
        buttonReset = new JButton ( "Сброс" );
        buttonConvert = new JButton ( "Конвертировать" );

        //Добавляем на панель кнопки
        p3.add ( buttonConvert );
        p3.add ( buttonReset );


        // Создание окна
         JFrame frame = new JFrame ( "Температурный конвертер" );

         // Размер окна
         frame.setSize ( 500, 140 );

         //Делаем окно видимым
         frame.setVisible ( true );

         //Запрещаем изменять размер окна
         frame.setResizable ( false );

         // Создаем расположение окна по центру
         frame.setLocationRelativeTo ( null );

         // Добавление панелей в окно
         frame.add ( "North", p1 );
         frame.add ( "Center", p2 );
         frame.add ( "South", p3 );

         //Действие при закрытии окна
         frame.setDefaultCloseOperation ( WindowConstants.EXIT_ON_CLOSE );

        //Передача функций в класс Logic
        Logic lc = new Logic ( this );
        r1.addActionListener ( lc );
        r2.addActionListener ( lc );
        buttonConvert.addActionListener ( lc );
        buttonReset.addActionListener ( lc );
    }
    }





