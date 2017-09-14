object ReserveTest extends App {
    println(Reservation.newReservationnum)
    println(Reservation.rectarea(5,6))
}

object Reservation {
    private var lastnum = 0
    def newReservationnum(): Int = {
        lastnum += 5
        return lastnum
    }

    def rectarea(L: Int, B: Int) = L*B
}