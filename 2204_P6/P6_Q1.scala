object P6 {
  class Product(val name: String, val quantity: Int, val price: Float)

  var inventory01: Map[Int, Product] = Map(
    1 -> new Product("sugar", 10, 200),
    2 -> new Product("rice", 20, 160),
    3 -> new Product("salt", 15, 100)
  )

  var inventory02: Map[Int, Product] = Map(
    11 -> new Product("broccoli", 32, 123),
    12 -> new Product("soya", 21, 34),
    13 -> new Product("pumpkin", 35, 324)
  )

  def printProductName(products: Map[Int, Product]): Unit = {
    if (products.nonEmpty) {
      val ((_, product), remaining) = (products.head, products.tail)
      println(product.name)
      printProductName(remaining)
    }
  }

  def calcTotalValue(products: Map[Int, Product], tot: Float): Float = {
    if (products.isEmpty) {
      tot
    } else {
      val ((_, product), remaining) = (products.head, products.tail)
      calcTotalValue(remaining, tot + product.price)
    }
  }

  def findHighestPrice(products: Map[Int, Product]): Float = {
    if (products.isEmpty) {
      0
    } else {
      products.values.map(_.price).max
    }
  }

  def findProduct(products: Map[Int,Product],id : Int): Unit = {
    products.get(id) match {
        case Some(product) => println(s"Ditails of id ${id} : \n Name: ${product.name} \n Quantity: ${product.quantity} \n Price: ${product.price} ")
        case None => println("Not found!")

    }
   }

  def main(args: Array[String]): Unit = {
    
    //print product names
    println("Inventory 01:")
    printProductName(inventory01)

    //calculate total product price
    println("Total product value in inventory01: " + calcTotalValue(inventory01, 0))

    //merge two maps
    val mergedMap: Map[Int, Product] = inventory01 ++ inventory02
    println("Merged Map:")
    printProductName(mergedMap)
    
    //find Highest Price
    println("Highest price: " + findHighestPrice(mergedMap))

    //find product
    findProduct(inventory01,3)
  }
}
