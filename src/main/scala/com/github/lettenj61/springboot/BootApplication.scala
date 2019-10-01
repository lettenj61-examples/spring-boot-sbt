package com.github.lettenj61.springboot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class BootApplication

object BootApplication {

  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[BootApplication], args: _*)
  }
}
