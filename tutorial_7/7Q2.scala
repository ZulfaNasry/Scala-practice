object Q2 extends App {
    val x =  Rational(3,4)
    val y =  Rational(5,8)
    val z =  Rational(2,7)
  
    val a = x-y-z
    
    println(a)
}

class Rational(n:Int, d:Int) {
    def numer = n
    def denom = d
    def neg = Rational(-this.numer, this.denom)
    def add(r:Rational) = Rational(this.numer*r.denom + this.denom*r.numer, this.denom*r.denom)
    def -(r:Rational) = this.add(r.neg)

    override def toString(): String = numer + "/" + denom
}