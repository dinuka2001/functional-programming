import scala.io.StdIn.readLine;
import scala.collection.mutable.ListBuffer
object P5_Q1 {
    def getProductList(productList: ListBuffer[String]) : ListBuffer[String] = {
        printf("Enter Product name:");
        val product = readLine();
        if(product.toLowerCase() == "done"){
            productList
        }else{
            productList += product; 
            getProductList(productList);
        }
        
    }

    def printProductList(productList: ListBuffer[String]):Unit = { 
        if(productList.isEmpty){
            println("List Empty!");
        }else{
            println(productList);
        }
    }

    def getTotalProducts (productList: ListBuffer[String]):Int = {
        productList.length;
    }

    def main(args: Array[String]) = {
        val productList: ListBuffer[String] = ListBuffer("apple", "greaps","qucumber","tomato")

        printProductList(getProductList(productList));
        
        print("Total products: " + getTotalProducts(productList))

    }
}
