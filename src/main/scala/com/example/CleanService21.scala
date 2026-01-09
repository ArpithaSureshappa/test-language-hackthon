package com.example

import scala.util.{Try, Success, Failure}

/**
 * Well-documented utility class with proper error handling
 */
class CleanService21 {
  private val maxSize = 100
  
  /**
   * Processes list with proper Option and Try handling
   */
  def processList(input: Option[List[String]]): Either[String, List[String]] = {
    input match {
      case None => Left("Input is empty")
      case Some(list) if list.isEmpty => Left("List is empty")
      case Some(list) =>
        val processed = list
          .filter(_.nonEmpty)
          .map(_.trim.toUpperCase)
        Right(processed)
    }
  }
  
  /**
   * Safe division with proper error handling
   */
  def divide(a: Int, b: Int): Try[Int] = Try(a / b)
  
  /**
   * Immutable data transformation
   */
  def transform(data: List[Int]): List[Int] = {
    data.filter(_ > 0).map(_ * 2).sorted
  }
}
