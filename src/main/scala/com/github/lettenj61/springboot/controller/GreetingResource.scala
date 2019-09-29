package com.github.lettenj61.springboot.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class GreetingResource {

  @RequestMapping(Array("/"))
  @ResponseBody 
  def index(): String = {
    "Hello, stranger."
  }
}