
package lesson_java_grafic_calculator;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Александр Никитченко
 */
       public class Calculator extends JFrame{
        
        // Объявление всех компонентов калькулятора
        JPanel windowContent;
        JPanel p1, p2, p3;
        JTextField displayField;
        JButton button0;
        JButton button1;
        JButton button2;
        JButton button3;
        JButton button4;
        JButton button5;
        JButton button6;
        JButton button7;
        JButton button8;
        JButton button9;
        JButton buttonPoint;
        JButton buttonEqual;
        JButton buttonReset;
        JButton buttonPlus;
        JButton buttonPlusMinus;
        JButton buttonDel;
        JButton buttonProiz;
        JButton buttonMinus;


       
        
        // В конструкторе создаются все компоненты
        // и добавляются на фрейм с помощью BorderLayout

       public Calculator(String s){

           super(s);
           //Создаем панель
           windowContent = new JPanel();

           // Задаём схему для этой панели
          BorderLayout bl = new BorderLayout();
          windowContent.setLayout(bl);

           // Создаём и отображаем поле
           // Добавляем его в Северную область окна
           displayField = new JTextField(10);
           add("North", displayField);

            // Создаём кнопки, используя конструктор
            // класса JButton, который принимает текст
            // кнопки в качестве параметра
            button0 = new JButton("0");
            button1 = new JButton("1");
            button2 = new JButton("2");
            button3 = new JButton("3");
            button4 = new JButton("4");
            button5 = new JButton("5");
            button6 = new JButton("6");
            button7 = new JButton("7");
            button8 = new JButton("8");
            button9 = new JButton("9");
            buttonPoint = new JButton(".");
            buttonEqual = new JButton("=");
            buttonReset = new JButton("C");
            buttonPlus = new JButton("+");
            buttonPlusMinus = new JButton("+/-");
            buttonDel = new JButton("/");
            buttonProiz = new JButton("*");
            buttonMinus = new JButton("-");


           // Задаём схему для этой панели
           p1 = new JPanel();
           GridLayout gl = new GridLayout(4,3, 1, 1);
           p1.setLayout(gl);

           //Добавляем кнопки

           p1.add(button7);
           p1.add(button8);
           p1.add(button9);
           p1.add(button4);
           p1.add(button5);
           p1.add(button6);
           p1.add(button1);
           p1.add(button2);
           p1.add(button3);
           p1.add(button0);
           p1.add(buttonPoint);
           p1.add(buttonEqual);




           // Помещаем панель p1 в центральную область окна
           add("Center", p1);

           // Задаём схему для этой панели
           p2 = new JPanel();
           GridLayout gl2 = new GridLayout(3,2, 1, 1);
           p2.setLayout(gl2);

           // Добавляем кнопки
           p2.add(buttonDel);
           p2.add(buttonProiz);
           p2.add(buttonMinus);
           p2.add(buttonPlus);
           p2.add(buttonPlusMinus);
           p2.add(buttonReset);


           // Помещаем панель p2 в восточную область окна
           add("East", p2);

           CalculatorEngine calcEngine = new CalculatorEngine(this);
           button0.addActionListener(calcEngine);
           button1.addActionListener(calcEngine);
           button2.addActionListener(calcEngine);
           button3.addActionListener(calcEngine);
           button4.addActionListener(calcEngine);
           button5.addActionListener(calcEngine);
           button6.addActionListener(calcEngine);
           button7.addActionListener(calcEngine);
           button8.addActionListener(calcEngine);
           button9.addActionListener(calcEngine);
           buttonPoint.addActionListener(calcEngine);
           buttonEqual.addActionListener(calcEngine);
           buttonDel.addActionListener(calcEngine);
           buttonProiz.addActionListener(calcEngine);
           buttonPlus.addActionListener(calcEngine);
           buttonMinus.addActionListener(calcEngine);
           buttonReset.addActionListener(calcEngine);
           buttonPlusMinus.addActionListener(calcEngine);

       }

}

