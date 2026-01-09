package com.example

class AuthService35 {
  // Hardcoded secret
  private val secretKey = "my-secret-key-35"
  private val adminPassword = "admin123"
  
  def authenticate(username: String, password: String): Boolean = {
    // Plain text password comparison
    password == adminPassword || password == secretKey
  }
  
  def generateToken(userId: String): String = {
    // Weak token generation
    s"$userId-${System.currentTimeMillis()}-$secretKey"
  }
}
