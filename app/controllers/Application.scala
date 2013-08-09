package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import models.Todo

object Application extends Controller {
  
  val todoForm = Form(
    "text" -> nonEmptyText
  )
  
  def index = Action {
	  Ok("Hello world")
  }
    
  def todos = Action {
	  Ok(views.html.index(Todo.all(), todoForm))
  }
  
  def newTodo = Action { implicit request =>
	  todoForm.bindFromRequest.fold(
	    errors => BadRequest(views.html.index(Todo.all(), errors)),
	    text => {
	      Todo.create(text)
	      Redirect(routes.Application.todos)
	    }
	  )
  }
  
  def deleteTodo(id: Long) = Action {
	  Todo.delete(id)
	  Redirect(routes.Application.todos)
  }

}