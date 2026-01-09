package com.example

class OrderProcessor {
  // High cyclomatic complexity - deeply nested conditions
  def processOrder(order: Order): Boolean = {
    if (order != null) {
      if (order.amount > 0) {
        if (order.customer != null) {
          if (order.customer.isVerified) {
            if (order.items != null && order.items.nonEmpty) {
              order.items.foreach { item =>
                if (item.quantity > 0) {
                  if (item.price > 0) {
                    if (item.isAvailable) {
                      if (order.shippingAddress != null) {
                        if (order.paymentMethod != null) {
                          if (order.discount >= 0 && order.discount <= 100) {
                            if (order.totalAmount() < 10000) {
                              return true
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    false
  }
}

case class Order(amount: Double, customer: Customer, items: List[Item], 
                 shippingAddress: String, paymentMethod: String, discount: Double) {
  def totalAmount(): Double = amount * (1 - discount / 100)
}
case class Customer(name: String, isVerified: Boolean)
case class Item(name: String, quantity: Int, price: Double, isAvailable: Boolean)
