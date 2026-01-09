package com.example

class DataParser {
  def parseInteger(value: String): Int = {
    try {
      value.toInt
    } catch {
      case _: Exception => 0  // Too broad exception, returns default
    }
  }
  
  @throws[Exception]  // Throwing generic Exception
  def parseDouble(value: String): Double = {
    value.toDouble
  }
  
  def parseJson(json: String): Map[String, Any] = {
    try {
      // Simulated JSON parsing
      Map.empty
    } catch {
      case e: Throwable =>  // Catching Throwable is too broad
        throw new Exception("Parse error")
    }
  }
}
