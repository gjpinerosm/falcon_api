package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}

class Mock2 @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def sayHello = Action(parse.xml) { request =>
    (request.body \\ "name" headOption)
      .map(_.text)
      .map { name =>
        Ok("Hello " + name)
      }
      .getOrElse {
        BadRequest("Missing parameter [name]")
      }
  }
}
