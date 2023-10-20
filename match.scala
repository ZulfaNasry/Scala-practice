
/*passfail
object passfail extends App{
    def marks(a:Int)= if(a>=50)"pass" else "fail";
    print(marks(55));
}*/

/*find max using match keyword
object main extends App{
    def maximum(x:Int, y:Int):Int= x>y match{
        case true => x
        case false => y
    }
    println(maximum(2,3));
}*/

/*object iseven extends App{
    def iseven(a:Int) = a%2==0 match{
        case true => "even"
        case false => "odd"

    }
    println(iseven(12))
}*/

//using value binding
object passfail extends App{
def grade(mark:Int)= mark match{
  case x if x>=75 => "A"
  case x if x>=65 => "B"
  case x if x>=50 => "C"
  case _ => "F"
  }
println(grade(67))
}
