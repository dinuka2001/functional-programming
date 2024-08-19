object interest{

    def getFlat(depositAmount: Double) = depositAmount match {
            case d if d <= 20000 => d*0.02
            case d if d <= 200000 => d*0.04
            case d if d <= 2000000 => d*0.035
            case d if d > 2000000 => d*0.065
        }

    def main(Args: Array[String]): Unit = {
        val depositAmount = 70000
        val interest = getFlat(depositAmount)
        println(s"the interest earned on a deposit of RS. $depositAmount is Rs. $interest")
    }
}