package com.github.lettenj61.springboot.model

sealed abstract class Visitor {
  def id: Long
  def name: String
}

case class NamedVisitor(id: Long, name: String) extends Visitor
case object Guest extends Visitor {
  val id = -1L
  val name = ""
}
