object formater{
    def toUpper: String => String = s => s.toUpperCase()
    def toLower: String => String = s => s.toLowerCase()
    def firs2ToUpper: String => String = s => s.take(2).toUpperCase() + s.drop(2).toLowerCase()
    def cornerToUpper: String => String = s => s.head.toUpper + s.substring(1,s.length-1) + s.last.toUpper

    def formatNames(name: String, formatFunc: String => String): String = {
        formatFunc(name)
    }
    def main (args: Array[String]): Unit = {
        val names = Array("Benny", "Niroshan", "Saman", "Kumara")

        println(formatNames(names(0), toUpper))
        println(formatNames(names(1), firs2ToUpper))
        println(formatNames(names(2), toLower))
        println(formatNames(names(3), cornerToUpper))

    }
}