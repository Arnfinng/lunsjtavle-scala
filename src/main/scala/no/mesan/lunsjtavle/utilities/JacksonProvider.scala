package no.mesan.lunsjtavle.utilities

import javax.ws.rs.ext.{ContextResolver, Provider}

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule

@Provider
class JacksonProvider extends ContextResolver[ObjectMapper] {

  val defaultObjectMapper = {
    val jsonObjectMapper = new ObjectMapper()
    jsonObjectMapper.registerModule(DefaultScalaModule)
    jsonObjectMapper
  }

  override def getContext(typ: Class[_]): ObjectMapper = {
    defaultObjectMapper
  }
}