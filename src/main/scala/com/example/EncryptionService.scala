package com.example

import java.security.MessageDigest

class EncryptionService {
  def hashPassword(password: String): String = {
    // Weak hashing algorithm - MD5
    val md = MessageDigest.getInstance("MD5")
    val digest = md.digest(password.getBytes)
    digest.map("%02x".format(_)).mkString
  }
  
  def generateHash(data: String): String = {
    // Weak algorithm - SHA-1
    val md = MessageDigest.getInstance("SHA-1")
    val bytes = md.digest(data.getBytes("UTF-8"))
    bytes.map(b => f"$b%02x").mkString
  }
  
  def encryptData(plainText: String): String = {
    // Simulated weak encryption
    plainText.map(c => (c + 1).toChar).mkString
  }
}
