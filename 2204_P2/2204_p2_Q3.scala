object XYZ {

  // Function to calculate normal salary
  def calcNormalSalary(hours: Double): Double = {
    hours * 250
  }

  // Function to calculate OT salary
  def calcOTSalary(hours: Double): Double = {
    hours * 85
  }

  // Function to calculate total salary
  def totSalary(normalHours: Double, OTHours: Double): Double = {
    4*(calcNormalSalary(normalHours) + calcOTSalary(OTHours))
  }

  // Function to calculate tax
  def calcTax(totSalary: Double): Double = {
    totSalary * 0.12
  }

  // Function to calculate take-home salary
  def getHomeSalary(normalHours: Double, OTHours: Double): Double = {
    val totalSalary = totSalary(normalHours, OTHours)
    val tax = calcTax(totalSalary)
    totalSalary - tax
  }

  // Main function
  def main(args: Array[String]): Unit = {
    val normalHours = 40
    val OTHours = 30

    var salary = getHomeSalary(normalHours,OTHours);
    println("total salary is : " + salary);
  }
}
