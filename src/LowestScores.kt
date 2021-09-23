fun main() {
    val scores = arrayOf(20, 43, 2, 32)
    var lowest: Int = scores[0]

    for(score in scores){
        if (score < lowest){
            lowest =score
        }
    }
    
    println(lowest)
}