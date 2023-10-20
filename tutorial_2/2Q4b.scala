object main extends App{

def attendees(price:Int):Int=120+((15-price)/5)*20
def income(price:Int):Int = attendees(price)*price
def cost(price:Int):Int=500+attendees(price)*3
def profit(price:Int):Int = income(price)- cost(price)
println(profit(10))
println( profit(15))
println(profit(20))
}
