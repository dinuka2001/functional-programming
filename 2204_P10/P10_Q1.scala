class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator must not be zero")
  
  private val gcd = gcdMath(n.abs, d.abs)
  val numerator: Int = n / gcd
  val denominator: Int = d / gcd
  
  def neg: Rational = new Rational(-numerator, denominator)
  private def gcdMath(a: Int, b: Int): Int = if (b == 0) a else gcdMath(b, a % b)
  override def toString: String = s"$numerator/$denominator"
}

object Main {
  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)
    println(x.neg) 
  }
}
