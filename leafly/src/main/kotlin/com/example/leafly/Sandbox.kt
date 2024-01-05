package com.example.leafly

// top level variables /* FIXME: What are the other types of declarations? */
// declared at the beginning and outside the main function
val crumbs = 100
var sticks = 500

/* RECOMMENDED PRACTICE: Auto-declare variables as 'val'. Source: Kotlin Docs */

class Sandbox

/* FIXME: Can't run main() within Sandbox{}. Why? */
fun main() {
    println("Hello, world!")
    // A comment.

    // val: read-only
    val pigeons = 10 // NOTICE: Kotlin automatically inferred type Int. ("val pigeons: Int")

    // var: mutable
    var people = 25 /* FIXME: Variable 'people' is assigned but never accessed
    What does it mean to 'access' a variable'? I thought 'changing the value' == 'accessing'. */

    // pigeons = 25 // "Val cannot be reassigned"
    people = 24

    // crumbs = 1 // "Val cannot be reassigned"
    sticks = 1

    // string templates
    println("I have $crumbs crumbs to feed ${pigeons + 1} pigeons.")

    // string value: "[a-zA-Z0-9]" ; template expression: $variable

    /* THOUGHT PROCESS: If pigeons is a read-only variable (val), then why was I able to write ${pigeons + 1}
    * with no compilation error?
    * EXPLANATION: I am only adding one to the template expression, but not the actual value of pigeons itself.
    * If I print pigeons below, its value is still 10.*/

    println(pigeons)
}

// sticks = 1

/* BASIS: "Variables can be declared outside the main() function at the beginning of your program."
* THOUGHT PROCESS: I focused too much on "can be declared outside ... main()". I jumped to the assumption that I
* would also be able to reuse the variable outside main().
* REALIZATION: The documentation only said I can "declare", not "update the value of", the variable outside main(). */

