object Q1 extends App {
    val x = Rational(1,2)
    println(x.neg)
   

    class Rational(n:Int, d:Int) {
        def numer = n
        def denom = d
        def neg = new Rational(-this.numer, this.denom)
        override def toString(): String = numer + "/" + denom
}

}