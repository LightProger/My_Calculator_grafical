/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson_java_grafic_calculator;


import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Александр
 */
public class Calculator extends JFrame{
        
        // Объявление всех компонентов калькулятора
        JPanel windowContent;
        JPanel p1;
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
       
        
        // В конструкторе создаются все компоненты
        // и добавляются на фрейм с помощью Gridlayout

       public Calculator(String s){

           super(s);
           windowContent = new JPanel();
           
           // Задаём схему для этой панели
          BorderLayout bl = new BorderLayout();
          windowContent.setLayout(bl);

           // Создаём и отображаем поле
           // Добавляем его в Северную область окна
           displayField = new JTextField(30);
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


           // Задаём схему для этой панели
           p1 = new JPanel();
           GridLayout gl = new GridLayout(4,3);
           p1.setLayout(gl);

           //Добавляем кнопки
           p1.add(buttonReset);
           p1.add(button1);
           p1.add(button2);
           p1.add(button3);
           p1.add(button4);
           p1.add(button5);
           p1.add(button6);
           p1.add(button7);
           p1.add(button8);
           p1.add(button9);
           p1.add(button0);
           p1.add(buttonPoint);
           p1.add(buttonPlus);
           p1.add(buttonEqual);

           // Помещаем панель p1 в центральную область окна
           add("Center",p1);

       }
    }

