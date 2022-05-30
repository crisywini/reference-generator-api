package co.crisi.referencegenerator.utils

import co.crisi.referencegenerator.model.Source
import org.springframework.stereotype.Service

@Service
class ApaService {

    fun convert(source: Source): String{

        val authorsNamesFormat = source.authors
            .map { a -> a.lastName + ", "+ a.name[0]+".," }
            .reduce { acc, s ->  acc+s}

        return authorsNamesFormat + "(" + source.date+"). " + source.title+". Recuperado de "+ source.url+"."
    }

}