package org.agmenc.lijq

trait DollarLike {
  val fn = Run("jQuery.fn")
  val isReady = Run("jQuery.isReady")
  val readyWait = Run("jQuery.readyWait")
  val guid = Run("jQuery.guid")
  val support = Run("jQuery.support")
  val cache = Run("jQuery.cache")
  val deletedIds = Run("jQuery.deletedIds")
  val uuid = Run("jQuery.uuid")
  val expando = Run("jQuery.expando")
  val noData = Run("jQuery.noData")
  val valHooks = Run("jQuery.valHooks")
  val attrFn = Run("jQuery.attrFn")
  val attrHooks = Run("jQuery.attrHooks")
  val propFix = Run("jQuery.propFix")
  val propHooks = Run("jQuery.propHooks")
  val event = Run("jQuery.event")
  val expr = Run("jQuery.expr")
  val fragments = Run("jQuery.fragments")
  val browser = Run("jQuery.browser")
  val cssHooks = Run("jQuery.cssHooks")
  val cssNumber = Run("jQuery.cssNumber")
  val cssProps = Run("jQuery.cssProps")
  val ajaxSettings = Run("jQuery.ajaxSettings")
  val active = Run("jQuery.active")
  val lastModified = Run("jQuery.lastModified")
  val etag = Run("jQuery.etag")
  val easing = Run("jQuery.easing")
  val timers = Run("jQuery.timers")
  val offset = Run("jQuery.offset")

  def extend() = Run("jQuery.extend()")
  def noConflict(deep: String) = Run("jQuery.noConflict('" + deep + "')")
  def holdReady(hold: String) = Run("jQuery.holdReady('" + hold + "')")
  def ready(wait: String) = Run("jQuery.ready('" + wait + "')")
  def isFunction(obj: String) = Run("jQuery.isFunction('" + obj + "')")
  def isArray() = Run("jQuery.isArray()")
  def isWindow(obj: String) = Run("jQuery.isWindow('" + obj + "')")
  def isNumeric(obj: String) = Run("jQuery.isNumeric('" + obj + "')")
  def typeX(obj: String) = Run("jQuery.type('" + obj + "')")
  def isPlainObject(obj: String) = Run("jQuery.isPlainObject('" + obj + "')")
  def isEmptyObject(obj: String) = Run("jQuery.isEmptyObject('" + obj + "')")
  def error(msg: String) = Run("jQuery.error('" + msg + "')")
  def parseHTML(data: String, context: String, scripts: String) = Run("jQuery.parseHTML('" + data + "', '" + context + "', '" + scripts + "')")
  def parseJSON(data: String) = Run("jQuery.parseJSON('" + data + "')")
  def parseXML(data: String) = Run("jQuery.parseXML('" + data + "')")
  def noop() = Run("jQuery.noop()")
  def globalEval(data: String) = Run("jQuery.globalEval('" + data + "')")
  def camelCase(string: String) = Run("jQuery.camelCase('" + string + "')")
  def nodeName(elem: String, name: String) = Run("jQuery.nodeName('" + elem + "', '" + name + "')")
  def each(obj: String, callback: String, args: String) = Run("jQuery.each('" + obj + "', '" + callback + "', '" + args + "')")
  def trim(text: String) = Run("jQuery.trim('" + text + "')")
  def makeArray(arr: String, results: String) = Run("jQuery.makeArray('" + arr + "', '" + results + "')")
  def inArray(elem: String, arr: String, i: String) = Run("jQuery.inArray('" + elem + "', '" + arr + "', '" + i + "')")
  def merge(first: String, second: String) = Run("jQuery.merge('" + first + "', '" + second + "')")
  def grep(elems: String, callback: String, inv: String) = Run("jQuery.grep('" + elems + "', '" + callback + "', '" + inv + "')")
  def map(elems: String, callback: String, arg: String) = Run("jQuery.map('" + elems + "', '" + callback + "', '" + arg + "')")
  def proxy(fn: String, context: String) = Run("jQuery.proxy('" + fn + "', '" + context + "')")
  def access(elems: String, fn: String, key: String, value: String, chainable: String, emptyGet: String, pass: String) = Run("jQuery.access('" + elems + "', '" + fn + "', '" + key + "', '" + value + "', '" + chainable + "', '" + emptyGet + "', '" + pass + "')")
  def now() = Run("jQuery.now()")
  def Callbacks(options: String) = Run("jQuery.Callbacks('" + options + "')")
  def Deferred(func: String) = Run("jQuery.Deferred('" + func + "')")
  def when(subordinate: String) = Run("jQuery.when('" + subordinate + "')")
  def hasData(elem: String) = Run("jQuery.hasData('" + elem + "')")
  def data(elem: String, name: String, data: String, pvt: String) = Run("jQuery.data('" + elem + "', '" + name + "', '" + data + "', '" + pvt + "')")
  def removeData(elem: String, name: String, pvt: String) = Run("jQuery.removeData('" + elem + "', '" + name + "', '" + pvt + "')")
  def _data(elem: String, name: String, data: String) = Run("jQuery._data('" + elem + "', '" + name + "', '" + data + "')")
  def acceptData(elem: String) = Run("jQuery.acceptData('" + elem + "')")
  def queue(elem: String, typeX: String, data: String) = Run("jQuery.queue('" + elem + "', '" + typeX + "', '" + data + "')")
  def dequeue(elem: String, typeX: String) = Run("jQuery.dequeue('" + elem + "', '" + typeX + "')")
  def _queueHooks(elem: String, typeX: String) = Run("jQuery._queueHooks('" + elem + "', '" + typeX + "')")
  def attr(elem: String, name: String, value: String, pass: String) = Run("jQuery.attr('" + elem + "', '" + name + "', '" + value + "', '" + pass + "')")
  def removeAttr(elem: String, value: String) = Run("jQuery.removeAttr('" + elem + "', '" + value + "')")
  def prop(elem: String, name: String, value: String) = Run("jQuery.prop('" + elem + "', '" + name + "', '" + value + "')")
  def removeEvent(elem: String, typeX: String, handle: String) = Run("jQuery.removeEvent('" + elem + "', '" + typeX + "', '" + handle + "')")
  def Event(props: String) = Run("jQuery.Event('" + props + "')")
  def find(selector: String, context: String, results: String, seed: String) = Run("jQuery.find('" + selector + "', '" + context + "', '" + results + "', '" + seed + "')")
  def unique(results: String) = Run("jQuery.unique('" + results + "')")
  def text(elem: String) = Run("jQuery.text('" + elem + "')")
  def isXMLDoc(elem: String) = Run("jQuery.isXMLDoc('" + elem + "')")
  def contains(a: String, b: String) = Run("jQuery.contains('" + a + "', '" + b + "')")
  def filter(expr: String, elems: String, not: String) = Run("jQuery.filter('" + expr + "', '" + elems + "', '" + not + "')")
  def dir(elem: String, dir: String, until: String) = Run("jQuery.dir('" + elem + "', '" + dir + "', '" + until + "')")
  def sibling(n: String, elem: String) = Run("jQuery.sibling('" + n + "', '" + elem + "')")
  def buildFragment(args: String, context: String, scripts: String) = Run("jQuery.buildFragment('" + args + "', '" + context + "', '" + scripts + "')")
  def clone(elem: String, dataAndEvents: String, deepDataAndEvents: String) = Run("jQuery.clone('" + elem + "', '" + dataAndEvents + "', '" + deepDataAndEvents + "')")
  def clean(elems: String, context: String, fragment: String, scripts: String) = Run("jQuery.clean('" + elems + "', '" + context + "', '" + fragment + "', '" + scripts + "')")
  def cleanData(elems: String,  acceptData: String) = Run("jQuery.cleanData('" + elems + "', '" +  acceptData + "')")
  def uaMatch(ua: String) = Run("jQuery.uaMatch('" + ua + "')")
  def sub() = Run("jQuery.sub()")
  def style(elem: String, name: String, value: String, extra: String) = Run("jQuery.style('" + elem + "', '" + name + "', '" + value + "', '" + extra + "')")
  def css(elem: String, name: String, numeric: String, extra: String) = Run("jQuery.css('" + elem + "', '" + name + "', '" + numeric + "', '" + extra + "')")
  def swap(elem: String, options: String, callback: String) = Run("jQuery.swap('" + elem + "', '" + options + "', '" + callback + "')")
  def param(a: String, traditional: String) = Run("jQuery.param('" + a + "', '" + traditional + "')")
  def get(url: String, data: String, callback: String, typeX: String) = Run("jQuery.get('" + url + "', '" + data + "', '" + callback + "', '" + typeX + "')")
  def post(url: String, data: String, callback: String, typeX: String) = Run("jQuery.post('" + url + "', '" + data + "', '" + callback + "', '" + typeX + "')")
  def getScript(url: String, callback: String) = Run("jQuery.getScript('" + url + "', '" + callback + "')")
  def getJSON(url: String, data: String, callback: String) = Run("jQuery.getJSON('" + url + "', '" + data + "', '" + callback + "')")
  def ajaxSetup(target: String, settings: String) = Run("jQuery.ajaxSetup('" + target + "', '" + settings + "')")
  def ajaxPrefilter(dataTypeExpression: String, func: String) = Run("jQuery.ajaxPrefilter('" + dataTypeExpression + "', '" + func + "')")
  def ajaxTransport(dataTypeExpression: String, func: String) = Run("jQuery.ajaxTransport('" + dataTypeExpression + "', '" + func + "')")
  def ajax(url: String, options: String) = Run("jQuery.ajax('" + url + "', '" + options + "')")
  def Animation(elem: String, properties: String, options: String) = Run("jQuery.Animation('" + elem + "', '" + properties + "', '" + options + "')")
  def Tween(elem: String, options: String, prop: String, end: String, easing: String) = Run("jQuery.Tween('" + elem + "', '" + options + "', '" + prop + "', '" + end + "', '" + easing + "')")
  def speed(speed: String, easing: String, fn: String) = Run("jQuery.speed('" + speed + "', '" + easing + "', '" + fn + "')")
  def fx(options: String, prop: String, end: String, easing: String, unit: String) = Run("jQuery.fx('" + options + "', '" + prop + "', '" + end + "', '" + easing + "', '" + unit + "')")

}