package no.mesan.lunsjtavle.users

import javax.ws.rs.core.MediaType
import javax.ws.rs.{GET, Path, Produces}

@Path("/api/")
class UsersRestService {

  var users = List(new User("Arnfinn", 1), new User("Knut", 2), new User("Øystein", 3))
  @GET
  @Path("users")
  @Produces(Array("application/json"))
  def getAllUsers(): List[User] = {
    return users
  }

  @GET
  @Path("user/{id}")
  @Produces(Array(MediaType.APPLICATION_JSON))
  def getUserById(id : Int): String ={
    return ""//users.find(u => u.id == 2);
  }
}
