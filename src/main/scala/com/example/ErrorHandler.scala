package com.example

import scala.io.Source
import scala.util.{Try, Success, Failure}

class ErrorHandler {
  def parseInteger(value: String): Int = {
    try {
      value.toInt
    } catch {
      case _: Exception =>  // Empty catch block
        0
    }
  }
  
  def readFile(path: String): String = {
    try {
      Source.fromFile(path).mkString
    } catch {
      case e: Exception =>  // Catching but not logging
    }
    ""
  }
  
  def divideNumbers(a: Int, b: Int): Int = {
    try {
      a / b
    } catch {
      case _: Throwable =>  // Too broad, empty catch
    }
    0
  }
}
