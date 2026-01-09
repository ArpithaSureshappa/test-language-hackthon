package com.example

class Validator {
  // Magic numbers without named constants
  def validateAge(age: Int): Boolean = {
    age >= 18 && age <= 120
  }
  
  def validatePassword(password: String): Boolean = {
    password != null && password.length >= 8 && password.length <= 64
  }
  
  def validatePort(port: Int): Boolean = {
    port >= 1024 && port <= 65535
  }
  
  def validateDiscount(discount: Double): Boolean = {
    discount >= 0.0 && discount <= 100.0
  }
  
  def validateFileSize(sizeInBytes: Long): Boolean = {
    sizeInBytes <= 10485760  // What is this number?
  }
}
