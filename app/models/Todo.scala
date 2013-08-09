package models

import anorm._
import anorm.SqlParser._
import play.api.db._
import play.api.Play.current

case class Todo(id: Long, text: String)

object Todo {

  val todo = {
	  get[Long]("id") ~ 
	  get[String]("text") map {
	  	case id~text => Todo(id, text)
	  }
  }
  
  def all(): List[Todo] = DB.withConnection { implicit c =>
  	SQL("select * from todo").as(todo *)
  }

  def create(text: String) {
	DB.withConnection { implicit c =>
      SQL("insert into todo (text) values ({text})").on(
        'text -> text
      ).executeUpdate()
    }
  }

  def delete(id: Long) {
    DB.withConnection { implicit c =>
      SQL("delete from todo where id = {id}").on(
        'id -> id
      ).executeUpdate()
    }
  }
}