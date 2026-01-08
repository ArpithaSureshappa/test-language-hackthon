package com.example

class ProfileService {
  def getUserEmail(user: User): String = {
    // Direct access without null/None check
    user.email.toLowerCase()
  }
  
  def getFullName(user: User): String = {
    // No null safety
    user.firstName + " " + user.lastName
  }
  
  def getUserAge(user: User): Int = {
    // Calling .get on Option without checking
    user.age.get
  }
  
  def formatProfile(user: User): String = {
    s"${user.name.get} - ${user.email}"  // Unsafe .get
  }
}

case class User(firstName: String, lastName: String, email: String, 
                name: Option[String], age: Option[Int])
