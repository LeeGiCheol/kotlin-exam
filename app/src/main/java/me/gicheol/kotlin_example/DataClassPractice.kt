package me.gicheol.kotlin_example

data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)

class TicketNormal(val companyName : String, val name : String, var date : String, var seatNumber : Int)

fun main() {
    val ticketA = Ticket("koreanAir", "LEE", "2021-12-31 15:30", 10)
    val ticketB = TicketNormal("koreanAir", "LEE", "2021-12-31 15:30", 10)

    println(ticketA)
    println(ticketB)
}