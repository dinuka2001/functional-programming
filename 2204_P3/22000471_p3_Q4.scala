import scala.io.StdIn.readLine

object Demo_4 {
    def getListOfInts():List[Int] = {
        printf("Enter set of Integers (separate by commars): ")
        readLine().split(",").map(_.toInt).toList
    } 

    def getSumOfEvenNums(list : List[Int]) : Int = {
        var sum = 0
        for(elem <- list) if(elem%2 == 0) (sum += elem)
        sum
    }
    def main (args : Array[String]):Unit = {
        println(getSumOfEvenNums(getListOfInts()))
    }
}