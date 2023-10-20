
object PatternMatching extends App{
    def PatternMatching(x:Int)= x match{
        case x if x<= 0 => "Negative/Zero"
        case x if x>0 && x%2==0 => "Even"
        case x if x>0 && x%2==1 => "odd"
    }
    println(PatternMatching(96))
}