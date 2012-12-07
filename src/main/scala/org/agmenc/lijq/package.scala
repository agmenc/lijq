package org.agmenc

import net.liftweb.http.js.JsExp
import net.liftweb.http.js.JsCmds._

package object lijq {
  implicit def jsExpToJQuery(jsExp: JsExp): JQuery = new JQuery(jsExp)
  implicit def jsExpToJsCmd2(jsExp: JsExp) = jsExpToJsCmd(jsExp)

  val $ = Dollar
}
