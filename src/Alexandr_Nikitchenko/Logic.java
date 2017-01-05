package Alexandr_Nikitchenko;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Александр Никитченко on 05.01.2017.
 */

    // Создание слушателя
    public class Logic implements ActionListener {

    Reader parent;
    double result = 0;

    Logic(Reader parent) {
        this.parent = parent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            // Логика работы
            String dispFieldText = parent.displayed.getText();
            double displayValue;


            displayValue = Double.parseDouble(dispFieldText);


            Object src = e.getSource();

            if (parent.r1.isSelected() && src == parent.buttonConvert ) {
                String b;
                b = "Ваша температура в Фаренгейтах равна: ";
                parent.l3.setText(b);
                result = displayValue * 1.8 + 32;
                String a = "" + result + "F";
                parent.l4.setText(a);

            } else if (parent.r2.isSelected() && src == parent.buttonConvert) {
                String b;
                b = "Ваша температура в Цельсиях равна: ";
                parent.l3.setText(b);
                result = (displayValue - 32) * 5 / 9;
                String a = "" + result + "C";
                parent.l4.setText(a);
            }
            if (parent.r2.isSelected() && parent.r1.isSelected() && src == parent.buttonConvert) {
                JOptionPane.showMessageDialog(null, "Выберите один из методов рассчета!");
                parent.displayed.setText(null);
                parent.l3.setText(null);
                parent.l4.setText(null);
                }

            if (src == parent.buttonReset) {
                    parent.displayed.setText(null);
                    parent.l3.setText(null);
                    parent.l4.setText(null);
                }
            }catch(Exception e1){
            parent.displayed.setText(null);
        }

        }

    }


