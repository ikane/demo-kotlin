import kotlin.random.Random

val foo: Int
    get() {
        val random = Random
        return random.nextInt()
    }

fun main(args: Array<String>) {
    // The values should be different:
    println(foo)
    println(foo)
    println(foo)
}