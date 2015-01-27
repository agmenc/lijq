package org.agmenc.lijq

import net.liftweb.http.js.JsCmd
import net.liftweb.http.js.JsCmds._

object NoChange {
  def apply(f: => Unit): JsCmd = {
    f
    Noop
  }
}