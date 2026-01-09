package com.example

class Feature48 {
  // Minor: could use val instead of var
  private var counter = 0
  
  def increment(): Unit = {
    counter += 1
  }
  
  def getCount: Int = counter
  
  // Minor: could use pattern matching
  def process(input: String): String = {
    if (input == null) ""
    else if (input.isEmpty) "empty"
    else input.toUpperCase
  }
}
