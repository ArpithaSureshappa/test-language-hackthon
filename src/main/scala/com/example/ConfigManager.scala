package com.example

class ConfigManager {
  // Using var instead of val - mutability issues
  var apiUrl = "http://api.example.com"
  var apiKey = "default-key"
  var timeout = 30
  var retries = 3
  var maxConnections = 10
  
  def updateConfig(url: String, key: String): Unit = {
    apiUrl = url  // Mutable configuration
    apiKey = key
  }
  
  def getConfig(): Map[String, Any] = {
    Map(
      "apiUrl" -> apiUrl,
      "apiKey" -> apiKey,
      "timeout" -> timeout
    )
  }
}
