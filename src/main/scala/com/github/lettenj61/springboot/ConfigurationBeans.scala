package com.github.lettenj61.springboot

import java.util.{ List => JList }

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import org.springframework.context.annotation._
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.converter.json.{ Jackson2ObjectMapperBuilder, MappingJackson2HttpMessageConverter }
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class ConfigurationBeans {

  @Bean
  val webMvcConfigurer: WebMvcConfigurer = new WebMvcConfigurer {
    override def configureMessageConverters(converters: JList[HttpMessageConverter[_]]): Unit = {
      super.configureMessageConverters(converters)

      val mapper = new ObjectMapper().registerModule(DefaultScalaModule)

      val converter = new MappingJackson2HttpMessageConverter
      converter.setObjectMapper(mapper)

      converters.add(converter)
    }
  }
}
