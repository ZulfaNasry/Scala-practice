import scala.io.StdIn.readInt;

object prime extends App{
def GCD(a:Int, b:Int):Int=b match{
        case 0 => a 
        case b if b>a => GCD(b,a) 
        case _ => GCD(b,a%b) 
}
def prime(p:Int,n:Int=2):Boolean= n match {
   case a if(a==p) => true   
   case a if GCD(p,a)>1 => false
   case a => prime(p,a+1)
 }

    def primeSeq(n:Int) : Unit={
        if(n>1){
            primeSeq(n-1);
            if (prime(n)==true) println(n);
        }
    }

    print("Input a value:");
    var num = readInt();
    primeSeq(num);
}