package org.agmenc.lijq

import net.liftweb.http.js._

case class Run(command: String) extends JsExp with JsMember {
  override val toJsCmd = command
}

class Dollar

object Dollar extends Dollar with DollarLike {
  def apply(selector: String): JsExp = Run("jQuery('" + selector + "')")
  def ajax(url: String, options: String) = Run("jQuery('" + url + "', '" + options + "')")
}

class JQuery(override val underlying: JsExp) extends JQueryLike