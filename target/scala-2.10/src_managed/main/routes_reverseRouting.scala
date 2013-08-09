// @SOURCE:C:/Users/zerobatu/Documents/playproject/todo/conf/routes
// @HASH:792dc89995553307c1b434bdb610edac9bbfa4d2
// @DATE:Thu Aug 08 23:19:27 CLT 2013

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:11
def deleteTodo(id:Long): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "todos/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                

// @LINE:10
def newTodo(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "todos")
}
                                                

// @LINE:9
def todos(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "todos")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          

// @LINE:14
class ReverseAssets {
    

// @LINE:14
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          
}
                  


// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:11
def deleteTodo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deleteTodo",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "todos/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                        

// @LINE:10
def newTodo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.newTodo",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "todos"})
      }
   """
)
                        

// @LINE:9
def todos : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.todos",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "todos"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              

// @LINE:14
class ReverseAssets {
    

// @LINE:14
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              
}
        


// @LINE:14
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:11
def deleteTodo(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deleteTodo(id), HandlerDef(this, "controllers.Application", "deleteTodo", Seq(classOf[Long]), "POST", """""", _prefix + """todos/$id<[^/]+>/delete""")
)
                      

// @LINE:10
def newTodo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.newTodo(), HandlerDef(this, "controllers.Application", "newTodo", Seq(), "POST", """""", _prefix + """todos""")
)
                      

// @LINE:9
def todos(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.todos(), HandlerDef(this, "controllers.Application", "todos", Seq(), "GET", """ Todos""", _prefix + """todos""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          

// @LINE:14
class ReverseAssets {
    

// @LINE:14
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          
}
                  
      