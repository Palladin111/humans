fun main() {

    val likes = 2
    val varLikes = likes % 10

    if (varLikes === 1) {
        println("Понравилось " + likes + " человеку")
    } else {
        println("Понравилось " + likes + " человекам")
    }
}