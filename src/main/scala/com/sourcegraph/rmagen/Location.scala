package com.sourcegraph.rmagen

import org.antlr.v4.runtime.ParserRuleContext

trait Location {
  def containedBy(node: ParserRuleContext): Boolean = {
    start >= node.getStart.getStartIndex && end <= node.getStop.getStopIndex
  }

  def start: Int
  def end: Int
}

case object NoLocation extends Location {
  override def containedBy(node: ParserRuleContext): Boolean = false
  override val start: Int = -1
  override val end: Int = -1

  override def toString = "NoLocation"
}

case class RangeLocation(start: Int, end: Int) extends Location

case class PositionLocation(loc: Int) extends Location {
  val start: Int = loc
  val end: Int = loc
}