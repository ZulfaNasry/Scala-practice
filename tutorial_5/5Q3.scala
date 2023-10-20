import scala.io.StdIn.readInt;

object sum extends App {
    var b:Int = 0;
    def sum(a:Int): Unit={
        b = b + a; 
        if(a>0) sum(a - 1);
        else print(b); 
    }

    print("enter a value:");
    var num = readInt();
    sum(num);
}
