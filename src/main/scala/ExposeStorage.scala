
package com.knoldus.scala
import com.knoldus.Java.Storage

//trait is created to make different operations of storage
trait StorageOfScala {
  def capacity(size :Int):Unit
  def addInArray(element :Int):Unit
  def removeAnElementInArray(element :Int):Unit
  def removeAll():Unit
  def containsInArray(element:Int):Unit
  def displayArray():Unit
}


//class extends the storage to override and define the methdos
class ExposeStorage extends StorageOfScala {

  //instance of Java Storage
  private val instanceStorageOfJava =  new Storage
  override def capacity(size: Int): Unit ={
    instanceStorageOfJava.capacity(size)
  }

  override def addInArray(element: Int):Unit = {
   instanceStorageOfJava.addInArray(element)
  }

  override def removeAnElementInArray(element: Int): Unit = {
    instanceStorageOfJava.removeAnElementInArray(element)
  }

  override def removeAll(): Unit = {
    instanceStorageOfJava.removeAll()
  }

  override def containsInArray(element: Int): Unit = {
    instanceStorageOfJava.containsInArray(element)
  }

  override def displayArray(): Unit = {
    instanceStorageOfJava.displayArray()
  }

}
