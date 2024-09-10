object BankOps {

  class Account(var balance: Double) {

    def hasNegativeBalance: Boolean = balance < 0

    def applyInterest(): Unit = {
      if (balance > 0) {
        balance += balance * 0.05  
      } else {
        balance += balance * 0.10 
      }
    }

    override def toString: String = f"Balance: $$ $balance%.2f"
  }

  class Bank(var accounts: List[Account]) {

    def negativeBalances: List[Account] = accounts.filter(_.hasNegativeBalance)

    def totalBalance: Double = accounts.map(_.balance).sum

    def applyInterestToAll(): Unit = accounts.foreach(_.applyInterest())

    def displayAllAccounts(): Unit = {
      accounts.foreach(acc => println(acc))
    }
  }

  def main(args: Array[String]): Unit = {
    val acc1 = new Account(1000.0)
    val acc2 = new Account(-200.0)
    val acc3 = new Account(500.0)
    val acc4 = new Account(-50.0)

    val bank = new Bank(List(acc1, acc2, acc3, acc4))

    println("Initial list of accounts:")
    bank.displayAllAccounts()

    println("\nAccounts with negative balances:")
    bank.negativeBalances.foreach(println)

    val total = bank.totalBalance
    println(f"\nTotal balance of all accounts: $$ $total%.2f")

    bank.applyInterestToAll()
    println("\nList of accounts after applying interest:")
    bank.displayAllAccounts()
  }
}
