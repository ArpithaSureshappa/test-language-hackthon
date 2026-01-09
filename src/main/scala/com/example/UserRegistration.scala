package com.example

class UserRegistration {
  // God method - too many responsibilities
  def registerUser(username: String, email: String, password: String,
                   firstName: String, lastName: String, phone: String,
                   address: String, city: String, country: String,
                   zipCode: String): Boolean = {
    
    // Validation
    if (username == null || username.isEmpty) return false
    if (email == null || !email.contains("@")) return false
    if (password == null || password.length < 8) return false
    if (firstName == null || firstName.isEmpty) return false
    if (lastName == null || lastName.isEmpty) return false
    if (phone == null || phone.length < 10) return false
    if (address == null || address.isEmpty) return false
    if (city == null) return false
    if (country == null) return false
    if (zipCode == null) return false
    
    // Password strength check
    val hasUpper = password.exists(_.isUpper)
    val hasLower = password.exists(_.isLower)
    val hasDigit = password.exists(_.isDigit)
    if (!hasUpper || !hasLower || !hasDigit) return false
    
    // Hash password
    val hashedPassword = hashPassword(password)
    
    // Create user object
    val user = User(username, email, hashedPassword, firstName, lastName, phone, address, city, country, zipCode)
    
    // Save to database
    saveToDatabase(user)
    
    // Send welcome email
    sendWelcomeEmail(email, firstName)
    
    // Create user profile
    createUserProfile(user)
    
    // Log registration
    logRegistration(username)
    
    // Update analytics
    updateAnalytics()
    
    true
  }
  
  private def hashPassword(password: String): String = password
  private def saveToDatabase(user: User): Unit = {}
  private def sendWelcomeEmail(email: String, name: String): Unit = {}
  private def createUserProfile(user: User): Unit = {}
  private def logRegistration(username: String): Unit = {}
  private def updateAnalytics(): Unit = {}
}

case class User(username: String, email: String, password: String,
                firstName: String, lastName: String, phone: String,
                address: String, city: String, country: String, zipCode: String)
