package org.agmenc

import net.liftweb.http.js.{JsMember, JsExp}
import net.liftweb.http.js.JsCmds._
import xml.NodeSeq

package object lijq {
  implicit def jsExpToJQuery(jsExp: JsExp): JQuery = new JQuery(jsExp)
  implicit def jsExpToJsCmd2(jsExp: JsExp) = jsExpToJsCmd(jsExp)

  // TODO - CAS - 09/05/2013 - function("insertSnippets")(myNodeSeq, string1, number, string2)
  def call(functionName: String, content: NodeSeq) = new JsExp with JsMember {
    override val toJsCmd = functionName + "(" + fixHtmlFunc("inline", content){str => str } + ")"
  }

  val $ = Dollar
}
