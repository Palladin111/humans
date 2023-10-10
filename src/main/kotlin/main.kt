fun main() {

    val likes = 1011

    if (likes % 10 === 1 && likes % 100 / 10 != 1) {
        println("Понравилось " + likes + " человеку")
    } else {
        println("Понравилось " + likes + " человекам")
    }
}