package lesson_java_grafic_calculator;

import javax.swing.*;



public class SimpleCalculator{


       public static void main(String[] args) {

           //Создаем окно
           Calculator s = new Calculator("Калькулятор");
           s.setVisible(true);
           s.pack();
           s.setResizable(false);
           s.setLocationRelativeTo(null);
           s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }
    
 }
