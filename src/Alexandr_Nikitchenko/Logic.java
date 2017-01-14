package Alexandr_Nikitchenko;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Александр Никитченко on 05.01.2017.
 */

// Создание слушателя
public class Logic implements ActionListener {

    GTCInterface parent;
    double result;

    Logic(GTCInterface parent) {
        this.parent = parent;
    }

    // Логика работы
    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            // Ввод данных на дисплей
            String dispFieldText = parent.displayed.getText();
            double displayValue;

            // Получить число из дисплея + Конвертация строки в число
                displayValue = Double.parseDouble(dispFieldText);


            // Создание объекта
            Object src = e.getSource();

            // Реакция на выбор метода и кнопки Конвертировать
            if (parent.r1.isSelected() && src == parent.buttonConvert ) {
                String a = "Ваша температура в Фаренгейтах равна: ";
                parent.l3.setText(a);
                result = displayValue * 1.8 + 32;
                String b = result + "F";
                parent.l4.setText(b);

            } else if (parent.r2.isSelected() && src == parent.buttonConvert) {
                String c = "Ваша температура в Цельсиях равна: ";
                parent.l3.setText(c);
                result = (displayValue - 32) * 5 / 9;
                String d = result + "C";
                parent.l4.setText(d);
            }

            // Реакция на нажатие кнопки Сброс
            if (src == parent.buttonReset) {
                parent.displayed.setText(null);
                parent.l3.setText(null);
                parent.l4.setText(null);
            }

            // При возникновении ошибок обнулить дисплей
        }catch(Exception e1){
            parent.displayed.setText(null);
        }

    }

}