package co.crisi.referencegenerator.model

import java.time.LocalDate

data class Source(var title: String, var url: String, var authors: List<Author>, var date: LocalDate)
