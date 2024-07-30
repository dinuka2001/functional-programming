object P6_Q2{
    def calcGrade(percentage : Double): Char = {
        percentage match{
            case p if p >= 75 => 'A'
            case p if p >= 90 => 'B'
            case p if p >= 50 => 'C'
            case _ => 'D'
        }
    }

    def getStudentInfo(): (String, Int, Int, Double, Char) = {
        println("Enter Student's name: ")
        val name : String = scala.io.StdIn.readLine()

        println("Enter Student's marks: ")
        val marks: Int = scala.io.StdIn.readInt()

        println("Enter Student's marks: ")
        val totPosibleMarks: Int = scala.io.StdIn.readInt()

        val percentage :Double = (marks.toDouble / totPosibleMarks) * 100
        val grade: Char = calcGrade(percentage)

        (name, marks, totPosibleMarks, percentage, grade)

    }

    def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
        val (name, marks, totPosibleMarks, percentage, grade) = record
        println(s"Name: $name")
        println(s"marks: $marks")
        println(s"totPosibleMarks: $totPosibleMarks")
        println(s"percentage: $percentage")
        println(s"grade: $grade")
    }

    def validateInput(name: String, marks: Int, totPosibleMarks: Int): (Boolean, Option[String]) = {
        if (name.isEmpty){
            (false, Some("Name cannot be empty"))
        }else if (marks < 0 || marks > totPosibleMarks) {
            (false, Some("Marks must be between 0 and total marks."))
        }else if (totPosibleMarks <= 0){
            (false, Some("Total marks must be greater than zero"))
        }else{
            (true, None)
        }
    }

    def getStudentInfoWithRetry(): (String, Int, Int, Double, Char) = {
        var isValid = false
        var stInfo: (String, Int, Int, Double, Char) = ("", 0, 0, 0.0, 'F')
        
        while (!isValid) {
            stInfo = getStudentInfo()
            val (name, marks, totPosibleMarks, _, _) = stInfo
            val (validationResult, erroMassage) = validateInput(name, marks, totPosibleMarks)
            if(validationResult){
                isValid = true
            }else{
                println(erroMassage.getOrElse("Invalid input"))
            }
        }
         stInfo
    }
    def main(args: Array[String]): Unit = {
        val studnetRecord = getStudentInfoWithRetry()
        printStudentRecord(studnetRecord)
    }
}