package com.github.lettenj61.springboot.model

case class Visitor(
  id: Long,
  name: String
)
object Visitor {
  val Guest: Visitor = Visitor(-1, "")
}
