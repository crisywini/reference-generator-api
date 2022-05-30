package co.crisi.referencegenerator.controller

import co.crisi.referencegenerator.model.Source
import co.crisi.referencegenerator.utils.ApaService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.http.HttpStatus.OK
import org.springframework.web.bind.annotation.RequestMapping

@RestController
@RequestMapping("/apa-citations")
class ApaController(private val apaService: ApaService) {

    @GetMapping("/test")
    fun test() = "test"

    @GetMapping
    fun doCitation(@RequestBody source: Source): ResponseEntity<String> =
        ResponseEntity(apaService.convert(source), OK)

}