package com.knoldus.scala

object Driver extends App{

  // the different operations can be performed  using Java file
  val instanceOfExposingCalculator = new ExposingCalculator
  println(instanceOfExposingCalculator.addition(23.0,45.0))
  println(instanceOfExposingCalculator.subtraction(45,12))
  println(instanceOfExposingCalculator.multiplication(23,5))
  println(instanceOfExposingCalculator.division(100,10))

  //the different operation can be performed on Storage
  private val instanceOFExposingStorage = new ExposeStorage
  instanceOFExposingStorage.capacity(5)
  instanceOFExposingStorage.addInArray(23)
  instanceOFExposingStorage.addInArray(45)
  instanceOFExposingStorage.addInArray(56)
  instanceOFExposingStorage.addInArray(59)
  instanceOFExposingStorage.addInArray(96)
  instanceOFExposingStorage.removeAnElementInArray(23)
  instanceOFExposingStorage.containsInArray(45)
  instanceOFExposingStorage.displayArray()
  instanceOFExposingStorage.removeAll()
  instanceOFExposingStorage.displayArray()
}
