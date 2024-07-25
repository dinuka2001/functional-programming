import scala.math._
//calculate area of Disck
def AreaOfDisck(radius: Float): Double = {
    return (Pi *radius*radius);
}
// celsius -> Fahrenheit convert
def celsiusToFahrenheit(tempInCelsius: Float): Double = {
    return (tempInCelsius*1.8+32.0);
}
//calculate volume of sphere
def VolumeOfSphere(radius: Float): Double = {
    return (4/3*Pi*radius*radius*radius);
}

//calculate Book Price
def Discount(price: Float) : Double = {
    return (price*0.4);
}

def ShipingCost(pieces: Int) : Double = {
    if (pieces > 50){
        return ((pieces-50) * .75 + 3);
    }else{
        return (3);
    }
}

def BooksPrice(bookPrice : Float = 24.95 , pieces : Int) : Float = {
    bookPrice * pieces
}
def netvalue(pieces : Int , bookPrice : Float = 24.95 ) : Double = {
    val booksPrice = BooksPrice(bookPrice,pieces);
    return (booksPrice-Discount(booksPrice)+ShipingCost(pieces));
}
//end of book price calculation

//calculate total runnig time
def totalRuningTime(): Float = 2*8+7+2*8;

//main method
def main(args: Array[String]): Unit = {
    println ("-"*50);
    println ("Area of a disk with radius 5: ");
    println (AreaOfDisck(5));
    println ("-"*50);
    println ("The temperature is 35\u00B0C in Fahrenheit: ");
    println (celsiusToFahrenheit(35));
    println ("-"*50);
    println ("the Volume of sphere with radius 5: ");
    println (VolumeOfSphere(5));
    println ("-"*50);
    println ("total wholesale cost for 60 copies : ");
    println (netvalue(60));
    println ("-"*50);
    println ("I run 2 km at an easy pace (8 min per km), then 3 km at Tempo (7 min per km) and 2 km at easy pace again to reach home. What is the total running time?");
    println (totalRuningTime());
}
