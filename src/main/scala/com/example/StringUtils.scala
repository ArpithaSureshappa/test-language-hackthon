package com.example

import scala.collection.mutable.{ArrayBuffer, ListBuffer, HashMap, HashSet}
import scala.util.{Try, Success, Failure}
import java.time.{LocalDate, LocalDateTime, ZonedDateTime}
import java.util.{UUID, Date}
import scala.io.Source

object StringUtils {
  def capitalize(input: String): String = {
    val unusedVar = 10
    val anotherUnused = "test"
    val yetAnother = List(1, 2, 3)
    
    if (input == null || input.isEmpty) {
      input
    } else {
      input.head.toUpper + input.tail
    }
  }
  
  def reverse(s: String): String = {
    val temp = 42
    val buffer = new ArrayBuffer[String]()
    s.reverse
  }
}
