package org.agmenc.lijq

trait DollarLike {
  def ajax(url: String, options: String) = Run("jQuery('" + url + "', '" + options + "')")
}