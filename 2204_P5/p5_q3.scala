import scala.io.StdIn.readLine;

object P5_Q3 {
    def fib(n : Int): Int = {
        if (n <= 1){
            n
        }else{
            fib(n-1) + fib(n-2)
        }
    }

    def fibSequence(n : Int): Unit = {
         for (i<- 0 until n) {
            print(fib(i).toString + "," )
         }
         println()
    }

    def main(args: Array[String]): Unit = {
       fibSequence(14)
    }
}
