package chap13

fun main() {
    for (i in 1..9) {
        for (j in 1..9) {
//            print("${i}x${j}=${i * j} ")
            print("%dx%d=%d ".format(i,j,i*j))
        }
        println()
    }
}