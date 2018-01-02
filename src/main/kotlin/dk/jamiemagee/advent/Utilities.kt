package dk.jamiemagee.advent

import java.io.File

internal object Resource

fun resourceAsString(year: Int, day: Int): String =
        File(Resource::class.java.classLoader.getResource("$year/Day${day}.txt").toURI())
                .readLines()
                .reduce { a, b -> "$a$b" }

fun resourceAsStringList(year: Int, day: Int): List<String> =
        File(Resource::class.java.classLoader.getResource("$year/Day${day}.txt").toURI())
                .readLines()