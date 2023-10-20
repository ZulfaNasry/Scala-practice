object interest extends App{
    def interest(x:Float)= x match{     
   case x if x<0 => 0
   case x if x<20000 => x*2/100
   case x if x<200000 => x*4/100
   case x if x<2000000 => x*5.5/100
   case x if x>=2000000 => x*6.5/100
   }
     println(interest(20000))
    }

