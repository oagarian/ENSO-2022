package app;

import io.jooby.annotations.*;

@Path("/")
public class Controller {

  @GET
  public String sayHi() {
    return "Adicione a operação correspondente na URL como explicado na ReadMe para utilizar a API!";
  }
}
