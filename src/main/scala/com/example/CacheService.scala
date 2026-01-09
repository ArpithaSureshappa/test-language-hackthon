package com.example

import scala.collection.mutable

object CacheService {
  // Memory leak - unbounded cache with no eviction
  private val cache = mutable.Map[String, Any]()
  private val sessionCache = mutable.HashMap[String, UserSession]()
  private val requestLog = mutable.ListBuffer[RequestLog]()
  
  def put(key: String, value: Any): Unit = {
    cache(key) = value  // No size limit, no TTL
  }
  
  def get(key: String): Option[Any] = {
    cache.get(key)
  }
  
  def logRequest(log: RequestLog): Unit = {
    requestLog += log  // Unbounded growth
  }
}

case class UserSession(id: String, data: Map[String, String])
case class RequestLog(timestamp: Long, path: String)
