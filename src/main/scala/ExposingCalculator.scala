
package com.knoldus.scala
import com.knoldus.Java.Calculator

class ExposingCalculator {
  //creating instance of Calculator from the Java Calculator
  private val calculator = new Calculator

  /*
  different methods can be call in this program from the Java source File like
  calculator.addition() ,calculator.subtraction(),calculator.multiplication(),calculator.division()
  */
  def addition(firstNumber :Double ,secondNumber :Double):Double ={
    calculator.addition(firstNumber,secondNumber)
  }

  def subtraction(firstNumber:Double,secondNumber:Double):Double={
    calculator.subtraction(firstNumber,secondNumber)
  }

  def multiplication(firstNumber :Double ,secondNumber :Double) :Double={
    calculator.multiplication(firstNumber,secondNumber)
  }

  def division(firstNumber:Double,secondNumber:Double):Double ={
    calculator.division(firstNumber,secondNumber)
  }

}

