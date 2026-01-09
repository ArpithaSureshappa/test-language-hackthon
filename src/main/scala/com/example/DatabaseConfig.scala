package com.example

object DatabaseConfig {
  // Hardcoded credentials - security vulnerability
  val dbUrl = "jdbc:postgresql://localhost:5432/mydb"
  val dbUser = "admin"
  val dbPassword = "SuperSecret123!"
  val apiKey = "sk-1234567890abcdefghijklmnopqrstuvwxyz"
  val awsAccessKey = "AKIAIOSFODNN7EXAMPLE"
  val awsSecretKey = "wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY"
  
  def getConnection() = {
    java.sql.DriverManager.getConnection(dbUrl, dbUser, dbPassword)
  }
}
