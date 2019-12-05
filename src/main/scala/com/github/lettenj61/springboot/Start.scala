package com.github.lettenj61.springboot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class Start extends SpringBootServletInitializer {
  override protected def configure(builder: SpringApplicationBuilder): SpringApplicationBuilder =
    builder.sources(classOf[Start])
}
object Start {
  def main(args: Array[String]): Unit = {
    val _ = SpringApplication.run(classOf[Start], args: _*)
  }
}
