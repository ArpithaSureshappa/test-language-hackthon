package com.example

class SlowProcessor28 {
  // O(n²) complexity - performance issue
  def findDuplicates(data: List[Int]): List[Int] = {
    var duplicates = List[Int]()
    
    for (i <- data.indices) {
      for (j <- data.indices) {
        if (i != j && data(i) == data(j)) {
          duplicates = duplicates :+ data(i)  // Inefficient list append
        }
      }
    }
    duplicates
  }
  
  // Inefficient filtering
  def processData(items: List[String]): List[String] = {
    items.filter(_.nonEmpty)
         .filter(_.length > 5)
         .filter(_.startsWith("A"))
         .filter(_.endsWith("Z"))
  }
}
