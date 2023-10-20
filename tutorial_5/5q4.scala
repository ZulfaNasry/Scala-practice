import scala.io.StdIn.readInt;

object EvenOdd extends App {
    def evenOdd(a:Int) : Unit = {
        if(a%2 == 0) {
            printf(a+" even\n");
        }
        else if(a%2 == 1) {
            printf(a+" odd\n");
        }
        if(a > 1)
        evenOdd(a - 1);
    }

    print("Enter a number to get odd even values: ");
    var num = readInt();
    evenOdd(num);
}