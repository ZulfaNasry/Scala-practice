import scala.io.StdIn.readInt;

object fibo extends App{
    def fibo(x : Int) : Int = x match{
        case x if x == 0 => 0;
        case x if x == 1 => 1;
        case _ => fibo(x - 1) + fibo(x- 2);
    }
    def fiboSeq(x:Int):Unit= {
        if (x > 0) fiboSeq(x - 1);
        println(fibo(x));
    }

    print("Input a value:");
    var num = readInt();
    fiboSeq(num);
}