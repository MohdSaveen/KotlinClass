fun main(){
    val day="Monday"
    when(day){
        "Monday" -> println("Mon")
        "Tuesday" -> println("Tues")
        "Wednesday" -> println("Wed")
        "Thursday" -> println("Thur")
        "Friday" -> println("Fri")
        "Saturday" -> println("Sat")
        "Sunday" -> println("Sun")
        else -> println("Invalid day")
    }
}