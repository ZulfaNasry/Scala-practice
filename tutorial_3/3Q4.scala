object main extends App{
    def bookPrice(x:Int):Double=x*24.95
    def discount(bookPrice:Double):Double=bookPrice*0.4
    def shippingCost(x:Int):Double=if (x>50)3*50+(x-50)*.75 else x*3
    //The total wholesale cost for 60 books
    println(bookPrice(60)-discount(bookPrice(60))+shippingCost(60))
}
