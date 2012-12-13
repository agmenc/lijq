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
      ? = native code => check API docs
      p = possible intruders from generic JS objects

  (1) DollarLike with no visible args
  isArray p
  noop
  now
  sub

  (2) JQueryLike with no visible args
  size
  toArray
  first
  last
  end
  push    ? p
  sort    ? p
  splice  ? p
  unwrap
  empty
  serialize
  serializeArray
  position
  offsetParent

  */
}