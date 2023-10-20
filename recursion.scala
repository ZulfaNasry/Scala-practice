object GCD extends App{
    def GCD(a:Int, b:Int):Int=b match{
        case 0 => a 
        case b if b>a => GCD(b,a) 
        case _ => GCD(b,a%b) 
    }
        
        println(GCD(30,20))
}

