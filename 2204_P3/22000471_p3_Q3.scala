object Demo_3 {
    def roundToTwoDecimals (num : Float) : Float = {
        Math.round(num * 100.0)/100.0f
        // Math.round(num * 100)/100.toFloat
    }
    def getMean(num1 : Float, num2 : Float) : Float = {
        val mean = ((num1 + num2) / 2);
        println (mean)
        roundToTwoDecimals(mean)
    }

    def main (args : Array[String]):Unit = {
        println(getMean(34.4567,4.3));
    }
}