object AccountOps {

  class Account(var balance: Double) {
    
    def deposit(amount: Double): Unit = {
      if (amount > 0) {
        balance += amount
      } else {
        println("Deposit amount must be positive.")
      }
    }
    
    def withdraw(amount: Double): Unit = {
      if (amount > 0 && amount <= balance) {
        balance -= amount
      } else if (amount > balance) {
        println("Insufficient balance.")
      } else {
        println("Withdrawal amount must be positive.")
      }
    }
    
    def transfer(amount: Double, to: Account): Unit = {
      if (amount > 0 && amount <= balance) {
        this.withdraw(amount)
        to.deposit(amount)
      } else {
        println("Transfer failed. Check the amount and balance.")
      }
    }

    override def toString: String = f"Balance: $$ $balance%.2f"
  }

  def applyTransfer(from: Account, to: Account, amount: Double, operation: (Double, Account) => Unit): Unit = {
    operation(amount, to)
  }

  def main(args: Array[String]): Unit = {
    val acc1 = new Account(1000.0) 
    val acc2 = new Account(500.0)  

    println("Initial balances:")
    println("Account 1: " + acc1)
    println("Account 2: " + acc2)

    applyTransfer(acc1, acc2, 200.0, (amount, toAcc) => acc1.transfer(amount, toAcc))

    println("\nAfter transfer of $200 from Account 1 to Account 2:")
    println("Account 1: " + acc1)
    println("Account 2: " + acc2)

    acc1.deposit(100.0)
    println("\nAfter depositing $100 into Account 1:")
    println("Account 1: " + acc1)

    acc2.withdraw(150.0)
    println("\nAfter withdrawing $150 from Account 2:")
    println("Account 2: " + acc2)
  }
}
