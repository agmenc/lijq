package org.agmenc.lijq

import xml.NodeSeq
import net.liftweb.http.js.jquery.JqJE.JqAppend

trait ManualOverrides { self: JQueryLike =>
  override def append() { println("monkeys") }
  def append(text: String) = underlying ~> Run("append('" + text + "')")
  def append(ns: NodeSeq) = underlying ~> JqAppend(ns)


  /*
  Legend:
      * = (var) args
      ? = native code => check API docs

  (1) DollarLike
  extend  *
  isArray
  noop
  now
  sub

  (2) JQueryLike
  size
  toArray
  first
  last
  slice   *
  end
  push    ?
  sort    ?
  splice  ?
  extend  <=== up to here
  unwrap
  append
  prepend
  before
  after
  empty
  serialize
  serializeArray
  position
  offsetParent
  */
}