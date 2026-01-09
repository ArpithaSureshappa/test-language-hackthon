package com.example

import scala.util.Random

class TokenGenerator {
  val random = new Random()  // Insecure - should use SecureRandom
  
  def generateToken(): String = {
    // Using insecure Random for security-sensitive tokens
    val length = 32
    val chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
    
    (1 to length).map(_ => chars(random.nextInt(chars.length))).mkString
  }
  
  def generateSessionId(): String = {
    random.alphanumeric.take(16).mkString
  }
  
  def generateApiKey(): String = {
    s"sk-${random.alphanumeric.take(32).mkString}"
  }
}
