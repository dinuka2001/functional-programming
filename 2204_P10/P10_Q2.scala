object RationalOps {

  class Rational(n: Int, d: Int) {
    require(d != 0, "Denominator must not be zero")

    private val gcd = gcdMath(n.abs, d.abs)
    val numerator: Int = n / gcd
    val denominator: Int = d / gcd

    def sub(that: Rational): Rational = {
      val newNumerator = this.numerator * that.denominator - this.denominator * that.numerator
      val newDenominator = this.denominator * that.denominator
      new Rational(newNumerator, newDenominator)
    }

    def mul(that: Rational): Rational = {
      new Rational(this.numerator * that.numerator, this.denominator * that.denominator)
    }

    private def gcdMath(a: Int, b: Int): Int = if (b == 0) a else gcdMath(b, a % b)

    override def toString: String = s"$numerator/$denominator"
  }

  def applyOperation(x: Rational, y: Rational, z: Rational, operation: (Rational, Rational) => Rational): Rational = {
    val result = operation(y, z)
    x.mul(result)
  }

  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)

    println("Initial values:")
    println(s"x = $x, y = $y, z = $z")

    val finalResult = applyOperation(x, y, z, (a, b) => a.sub(b))

    println("Final result (x * (y - z)): " + finalResult)
  }
}
