package dk.jamiemagee.advent2017

import java.io.File

internal object Resource

fun resourceAsString(fileName: String, extension: String = "txt", delimiter: String = ""): String =
        File(Resource::class.java.classLoader.getResource("$fileName.$extension").toURI())
                .readLines()
                .reduce { a, b -> "$a$delimiter$b" }

fun resourceAsStringList(fileName: String, extension: String = "txt"): List<String> =
        File(Resource::class.java.classLoader.getResource("$fileName.$extension").toURI())
                .readLines()

operator fun List<String>.component6(): String {
    return this.get(5)
}

operator fun List<String>.component7(): String {
    return this.get(6)
}