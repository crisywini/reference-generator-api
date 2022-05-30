package co.crisi.referencegenerator.utils

import co.crisi.referencegenerator.model.Author
import co.crisi.referencegenerator.model.Source
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import java.time.LocalDate

internal class ApaServiceTest {


    private val apaService = ApaService()

    @Test
    fun convert() {
        // Given
        val expectedCitation = "Apellido, N.,Apellido, J.,Apellido, J.,(2022-05-30). Title. Recuperado de title.com."
        val source = getScenarioZero()
        // When
        val citation = apaService.convert(source)
        // Then
        assertEquals(expectedCitation, citation)
    }

    private fun getScenarioZero(): Source {

        val authors = mutableListOf<Author>()
        authors.add(Author("Nicolas", "Apellido"))
        authors.add(Author("Jose", "Apellido"))
        authors.add(Author("Jeff", "Apellido"))

        return Source("Title", "title.com", authors, LocalDate.now())
    }
}