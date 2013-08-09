
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Todo],Form[String],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(todos: List[Todo], todoForm: Form[String]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.45*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Todo list")/*5.19*/ {_display_(Seq[Any](format.raw/*5.21*/("""
    
    <h1>"""),_display_(Seq[Any](/*7.10*/todos/*7.15*/.size)),format.raw/*7.20*/(""" Todo(s)</h1>
    
    <ul>
        """),_display_(Seq[Any](/*10.10*/todos/*10.15*/.map/*10.19*/ { todo =>_display_(Seq[Any](format.raw/*10.29*/("""
            <li>
                """),_display_(Seq[Any](/*12.18*/todo/*12.22*/.text)),format.raw/*12.27*/("""
                
                """),_display_(Seq[Any](/*14.18*/form(routes.Application.deleteTodo(todo.id))/*14.62*/ {_display_(Seq[Any](format.raw/*14.64*/("""
                    <input type="submit" value="Delete">
                """)))})),format.raw/*16.18*/("""
            </li>
        """)))})),format.raw/*18.10*/("""
    </ul>
    
    <h2>Add a new Todo</h2>
    
    """),_display_(Seq[Any](/*23.6*/form(routes.Application.newTodo)/*23.38*/ {_display_(Seq[Any](format.raw/*23.40*/("""
        
        """),_display_(Seq[Any](/*25.10*/inputText(todoForm("text")))),format.raw/*25.37*/(""" 
        
        <input type="submit" value="Create">
        
    """)))})),format.raw/*29.6*/("""
    
""")))})))}
    }
    
    def render(todos:List[Todo],todoForm:Form[String]): play.api.templates.Html = apply(todos,todoForm)
    
    def f:((List[Todo],Form[String]) => play.api.templates.Html) = (todos,todoForm) => apply(todos,todoForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Aug 08 23:16:59 CLT 2013
                    SOURCE: C:/Users/zerobatu/Documents/playproject/todo/app/views/index.scala.html
                    HASH: 0654a6c7ce9d748c69128a51689829558849de09
                    MATRIX: 522->1|658->44|686->63|722->65|747->82|786->84|836->99|849->104|875->109|948->146|962->151|975->155|1023->165|1094->200|1107->204|1134->209|1205->244|1258->288|1298->290|1405->365|1465->393|1554->447|1595->479|1635->481|1690->500|1739->527|1840->597
                    LINES: 19->1|23->1|25->4|26->5|26->5|26->5|28->7|28->7|28->7|31->10|31->10|31->10|31->10|33->12|33->12|33->12|35->14|35->14|35->14|37->16|39->18|44->23|44->23|44->23|46->25|46->25|50->29
                    -- GENERATED --
                */
            