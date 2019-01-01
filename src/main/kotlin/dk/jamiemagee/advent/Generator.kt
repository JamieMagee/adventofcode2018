package dk.jamiemagee.advent


import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import khttp.get
import org.junit.jupiter.api.Assertions
import java.io.File
import java.time.LocalDate

fun main(args: Array<String>) {
    print("Enter a year: ")
    val year = try {
        readLine()!!.toInt()
    } catch (e: NumberFormatException) {
        LocalDate.now().year
    }

    print("Enter a day: ")
    val day = try {
        readLine()!!.toInt()
    } catch (e: NumberFormatException) {
        LocalDate.now().dayOfMonth
    }

    val cookie = Resource::class.java.classLoader.getResource("cookie.txt").readText()
            .split("=")
            .chunked(2)
            .associate { (x, y) -> x to y }

    val packageName = "dk.jamiemagee.advent$year"
    val fileName = "Day$day"
    val filePath = "src/main/kotlin"
    val fileTestPath = "src/test/kotlin"

    generateSolution(packageName, fileName, filePath)
    generateTest(packageName, fileName, fileTestPath)
    fetchInput(year, day, cookie)
}

private fun generateSolution(packageName: String, fileName: String, filePath: String) {
    val file = FileSpec.builder(packageName, fileName)
            .addType(TypeSpec.classBuilder(fileName)
                    .primaryConstructor(FunSpec.constructorBuilder()
                            .addParameter("input", String::class)
                            .build())
                    .addProperty(PropertySpec.builder("input", String::class)
                            .initializer("input")
                            .addModifiers(KModifier.PRIVATE)
                            .build())
                    .addFunction(FunSpec.builder("partOne")
                            .build())
                    .addFunction(FunSpec.builder("partTwo")
                            .build())
                    .build())
            .build()

    file.writeTo(File(filePath))
}

private fun generateTest(packageName: String, fileName: String, filePath: String) {
    val testFileName = "${fileName}Test"
    val file = FileSpec.builder(packageName, testFileName)
            .addImport("dk.jamiemagee.advent", ::resourceAsString.name)
            .addType(TypeSpec.classBuilder(testFileName)
                    .addModifiers(KModifier.INTERNAL)
                    .addProperty(PropertySpec.builder("input", String::class)
                            .build())
                    .addFunction(FunSpec.builder("`Part one samples`")
                            .addAnnotation(org.junit.jupiter.api.Test::class)
                            .addAnnotation(org.junit.jupiter.api.Disabled::class)
                            .addCode(CodeBlock.of(
                                    "%T.assertEquals(\"\", $fileName(\"\").partOne())\n",
                                    Assertions::class
                            ))
                            .build())
                    .addFunction(FunSpec.builder("`Part one`")
                            .addAnnotation(org.junit.jupiter.api.Test::class)
                            .addAnnotation(org.junit.jupiter.api.Disabled::class)
                            .addCode(CodeBlock.of(
                                    "%T.assertEquals(%N(\"$fileName\"), $fileName(\"\").partOne())\n",
                                    Assertions::class,
                                    ::resourceAsString.name
                            ))
                            .build())
                    .addFunction(FunSpec.builder("`Part two samples`")
                            .addAnnotation(org.junit.jupiter.api.Test::class)
                            .addAnnotation(org.junit.jupiter.api.Disabled::class)
                            .addCode(CodeBlock.of(
                                    "%T.assertEquals(\"\", $fileName(\"\").partTwo())\n",
                                    Assertions::class
                            ))
                            .build())
                    .addFunction(FunSpec.builder("`Part two`")
                            .addAnnotation(org.junit.jupiter.api.Test::class)
                            .addAnnotation(org.junit.jupiter.api.Disabled::class)
                            .addCode(CodeBlock.of(
                                    "println(%N(\"$fileName\"), $fileName(\"\").partTwo())\n",
                                    Assertions::class,
                                    ::resourceAsString.name
                            ))
                            .build())
                    .build())
            .build()

    file.writeTo(File(filePath))
}

private fun fetchInput(year: Int, day: Int, cookie: Map<String, String>) {
    val input = get("https://adventofcode.com/$year/day/$day/input", cookies = cookie).text.trim()
    File("src/main/resources/$year").mkdirs()
    File("src/main/resources/$year/$day.txt").writeText(input)
}
