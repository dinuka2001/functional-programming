object retailStore2{
    
    def displayInventory(itemsArray: Array[String], quantitiesArray: Array[Int]):Unit = {
        for (i <- 0 until itemsArray.length){
            println(s"${itemsArray(i)} : ${quantitiesArray(i)}");
        }
    }

    def reStoreItem(item: String, quantity: Int, itemsArray: Array[String], quantitiesArray: Array[Int]): Unit = {
        val index = itemsArray.indexOf(item);
        if (index == -1){print(s"${item} NOt fund!")}
        if (index >= 0){quantitiesArray(index) = quantity}
    }

    def sellItem(item: String, quantity: Int, itemsArray: Array[String], quantitiesArray: Array[Int]): Unit = {
        val index = itemsArray.indexOf(item);
        if (index == -1){
            print(s"${item} NOt fund!")
        }
        if (index >= 0){
            if(quantitiesArray(index) > 0 && quantitiesArray(index) >= quantity){
                quantitiesArray(index) -= quantity
            }else{
                print("NO enough Items!")
            }
        }
        
    }

    def main(args: Array[String]): Unit = {
        var itemsArray: Array[String] = Array("apple", "greaps","qucumber","tomato")
        var quantitiesArray: Array[Int] = Array(23,12,34,23)
        displayInventory(itemsArray, quantitiesArray)
        reStoreItem("apple",50,itemsArray,quantitiesArray)
        displayInventory(itemsArray,quantitiesArray)
        sellItem("apple",5,itemsArray,quantitiesArray)
        displayInventory(itemsArray,quantitiesArray)


    }
}
