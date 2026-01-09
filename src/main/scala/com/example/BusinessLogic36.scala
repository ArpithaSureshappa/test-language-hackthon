package com.example

class BusinessLogic36 {
  // Complex nested if statements
  def processRequest(x: Int, y: Int, z: String): String = {
    if (x > 0) {
      if (y > 0) {
        if (z != null) {
          if (z.nonEmpty) {
            if (x > y) {
              "Case 1"
            } else {
              "Case 2"
            }
          } else {
            "Case 3"
          }
        } else {
          "Case 4"
        }
      } else {
        "Case 5"
      }
    } else {
      "Case 6"
    }
  }
}
