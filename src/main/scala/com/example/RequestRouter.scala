package com.example

sealed trait HttpMethod
case object GET extends HttpMethod
case object POST extends HttpMethod
case object PUT extends HttpMethod
case object DELETE extends HttpMethod
case object PATCH extends HttpMethod

class RequestRouter {
  def route(method: HttpMethod, path: String): String = {
    // Non-exhaustive pattern match - missing cases
    method match {
      case GET => handleGet(path)
      case POST => handlePost(path)
      // Missing PUT, DELETE, PATCH cases
    }
  }
  
  def handleGet(path: String): String = s"GET $path"
  def handlePost(path: String): String = s"POST $path"
}
