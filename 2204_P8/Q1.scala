object julius_Caesar{
    def Encript(text: String): String = {
        text.map(c => (c+1).toChar)
    }

    def Decript(text: String): String = {
        text.map(c => (c-1).toChar)
    }

    def Clipher(text: String, method: String => String ): String  = {
        method(text)
    }


    def main(args: Array[String]): Unit ={
        val text = "dinuka"
        println("Initial text: "+ text)
        val encText = Clipher(text,Encript)
        println("Encripted text: "+ encText)
        val decText = Clipher(encText,Decript) 
        println("Decripted text " + decText)
    }

}