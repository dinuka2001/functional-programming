import  scala.io.StdIn.readLine
object tiketPrice{
    
    def attendees(tiketPrice : Double) = 120+ (15-tiketPrice)*4;

    def revenue(tiketPrice : Double) = attendees(tiketPrice) * tiketPrice;

    def cost(tiketPrice : Double) = 500 + attendees(tiketPrice)*3;

    def profit(tiketPrice : Double) = revenue(tiketPrice)-cost(tiketPrice);

    def main(args : Array[String]) : Unit = {
        while (true) {
            print("Enter ticket Price :");
            val tiketPrice:Double = readLine().toDouble;
            val net = profit(tiketPrice)
            println(s"profit : $net");
        }
    }
}