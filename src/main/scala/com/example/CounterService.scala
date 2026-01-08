package com.example

class CounterService {
  // Thread safety issue - mutable var without synchronization
  private var count: Int = 0
  private var totalRequests: Long = 0
  
  def increment(): Unit = {
    count += 1  // Race condition
    totalRequests += 1
  }
  
  def getCount: Int = count
  
  def reset(): Unit = {
    count = 0
  }
}

object GlobalCounter {
  // Mutable shared state - thread safety issue
  var counter = 0
  var userSessions = scala.collection.mutable.Map[String, Int]()
  
  def increment(userId: String): Unit = {
    counter += 1
    userSessions(userId) = userSessions.getOrElse(userId, 0) + 1
  }
}
