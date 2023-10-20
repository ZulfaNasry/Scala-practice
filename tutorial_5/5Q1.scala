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

 println(prime(5));

}

