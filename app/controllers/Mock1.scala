package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}

class Mock1 @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def hello(name: String) = Action{
    if(name == "gio") {
      Ok("Hola " + name)
    }
    if(name == "javi"){
      Ok("Bye " + name)
    }
    NotFound("No se encuentra el nombre: " + name)
  }

}
