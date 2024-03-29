package com.github.lettenj61.springboot.controller

import com.github.lettenj61.springboot.model.Visitor
import org.springframework.web.bind.annotation.{ RequestMapping, ResponseBody, RestController }

@RestController
class VisitorResource {

  private val visitors: IndexedSeq[Visitor] =
    (1L to 5L).map(id => Visitor(id, s"Test-$id"))

  @RequestMapping(Array("/visitor/list"))
  @ResponseBody
  def list(): Seq[Visitor] =
    visitors
}
