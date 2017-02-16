package lesson_java_grafic_calculator;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Created by Александр on 03.01.2017.
 */
public class CalculatorEngine implements ActionListener {


    Calculator parent;
    char selectedAction = ' '; // +, -, /, или *
    double currentResult = 0;

    // Конструктор сохраняет ссылку на окно калькулятора
    // в переменной экземпляра класса
    CalculatorEngine(Calculator parent) {
        this.parent = parent;

    }

    public void actionPerformed(ActionEvent e) {


            // Получить источник действия
            JButton clickedButton = (JButton) e.getSource();
            String dispFieldText = parent.displayField.getText();
            double displayValue = 0;
            // Получить число из дисплея калькулятора,
            // если он не пустой.
            // Восклицательный знак – это оператор отрицания
            if (!"".equals(dispFieldText)) {
                try {
                    displayValue = Double.parseDouble(dispFieldText);
                }catch (Exception e1){
                    JOptionPane.showMessageDialog(null, "Введите цифры!!!");
                    parent.displayField.setText(null);
                }

            }
            Object src = e.getSource();
            // Для каждой кнопки арифметического действия
            // запомнить его: +, -, /, или *, сохранить текущее число
            // в переменной currentResult, и очистить дисплей
            // для ввода нового числа

            if (src == parent.buttonPlus) {
                selectedAction = '+';
                currentResult = displayValue;
                parent.displayField.setText("");
            } else if (src == parent.buttonMinus) {
                selectedAction = '-';
                currentResult = displayValue;
                parent.displayField.setText("");
            } else if (src == parent.buttonDel) {
                selectedAction = '/';
                currentResult = displayValue;
                parent.displayField.setText("");
            } else if (src == parent.buttonProiz) {
                selectedAction = '*';
                currentResult = displayValue;
                parent.displayField.setText("");
            } else if (src == parent.buttonEqual) {
                // Совершить арифметическое действие, в зависимости
                // от selectedAction, обновить переменную currentResult
                // и показать результат на дисплее
                if (selectedAction == '+') {
                    currentResult += displayValue;
                    // Сконвертировать результат в строку, добавляя его
                    // к пустой строке и показать его
                    parent.displayField.setText("" + currentResult);
                } else if (selectedAction == '-') {
                    currentResult -= displayValue;
                    parent.displayField.setText("" + currentResult);
                } else if (selectedAction == '/') {
                    currentResult /= displayValue;
                    parent.displayField.setText("" + currentResult);
                } else if (selectedAction == '*') {
                    currentResult *= displayValue;
                    parent.displayField.setText("" + currentResult);
                }
            } else {
                // Для всех цифровых кнопок присоединить надпись на
                // кнопке к надписи в дисплее
                String clickedButtonLabel = clickedButton.getText();
                parent.displayField.setText(dispFieldText +
                        clickedButtonLabel);
            }
            if(src == parent.buttonPlusMinus ){
                currentResult = - displayValue;
                parent.displayField.setText("" + currentResult);
            }
            // Обнуление дисплея калькулятора
            if (src == parent.buttonReset) {
                parent.displayField.setText(null);
            }
            // На ноль делить нельзя
            if (selectedAction == '/' && displayValue == 0 && src == parent.buttonEqual){
                JOptionPane.showMessageDialog(null, "Упс! На ноль делить нельзя!!!");
                parent.displayField.setText("");
            }


    }
}



