package org.agmenc.lijq

import xml.NodeSeq
import net.liftweb.http.js._
import jquery.JqJE.JqAppend
import jquery.JqJE.JqPrepend

trait ManualOverrides { self: JQueryLike =>
  def append(ns: NodeSeq) = underlying ~> JqAppend(ns)
  def prepend(ns: NodeSeq) = underlying ~> JqPrepend(ns)
  def before(ns: NodeSeq) = underlying ~> make("before", ns)
  def after(ns: NodeSeq) = underlying ~> make("after", ns)

  case class make(functionName: String, content: NodeSeq) extends JsExp with JsMember {
    override val toJsCmd = functionName + "(" + fixHtmlFunc("inline", content){str => str }+ ")"
  }

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