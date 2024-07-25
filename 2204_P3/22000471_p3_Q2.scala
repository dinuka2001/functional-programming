object Demo2 {
    def filterString (list : List[String]) : List[String] = {
        var list2 : List[String] = List();
        for (elem <- list) {
            if (elem.length > 5) list2 = list2 :+ elem
        }
        list2
    }

    def main (args : Array[String]):Unit = {
        val list = List("matara","colombo","yala","gall","polonnaruwa");
        println(filterString(list));
    }
}