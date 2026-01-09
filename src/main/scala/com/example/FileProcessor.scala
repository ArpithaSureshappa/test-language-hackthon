package com.example

import scala.io.Source
import java.io.{FileWriter, PrintWriter}

class FileProcessor {
  def processFile(path: String): List[String] = {
    // Resource leak - Source not closed
    val source = Source.fromFile(path)
    val lines = source.getLines().toList
    lines.map(_.toUpperCase)
    // source.close() missing
  }
  
  def writeFile(path: String, content: String): Unit = {
    // Resource leak - writer not closed
    val writer = new PrintWriter(new FileWriter(path))
    writer.println(content)
    // writer.close() missing
  }
  
  def readAndWrite(inputPath: String, outputPath: String): Unit = {
    val source = Source.fromFile(inputPath)
    val writer = new PrintWriter(outputPath)
    
    source.getLines().foreach(line => writer.println(line.toUpperCase))
    // Neither closed
  }
}
