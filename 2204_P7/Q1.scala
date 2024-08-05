object filterEvenNum {
    def filterEvenNumbers(numbers: List[Int]): List[Int] = {
        numbers.filter(num => num % 2 == 0)
    }
    def main (args: Array[String]): Unit = {
        val input = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        println("Input numbet list: " + input)
        val output = filterEvenNumbers(input)
        println("Filterd Even number list : " + output)
    }
}


