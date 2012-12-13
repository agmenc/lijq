package org.agmenc.lijq

import net.liftweb.http.js.JsExp

trait JQueryLike {
  def underlying: JsExp

  val X0 = Run("jQuery.0")
  val length = Run("jQuery.length")
  val context = Run("jQuery.context")
  val selector = Run("jQuery.selector")
  val jquery = Run("jQuery.jquery")

  def constructor(selector: String, context: String) = underlying ~> Run("constructor('" + selector + "', '" + context + "')")
  def init(context: String, rootjQuery: String) = underlying ~> Run("init('" + context + "', '" + rootjQuery + "')")
  def size() = underlying ~> Run("size()")
  def toArray() = underlying ~> Run("toArray()")
  def get(num: String) = underlying ~> Run("get('" + num + "')")
  def pushStack(elems: String, name: String, selector: String) = underlying ~> Run("pushStack('" + elems + "', '" + name + "', '" + selector + "')")
  def each(callback: String, args: String) = underlying ~> Run("each('" + callback + "', '" + args + "')")
  def ready(fn: String) = underlying ~> Run("ready('" + fn + "')")
  def eq(i: String) = underlying ~> Run("eq('" + i + "')")
  def first() = underlying ~> Run("first()")
  def last() = underlying ~> Run("last()")
  def slice(arguments: String*) = underlying ~> Run("slice('" + arguments + "')")
  def map(callback: String) = underlying ~> Run("map('" + callback + "')")
  def end() = underlying ~> Run("end()")
  def push() = underlying ~> Run("push()")
  def sort() = underlying ~> Run("sort()")
  def splice() = underlying ~> Run("splice()")
  def extend() = underlying ~> Run("extend()")
  def data(key: String, value: String) = underlying ~> Run("data('" + key + "', '" + value + "')")
  def removeData(key: String) = underlying ~> Run("removeData('" + key + "')")
  def queue(typeX: String, data: String) = underlying ~> Run("queue('" + typeX + "', '" + data + "')")
  def dequeue(typeX: String) = underlying ~> Run("dequeue('" + typeX + "')")
  def delay(time: String, typeX: String) = underlying ~> Run("delay('" + time + "', '" + typeX + "')")
  def clearQueue(typeX: String) = underlying ~> Run("clearQueue('" + typeX + "')")
  def promise(typeX: String, obj: String) = underlying ~> Run("promise('" + typeX + "', '" + obj + "')")
  def attr(name: String, value: String) = underlying ~> Run("attr('" + name + "', '" + value + "')")
  def removeAttr(name: String) = underlying ~> Run("removeAttr('" + name + "')")
  def prop(name: String, value: String) = underlying ~> Run("prop('" + name + "', '" + value + "')")
  def removeProp(name: String) = underlying ~> Run("removeProp('" + name + "')")
  def addClass(value: String) = underlying ~> Run("addClass('" + value + "')")
  def removeClass(value: String) = underlying ~> Run("removeClass('" + value + "')")
  def toggleClass(value: String, stateVal: String) = underlying ~> Run("toggleClass('" + value + "', '" + stateVal + "')")
  def hasClass(selector: String) = underlying ~> Run("hasClass('" + selector + "')")
  def valX(value: String) = underlying ~> Run("val('" + value + "')")
  def on(typeXs: String, selector: String, data: String, fn: String,  one: String, arguments: String*) = underlying ~> Run("on('" + typeXs + "', '" + selector + "', '" + data + "', '" + fn + "', '" +  one + "', '" + arguments + "')")
  def one(typeXs: String, selector: String, data: String, fn: String) = underlying ~> Run("one('" + typeXs + "', '" + selector + "', '" + data + "', '" + fn + "')")
  def off(typeXs: String, selector: String, fn: String) = underlying ~> Run("off('" + typeXs + "', '" + selector + "', '" + fn + "')")
  def bind(typeXs: String, data: String, fn: String) = underlying ~> Run("bind('" + typeXs + "', '" + data + "', '" + fn + "')")
  def unbind(typeXs: String, fn: String) = underlying ~> Run("unbind('" + typeXs + "', '" + fn + "')")
  def live(typeXs: String, data: String, fn: String) = underlying ~> Run("live('" + typeXs + "', '" + data + "', '" + fn + "')")
  def die(typeXs: String, fn: String) = underlying ~> Run("die('" + typeXs + "', '" + fn + "')")
  def delegate(selector: String, typeXs: String, data: String, fn: String) = underlying ~> Run("delegate('" + selector + "', '" + typeXs + "', '" + data + "', '" + fn + "')")
  def undelegate(selector: String, typeXs: String, fn: String) = underlying ~> Run("undelegate('" + selector + "', '" + typeXs + "', '" + fn + "')")
  def trigger(typeX: String, data: String) = underlying ~> Run("trigger('" + typeX + "', '" + data + "')")
  def triggerHandler(typeX: String, data: String) = underlying ~> Run("triggerHandler('" + typeX + "', '" + data + "')")
  def toggle(speed: String, easing: String, callback: String, arguments: String*) = underlying ~> Run("toggle('" + speed + "', '" + easing + "', '" + callback + "', '" + arguments + "')")
  def hover(fnOver: String, fnOut: String) = underlying ~> Run("hover('" + fnOver + "', '" + fnOut + "')")
  def blur(data: String, fn: String) = underlying ~> Run("blur('" + data + "', '" + fn + "')")
  def focus(data: String, fn: String) = underlying ~> Run("focus('" + data + "', '" + fn + "')")
  def focusin(data: String, fn: String) = underlying ~> Run("focusin('" + data + "', '" + fn + "')")
  def focusout(data: String, fn: String) = underlying ~> Run("focusout('" + data + "', '" + fn + "')")
  def load(url: String, params: String, callback: String, arguments: String*) = underlying ~> Run("load('" + url + "', '" + params + "', '" + callback + "', '" + arguments + "')")
  def resize(data: String, fn: String) = underlying ~> Run("resize('" + data + "', '" + fn + "')")
  def scroll(data: String, fn: String) = underlying ~> Run("scroll('" + data + "', '" + fn + "')")
  def unload(data: String, fn: String) = underlying ~> Run("unload('" + data + "', '" + fn + "')")
  def click(data: String, fn: String) = underlying ~> Run("click('" + data + "', '" + fn + "')")
  def dblclick(data: String, fn: String) = underlying ~> Run("dblclick('" + data + "', '" + fn + "')")
  def mousedown(data: String, fn: String) = underlying ~> Run("mousedown('" + data + "', '" + fn + "')")
  def mouseup(data: String, fn: String) = underlying ~> Run("mouseup('" + data + "', '" + fn + "')")
  def mousemove(data: String, fn: String) = underlying ~> Run("mousemove('" + data + "', '" + fn + "')")
  def mouseover(data: String, fn: String) = underlying ~> Run("mouseover('" + data + "', '" + fn + "')")
  def mouseout(data: String, fn: String) = underlying ~> Run("mouseout('" + data + "', '" + fn + "')")
  def mouseenter(data: String, fn: String) = underlying ~> Run("mouseenter('" + data + "', '" + fn + "')")
  def mouseleave(data: String, fn: String) = underlying ~> Run("mouseleave('" + data + "', '" + fn + "')")
  def change(data: String, fn: String) = underlying ~> Run("change('" + data + "', '" + fn + "')")
  def select(data: String, fn: String) = underlying ~> Run("select('" + data + "', '" + fn + "')")
  def submit(data: String, fn: String) = underlying ~> Run("submit('" + data + "', '" + fn + "')")
  def keydown(data: String, fn: String) = underlying ~> Run("keydown('" + data + "', '" + fn + "')")
  def keypress(data: String, fn: String) = underlying ~> Run("keypress('" + data + "', '" + fn + "')")
  def keyup(data: String, fn: String) = underlying ~> Run("keyup('" + data + "', '" + fn + "')")
  def error(data: String, fn: String) = underlying ~> Run("error('" + data + "', '" + fn + "')")
  def contextmenu(data: String, fn: String) = underlying ~> Run("contextmenu('" + data + "', '" + fn + "')")
  def find(selector: String) = underlying ~> Run("find('" + selector + "')")
  def has(target: String) = underlying ~> Run("has('" + target + "')")
  def not(selector: String) = underlying ~> Run("not('" + selector + "')")
  def filter(selector: String) = underlying ~> Run("filter('" + selector + "')")
  def is(selector: String) = underlying ~> Run("is('" + selector + "')")
  def closest(selectors: String, context: String) = underlying ~> Run("closest('" + selectors + "', '" + context + "')")
  def index(elem: String) = underlying ~> Run("index('" + elem + "')")
  def add(selector: String, context: String) = underlying ~> Run("add('" + selector + "', '" + context + "')")
  def addBack(selector: String) = underlying ~> Run("addBack('" + selector + "')")
  def andSelf(selector: String) = underlying ~> Run("andSelf('" + selector + "')")
  def parent(until: String, selector: String, arguments: String*) = underlying ~> Run("parent('" + until + "', '" + selector + "', '" + arguments + "')")
  def parents(until: String, selector: String, arguments: String*) = underlying ~> Run("parents('" + until + "', '" + selector + "', '" + arguments + "')")
  def parentsUntil(until: String, selector: String, arguments: String*) = underlying ~> Run("parentsUntil('" + until + "', '" + selector + "', '" + arguments + "')")
  def next(until: String, selector: String, arguments: String*) = underlying ~> Run("next('" + until + "', '" + selector + "', '" + arguments + "')")
  def prev(until: String, selector: String, arguments: String*) = underlying ~> Run("prev('" + until + "', '" + selector + "', '" + arguments + "')")
  def nextAll(until: String, selector: String, arguments: String*) = underlying ~> Run("nextAll('" + until + "', '" + selector + "', '" + arguments + "')")
  def prevAll(until: String, selector: String, arguments: String*) = underlying ~> Run("prevAll('" + until + "', '" + selector + "', '" + arguments + "')")
  def nextUntil(until: String, selector: String, arguments: String*) = underlying ~> Run("nextUntil('" + until + "', '" + selector + "', '" + arguments + "')")
  def prevUntil(until: String, selector: String, arguments: String*) = underlying ~> Run("prevUntil('" + until + "', '" + selector + "', '" + arguments + "')")
  def siblings(until: String, selector: String, arguments: String*) = underlying ~> Run("siblings('" + until + "', '" + selector + "', '" + arguments + "')")
  def children(until: String, selector: String, arguments: String*) = underlying ~> Run("children('" + until + "', '" + selector + "', '" + arguments + "')")
  def contents(until: String, selector: String, arguments: String*) = underlying ~> Run("contents('" + until + "', '" + selector + "', '" + arguments + "')")
  def text(value: String) = underlying ~> Run("text('" + value + "')")
  def wrapAll(html: String) = underlying ~> Run("wrapAll('" + html + "')")
  def wrapInner(html: String) = underlying ~> Run("wrapInner('" + html + "')")
  def wrap(html: String) = underlying ~> Run("wrap('" + html + "')")
  def unwrap() = underlying ~> Run("unwrap()")
  def append(arguments: String*) = underlying ~> Run("append('" + arguments + "')")
  def prepend(arguments: String*) = underlying ~> Run("prepend('" + arguments + "')")
  def before() = underlying ~> Run("before()")
  def after() = underlying ~> Run("after()")
  def remove(selector: String, keepData: String) = underlying ~> Run("remove('" + selector + "', '" + keepData + "')")
  def empty() = underlying ~> Run("empty()")
  def clone(dataAndEvents: String, deepDataAndEvents: String) = underlying ~> Run("clone('" + dataAndEvents + "', '" + deepDataAndEvents + "')")
  def html(value: String) = underlying ~> Run("html('" + value + "')")
  def replaceWith(value: String) = underlying ~> Run("replaceWith('" + value + "')")
  def detach(selector: String) = underlying ~> Run("detach('" + selector + "')")
  def domManip(args: String, table: String, callback: String) = underlying ~> Run("domManip('" + args + "', '" + table + "', '" + callback + "')")
  def appendTo(selector: String) = underlying ~> Run("appendTo('" + selector + "')")
  def prependTo(selector: String) = underlying ~> Run("prependTo('" + selector + "')")
  def insertBefore(selector: String) = underlying ~> Run("insertBefore('" + selector + "')")
  def insertAfter(selector: String) = underlying ~> Run("insertAfter('" + selector + "')")
  def replaceAll(selector: String) = underlying ~> Run("replaceAll('" + selector + "')")
  def css(name: String, value: String) = underlying ~> Run("css('" + name + "', '" + value + "')")
  def show(speed: String, easing: String, callback: String, arguments: String*) = underlying ~> Run("show('" + speed + "', '" + easing + "', '" + callback + "', '" + arguments + "')")
  def hide(speed: String, easing: String, callback: String, arguments: String*) = underlying ~> Run("hide('" + speed + "', '" + easing + "', '" + callback + "', '" + arguments + "')")
  def serialize() = underlying ~> Run("serialize()")
  def serializeArray() = underlying ~> Run("serializeArray()")
  def ajaxStart(f: String) = underlying ~> Run("ajaxStart('" + f + "')")
  def ajaxStop(f: String) = underlying ~> Run("ajaxStop('" + f + "')")
  def ajaxComplete(f: String) = underlying ~> Run("ajaxComplete('" + f + "')")
  def ajaxError(f: String) = underlying ~> Run("ajaxError('" + f + "')")
  def ajaxSuccess(f: String) = underlying ~> Run("ajaxSuccess('" + f + "')")
  def ajaxSend(f: String) = underlying ~> Run("ajaxSend('" + f + "')")
  def fadeTo(speed: String, to: String, easing: String, callback: String) = underlying ~> Run("fadeTo('" + speed + "', '" + to + "', '" + easing + "', '" + callback + "')")
  def animate(prop: String, speed: String, easing: String, callback: String) = underlying ~> Run("animate('" + prop + "', '" + speed + "', '" + easing + "', '" + callback + "')")
  def stop(typeX: String, clearQueue: String, gotoEnd: String) = underlying ~> Run("stop('" + typeX + "', '" + clearQueue + "', '" + gotoEnd + "')")
  def slideDown(speed: String, easing: String, callback: String) = underlying ~> Run("slideDown('" + speed + "', '" + easing + "', '" + callback + "')")
  def slideUp(speed: String, easing: String, callback: String) = underlying ~> Run("slideUp('" + speed + "', '" + easing + "', '" + callback + "')")
  def slideToggle(speed: String, easing: String, callback: String) = underlying ~> Run("slideToggle('" + speed + "', '" + easing + "', '" + callback + "')")
  def fadeIn(speed: String, easing: String, callback: String) = underlying ~> Run("fadeIn('" + speed + "', '" + easing + "', '" + callback + "')")
  def fadeOut(speed: String, easing: String, callback: String) = underlying ~> Run("fadeOut('" + speed + "', '" + easing + "', '" + callback + "')")
  def fadeToggle(speed: String, easing: String, callback: String) = underlying ~> Run("fadeToggle('" + speed + "', '" + easing + "', '" + callback + "')")
  def offset(options: String) = underlying ~> Run("offset('" + options + "')")
  def position() = underlying ~> Run("position()")
  def offsetParent() = underlying ~> Run("offsetParent()")
  def scrollLeft(valX: String) = underlying ~> Run("scrollLeft('" + valX + "')")
  def scrollTop(valX: String) = underlying ~> Run("scrollTop('" + valX + "')")
  def innerHeight(margin: String, value: String) = underlying ~> Run("innerHeight('" + margin + "', '" + value + "')")
  def height(margin: String, value: String) = underlying ~> Run("height('" + margin + "', '" + value + "')")
  def outerHeight(margin: String, value: String) = underlying ~> Run("outerHeight('" + margin + "', '" + value + "')")
  def innerWidth(margin: String, value: String) = underlying ~> Run("innerWidth('" + margin + "', '" + value + "')")
  def width(margin: String, value: String) = underlying ~> Run("width('" + margin + "', '" + value + "')")
  def outerWidth(margin: String, value: String) = underlying ~> Run("outerWidth('" + margin + "', '" + value + "')")

}

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
  def proxy(fn: String, context: String, arguments: String*) = Run("jQuery.proxy('" + fn + "', '" + context + "', '" + arguments + "')")
  def access(elems: String, fn: String, key: String, value: String, chainable: String, emptyGet: String, pass: String) = Run("jQuery.access('" + elems + "', '" + fn + "', '" + key + "', '" + value + "', '" + chainable + "', '" + emptyGet + "', '" + pass + "')")
  def now() = Run("jQuery.now()")
  def Callbacks(options: String, arguments: String*) = Run("jQuery.Callbacks('" + options + "', '" + arguments + "')")
  def Deferred(func: String, arguments: String*) = Run("jQuery.Deferred('" + func + "', '" + arguments + "')")
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
  def get(url: String, data: String, callback: String, typeX: String, arguments: String*) = Run("jQuery.get('" + url + "', '" + data + "', '" + callback + "', '" + typeX + "', '" + arguments + "')")
  def post(url: String, data: String, callback: String, typeX: String, arguments: String*) = Run("jQuery.post('" + url + "', '" + data + "', '" + callback + "', '" + typeX + "', '" + arguments + "')")
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