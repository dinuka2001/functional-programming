object Multiple {

    def MultipleOf(): String = {

        val MultipleOfTree : Int => Boolean = (a) =>  a%3 == 0;
        val MultipleOfFive : Int => Boolean = (a) =>  a%5 == 0;
        
        print("Enter a number: ")
        val userInput = scala.io.StdIn.readInt();

        (MultipleOfTree(userInput), MultipleOfFive(userInput)) match {
            case (true, true) => "Myltiple of 3 and 5!"
            case (false, true) => "Myltiple of 5!"
            case (true, false) => "Myltiple of 3!"
            case (false, false) => "Not Myltiple of 3 or 5!"
        }
    }

    def main(args: Array[String]): Unit = {
        while(true) {
             println(MultipleOf())
        }
    }
}