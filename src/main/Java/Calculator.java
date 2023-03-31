
package com.knoldus.Java;

public class Calculator {

    //this method add two number
    public double addition(Double firstNumber, Double secondNumber) {
        return firstNumber + secondNumber;
    }

    //this method for Subtraction of two numbers
    public double subtraction(Double firstNumber, Double secondNumber) {
        if (firstNumber > secondNumber) return firstNumber - secondNumber;
        else return secondNumber - firstNumber;
    }

    // this method multiply two number
    public double multiplication(Double firstNumber, Double secondNumber) {
        return firstNumber * secondNumber;
    }

    //this method divide two numbers
    public double division(Double firstNumber, Double secondNumber) {
        if (firstNumber <= 0.0) return 0.0;
        else return firstNumber / secondNumber;
    }

}
