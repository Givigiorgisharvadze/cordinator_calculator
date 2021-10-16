// yshi gaaadaadgilebam da xshi da yis da xis temebma magrad amria ;dddddd
fun main() {
    // pointebistvis
    var p1 = Point(17.0, 9.0)
    var p2 = Point(17.0, 9.0)
    // pirveli amocana - toString metodi
    println(p2.toString())

    // meore amocana - equal metodi
    println(p1.equals(p2))
    // mesame amocana  abscisata
    val x_ShiGadaadgileba = xIsGadaadgileba(y = p1.y, k = 2.0)
    println("x-shi gadaadgildeba k = 2.0: " +x_ShiGadaadgileba)
    // mesame amocana ordinatta
    val y_ShiGadaadgileba = yisgadaadgileba(x = p1.x, k = 2.0)
    println("y-shi gadaadgildeba k = 2.0: " + y_ShiGadaadgileba)

    // fractionebistvis
    println (usg (a = 8.0, b = 37.0))
    var f1 = Fraction()
    f1.numerator = 8.0
    f1.denominator = 37.0
    var f2 = Fraction()
    f2.numerator = 6.0
    f2.denominator = 25.0

    // pirveli amocana - wiladebis shekveca: (shekvecamde)
    println(f2)
    println(f1)

    // wiladebis shekveca: (shekvecis mere)
    println(f1.shekvecili())
    println(f2.shekvecili())

    // meore amocana - wiladebis ajamva
    println(f1.damateba(a = 8.0,b = 37.0, c = 6.0, d = 25.0))
    println(f2.damateba(13.0, 21.0, 4.0, 1.0 ))

    // mesame amocana - wiladebis gadamravleba
    println(f1.gamravleba(13.0,21.0,4.0,1.0))
}
// point klasi
class Point (x:Double, y:Double){

    var x: Double = x
    var y: Double = y

    override fun toString(): String {
        return "$x / $y"
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point){
            if(x * other.y / y == other.x)
                return true

        }
        return false

    }

}
fun xIsGadaadgileba (y:Double, k:Double): Double {
    return y - k
}


fun yisgadaadgileba (x:Double, k:Double): Double {
    return x - k
}


// fraction klasi

class Fraction {
    var numerator: Double = 0.0
    var denominator: Double = 0.0

    fun printFraction() {
        println("${this.numerator} / ${this.denominator}")
    }

    override fun toString(): String {
        return "$numerator / $denominator"
    }
    // wiladebis shekvecis funqcia
    fun shekvecili(): String {
        if (numerator == denominator) {
            return "1"
        } else{
            return "${numerator / usg(a=numerator, b=denominator)} / ${denominator / usg(a=numerator, b=denominator)}"
        }
    }

    // wiladebis dasamatabeli funqcia
    fun damateba(a: Double, b: Double, c: Double, d: Double): String {
        if (b == d ){
            return "${a + c} / $b"
        } else {
            return "${a*d+c*b} / ${b*d}"
        }
    }
    fun gamravleba(a: Double, b: Double, c: Double, d: Double):String{
        return "${a*c} / ${b*d}"
    }
}

// funqcia ipovis susgs
fun usg(a: Double, b: Double): Double {
    if (a == b ){
        return a
    }
    if (a > b){
        return usg(a-b, b)
    } else {
        return usg(a, b-a)
    }
}