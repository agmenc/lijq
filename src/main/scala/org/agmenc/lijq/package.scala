package org.agmenc

import net.liftweb.http.js.JsExp

package object lijq {
  implicit def jsExpToJQuery(jsExp: JsExp): JQuery = new JQuery(jsExp)

  val $ = Dollar
}
