package Alexandr_Nikitchenko;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Александр Никитченко on 05.01.2017.
 */


    public class Logic implements ActionListener {

    //Объявление переменных
    Reader parent;
    double result = 0;

    // Создаем конструктор который принимает функции из класса Reader
    Logic(Reader parent) {
        this.parent = parent;
    }

    // Создание слушателя
    @Override
    public void actionPerformed(ActionEvent e) {

        //Создаем обработчик ошибок
        try {
            // Преобразуем в строку данные введенные в дисплей
            String dispFieldText = parent.displayed.getText();
            double displayValue;
            displayValue = Double.parseDouble(dispFieldText);

            // Создаем источник ввода
            Object src = e.getSource();

            // Если нажата RadioButton1 и кнопка Конвертировать то:
            if (parent.r1.isSelected() && src == parent.buttonConvert ) {

                // Создаем строку в поле l3 и выводим решение в поле l4
                String b;
                b = "Ваша температура в Фаренгейтах равна: ";
                parent.l3.setText(b);
                result = displayValue * 1.8 + 32;
                String a = "" + result + "F";
                parent.l4.setText(a);

                // Иначе если нажата RadioButton2 и кнопка Конвертировать то
            } else if (parent.r2.isSelected() && src == parent.buttonConvert) {

                // Создаем строку в поле l3 и выводим решение в поле l4
                String b;
                b = "Ваша температура в Цельсиях равна: ";
                parent.l3.setText(b);
                result = (displayValue - 32) * 5 / 9;
                String a = "" + result + "C";
                parent.l4.setText(a);
            }

            // Исключение: Если нажата RadioButton1 и RadioButton2 и кнопка Конвертировать то:
            if (parent.r2.isSelected() && parent.r1.isSelected() && src == parent.buttonConvert) {

                // Выдать на экран предупреждение и очистить дисплей и поля l3 и l4
                JOptionPane.showMessageDialog(null, "Выберите один из методов рассчета!");
                parent.displayed.setText(null);
                parent.l3.setText(null);
                parent.l4.setText(null);
                }

                // Если нажата кнопка Сброс то:
            if (src == parent.buttonReset) {

                // Очистить дисплей и поля l3 и l4
                    parent.displayed.setText(null);
                    parent.l3.setText(null);
                    parent.l4.setText(null);
                }
            }catch(Exception e1){

            // При возникновении ошибок в программе: Очистить дисплей
            parent.displayed.setText(null);
        }

        }

    }


