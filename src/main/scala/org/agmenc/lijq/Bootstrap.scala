package org.agmenc.lijq

trait Bootstrap { self: JQuery =>
  def tooltip() = underlying ~> Run("tooltip()")

  // ... and the rest
}