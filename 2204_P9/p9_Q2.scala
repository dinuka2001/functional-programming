import scala.io.StdIn

def PatternMatching (num : Int) = num match {
        case n if n <= 0 => "Neagative/Zero"
        case n if n%2 == 0 => "Even"
        case n if n%2 != 0 => "Odd" 
    
}

def main (Args: Array[String]): Unit = {
    while (true) {
        print("Enter an Integer : ")
        val input = StdIn.readInt()
        println(PatternMatching(input))
    }
}