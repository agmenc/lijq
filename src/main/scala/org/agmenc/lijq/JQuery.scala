package org.agmenc.lijq

import net.liftweb.http.js._

case class Run(command: String) extends JsExp with JsMember {
  override val toJsCmd = command
}

class Dollar extends DollarLike

object Dollar extends Dollar {
  def apply(selector: String): JsExp = Run("jQuery('" + selector + "')")
}

class JQuery(override val underlying: JsExp) extends JQueryLike with ManualOverrides