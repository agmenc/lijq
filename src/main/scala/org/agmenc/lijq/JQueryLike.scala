package org.agmenc.lijq

import net.liftweb.http.js.JsExp

trait JQueryLike {
  def underlying: JsExp

  def addClass(className: String) = underlying ~> Run("addClass('" + className + "')")
  def removeClass(className: String) = underlying ~> Run("removeClass('" + className + "')")
}