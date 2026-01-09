package com.example

class ReportGenerator {
  def generateReport(items: List[String]): String = {
    var report = ""  // Inefficient string concatenation
    
    for (item <- items) {
      report += item + "\n"  // Creates new string each iteration
    }
    
    report
  }
  
  def buildCsvReport(data: List[List[String]]): String = {
    var csv = ""
    
    data.foreach { row =>
      row.foreach { cell =>
        csv += cell + ","
      }
      csv += "\n"
    }
    
    csv
  }
}
