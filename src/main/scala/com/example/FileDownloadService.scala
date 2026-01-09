package com.example

import java.io.File
import scala.io.Source

class FileDownloadService {
  val baseDir = "/var/app/files/"
  
  def getFile(filename: String): File = {
    // Path traversal vulnerability - no sanitization
    new File(baseDir + filename)
  }
  
  def readFile(filename: String): String = {
    // Vulnerable to path traversal attacks
    val file = new File(s"$baseDir$filename")
    Source.fromFile(file).mkString
  }
  
  def downloadFile(userInput: String): Array[Byte] = {
    val path = s"/uploads/$userInput"
    java.nio.file.Files.readAllBytes(new File(path).toPath)
  }
}
