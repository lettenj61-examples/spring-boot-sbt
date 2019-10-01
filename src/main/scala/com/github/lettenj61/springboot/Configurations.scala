package com.github.lettenj61.springboot

import com.fasterxml.jackson.module.scala.DefaultScalaModule
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder
import org.springframework.stereotype.Component

@Component
class JacksonCustomizer extends Jackson2ObjectMapperBuilderCustomizer {
  override def customize(builder: Jackson2ObjectMapperBuilder): Unit = {
    val _ = builder.modules(DefaultScalaModule)
  }
}
