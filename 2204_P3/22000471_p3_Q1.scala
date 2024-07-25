object Demo {
    def reversOrder(str : String) : String = {
        if (str.isEmpty) ""
        else reversOrder(str.tail) + str.head

    }

    def main (args : Array[String]) = {
        println (reversOrder("hellow"));
    }
}