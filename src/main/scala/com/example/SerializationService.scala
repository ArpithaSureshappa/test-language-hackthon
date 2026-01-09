package com.example

import java.io.{ObjectInputStream, ObjectOutputStream, ByteArrayInputStream, ByteArrayOutputStream}

class SerializationService {
  def serialize(obj: Any): Array[Byte] = {
    val baos = new ByteArrayOutputStream()
    val oos = new ObjectOutputStream(baos)
    oos.writeObject(obj)
    oos.close()
    baos.toByteArray
  }
  
  def deserialize(bytes: Array[Byte]): Any = {
    val bais = new ByteArrayInputStream(bytes)
    val ois = new ObjectInputStream(bais)
    // Deserialization vulnerability - no validation
    val obj = ois.readObject()
    ois.close()
    obj
  }
}
