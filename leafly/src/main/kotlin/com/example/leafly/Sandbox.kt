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
    val pigeons = 10 // TYPE INFERENCE: Kotlin automatically inferred type Int. ("val pigeons: Int")

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

    // augmented assignments
    sticks += 1; sticks -=25; sticks /= 25; sticks *= 5 /* SEMI-COLON USE CASE: to separate statements in one line */

    lists()
    conditionals()
}

// sticks = 1

/* BASIS: "Variables can be declared outside the main() function at the beginning of your program."

* THOUGHT PROCESS: I focused too much on "can be declared outside ... main()". I jumped to the assumption that I
* would also be able to reuse the variable outside main().

* REALIZATION: The documentation only said I can "declare", not "update the value of", the variable outside main(). */

fun variables() {
    // variable initialization : to set the initial value of a variable
    val hiccups_per_hour = 25

    // variable declaration without initialization
    val weight : Double

    // explicit variable declaration + initialization
    val warts : UInt = 2u // UInt: Unsigned Integer (No positive or negative sign.)

    // INTERESTING: An escape is considered a Char even if it has two characters.
    val next_line : Char = '\n'

    /* FIXME: What's the purpose of a Float? How does it differ from a Double? */
}

fun lists() {
    val foreverFriends = listOf("Marga", "Inna", "Sophia", "Lai") // NOTE: type inference for elements
    val moreFriends = mutableListOf("Winona", "Chelsea", "Kim") // Mutable List

    // explicit type declaration
    val guyFriends : MutableList<String> = mutableListOf("Jerome", "Aeris", "Sean", "Achilles")

    /* FIXED: Is a Mutable List still mutable if it's a val and not a var? Why or why not?

    * ANSWER: It is immutable in the sense that it cannot be re-assigned to any new value (whether it be a new
    * instance of a list or a completely different value with a different data type). However, it is mutable in a
    * sense that operations like add() can be done on the mutable list but not on the read-only list.

    * BASICALLY:
    * read-only (val): prevents reassignment in variable;
    * read-only (list): prevents element alteration in list*/

    // casting mutable list to read-only list
    val moreFriendsLocked : List<String> = moreFriends

    // accessing elements in a list
    println("${foreverFriends[0]} is a huge fan of Le Sserafim's Heo Yunjin.")
    println("${foreverFriends.last()}'s goal is to become a lawyer.")

    // count elements in a list
    println("I have ${foreverFriends.count()} childhood girl best friends.")

    // in operator : to check if an element is in the list
    println("It is ${"Jerome" in guyFriends} that ${guyFriends[0]} is a guy friend of mine.")

    // extension functions
    guyFriends.add("James"); guyFriends.remove("Achilles")

    /* IDEA: Since maps require unique keys and sets contain unique values, I can use a set to set the keys in a map.
    * Downside is I might have a hard time mapping values to the keys because of the lack of order in a set. */
}


fun conditionals() {
    var cloud = "Nimbus"
    val has_silver_lining = true

    // if statement (same as java w/o semi-colons)

    // 'if' as an expression [no ternary operator condition : then ? else]
    if (has_silver_lining) cloud = "Stratus" else cloud = "Cummulus"


    // when statement (similar to java switch case)
    when (cloud) {
        "Nimbus" -> println("Ha!")
        "Cirrus" -> println("Lol!")
        else -> println("Aw...") // default statement NOT mandatory
    }

    // 'when' as an expression
    var pain_level = 1
    var remark = when {
        pain_level > 100 -> "WTF!"
        pain_level > 50 -> "Ack!"
        pain_level > 30 -> "Ouch!"
        pain_level > 10 -> "Easy peasy!"
        else -> "I don't feel  nothing!" /* 'when' expression must be exhaustive, add necessary 'else' branch */
    }
}

