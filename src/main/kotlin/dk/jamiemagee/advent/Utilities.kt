package dk.jamiemagee.advent

import java.io.File

internal object Resource

fun resourceAsString(fileName: String, extension: String = "txt", delimiter: String = ""): String =
        File(Resource::class.java.classLoader.getResource("$fileName.$extension").toURI())
                .readLines()
                .reduce { a, b -> "$a$delimiter$b" }

fun resourceAsStringList(fileName: String, extension: String = "txt"): List<String> =
        File(Resource::class.java.classLoader.getResource("$fileName.$extension").toURI())
                .readLines()