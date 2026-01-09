package com.example

class PaymentService {
  def processCreditCard(cardNumber: String, amount: Double): Boolean = {
    if (cardNumber == null || cardNumber.isEmpty) {
      println("Invalid card number")
      return false
    }
    if (amount <= 0) {
      println("Invalid amount")
      return false
    }
    if (cardNumber.length != 16) {
      println("Card number must be 16 digits")
      return false
    }
    println("Processing credit card payment")
    true
  }
  
  def processDebitCard(cardNumber: String, amount: Double): Boolean = {
    if (cardNumber == null || cardNumber.isEmpty) {
      println("Invalid card number")
      return false
    }
    if (amount <= 0) {
      println("Invalid amount")
      return false
    }
    if (cardNumber.length != 16) {
      println("Card number must be 16 digits")
      return false
    }
    println("Processing debit card payment")
    true
  }
  
  def processPayPal(email: String, amount: Double): Boolean = {
    if (email == null || email.isEmpty) {
      println("Invalid email")
      return false
    }
    if (amount <= 0) {
      println("Invalid amount")
      return false
    }
    if (!email.contains("@")) {
      println("Invalid email format")
      return false
    }
    println("Processing PayPal payment")
    true
  }
}
