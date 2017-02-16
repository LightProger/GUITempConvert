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

        // Создание объекта
        Object src = e.getSource();

        String dispFieldText = parent.displayed.getText();
        double displayValue = 0;
        // Получить число из дисплея,
        // если он не пустой.
        // Восклицательный знак – это оператор отрицания + Обработка ошибок
        if (!"".equals(dispFieldText)) {
            try {
                displayValue = Double.parseDouble(dispFieldText);
            }catch (Exception e1){
                JOptionPane.showMessageDialog(null, "Введите цифры!!!");
                parent.displayed.setText(null);
            }

        }

            // Реакция на выбор метода и кнопки Конвертировать
            if (parent.r1.isSelected() && src == parent.buttonConvert ) {
                String a = "Ваша температура в Фаренгейтах равна: ";
                parent.l3.setText(a);
                result  = displayValue * 1.8 + 32.0;
                String b =  result + "F";
                parent.l4.setText(b);


            } else if (parent.r2.isSelected() && src == parent.buttonConvert) {
                String c = "Ваша температура в Цельсиях равна: ";
                parent.l3.setText(c);
                result = (displayValue - 32.0) * 5.0 / 9.0;
                String d = result + "C";
                parent.l4.setText(d);
            }

             if ("".equals(dispFieldText) && (parent.r1.isSelected () || parent.r2.isSelected ()) &&
                    src == parent.buttonConvert) {
                    parent.displayed.setText(null);
                    parent.l4.setText(null);
                    JOptionPane.showMessageDialog (null, "Поле ввода пустое!" );
                }


            // Реакция на нажатие кнопки Сброс
            if (src == parent.buttonReset) {
                parent.displayed.setText(null);
                parent.l3.setText(null);
                parent.l4.setText(null);
            }
        }
    }