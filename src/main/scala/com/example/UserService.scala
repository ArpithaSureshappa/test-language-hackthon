package com.example

import java.sql.{Connection, DriverManager}

class UserService {
  def authenticate(username: String, password: String): Option[User] = {
    val connection = getConnection()
    
    // SQL Injection vulnerability - string interpolation in SQL
    val query = s"SELECT * FROM users WHERE username = '$username' AND password = '$password'"
    val statement = connection.createStatement()
    val rs = statement.executeQuery(query)
    
    if (rs.next()) {
      Some(User(rs.getString("username"), rs.getString("email")))
    } else {
      None
    }
  }
  
  private def getConnection(): Connection = {
    DriverManager.getConnection("jdbc:mysql://localhost/db", "user", "pass")
  }
}

case class User(username: String, email: String)
