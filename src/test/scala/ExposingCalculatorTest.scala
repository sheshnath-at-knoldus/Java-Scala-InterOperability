package com.knoldus.scala
import com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class ExposingCalculatorTest extends AnyFunSuite{
  val instanceOfExposingCalculator = new ExposingCalculator
  test("Test case for Exposing Addition"){
    val actualValue = instanceOfExposingCalculator.addition(12,12)
    val expectedResult =24.0
    assert(actualValue===expectedResult)
  }

  test("Test case for Exposing subtraction") {
    val actualValue = instanceOfExposingCalculator.subtraction(12, 12)
    val expectedResult = 0.0
    assert(actualValue === expectedResult)
  }

  test("Test case for Exposing Multiplication") {
    val actualValue = instanceOfExposingCalculator.multiplication(12, 12)
    val expectedResult = 144
    assert(actualValue === expectedResult)
  }

  test("Test case for Exposing Division") {
    val actualValue = instanceOfExposingCalculator.division(12, 12)
    val expectedResult = 1
    assert(actualValue === expectedResult)
  }

}
