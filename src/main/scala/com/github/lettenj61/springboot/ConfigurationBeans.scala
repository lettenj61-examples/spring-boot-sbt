package com.github.lettenj61.springboot

import com.fasterxml.jackson.databind.Module
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import org.springframework.context.annotation._

@Configuration
class ConfigurationBeans {

  @Bean
  val defaultScalaModule: Module =
    DefaultScalaModule
}