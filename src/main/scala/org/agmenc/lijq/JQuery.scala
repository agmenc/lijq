package org.agmenc.lijq

import net.liftweb.http.js._

object JQuery {
  implicit def jsExpToJQuery(jsExp: JsExp): JQuery = new JQuery(jsExp)

  case class $(selector: String) extends JsExp with JsMember {
    override def toJsCmd = "jQuery('" + selector + "')"
  }

  case class Run(command: String) extends JsExp with JsMember {
    override val toJsCmd = command
  }
}

class JQuery(underlying: JsExp) {
  import org.agmenc.lijq.JQuery._

  def addClass(className: String) = underlying ~> Run("addClass('" + className + "')")
  def removeClass(className: String) = underlying ~> Run("removeClass('" + className + "')")
}