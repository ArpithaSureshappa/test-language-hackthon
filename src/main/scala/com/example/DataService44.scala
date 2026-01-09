package com.example

import scala.collection.mutable

class DataService44 {
  // Mutable state
  var cache = mutable.Map[String, String]()
  
  // No input validation
  def query(sql: String): List[Map[String, Any]] = {
    // SQL injection risk
    val result = executeQuery(s"SELECT * FROM table WHERE id = $sql")
    result
  }
  
  private def executeQuery(sql: String): List[Map[String, Any]] = {
    List.empty
  }
  
  // Resource not closed
  def readData(path: String): String = {
    val source = scala.io.Source.fromFile(path)
    source.mkString  // source not closed
  }
}
