package org.agmenc.lijq

import xml.NodeSeq
import net.liftweb.http.js.jquery.JqJE.JqAppend

trait ManualOverrides { self: JQueryLike =>
  def append(ns: NodeSeq) = underlying ~> JqAppend(ns)


  /*
  Legend:
      * = (var) args => add varargs args as last param, in generator script
      ? = native code => check API docs
      ns = NodeSequence candidate
      p = possible intruders from generic JS objects

  (1) DollarLike with no visible args
  extend  *
  isArray p
  noop
  now
  sub

  (2) JQueryLike with no visible args
  size
  toArray
  first
  last
  slice   *
  end
  push    ?
  sort    ?
  splice  ?
  extend  *
  unwrap
  append  *   ns
  prepend *   ns
  before  *   ns
  after   *   ns
  empty
  serialize
  serializeArray
  position
  offsetParent

  */
}