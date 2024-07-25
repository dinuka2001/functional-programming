import scala.io.StdIn.readLine;
import scala.collection.mutable
object Q5 {
    //define class Book
    class Book (var title: String, var auther: String, var isbn: String )
    
    def addBook(library : mutable.Set[Book]) = {
        
        print("Enter book title : ")
        var title = readLine()
        print("Enter book's author : ")
        var auther = readLine()
        print("Enter ISBN : ")
        var isbn = readLine()
        var book = new Book(title,auther,isbn)
        library += book
    }

    def removeBook(library: mutable.Set[Book], isbn: String): Unit = {
        val removed = library.find(_.isbn == isbn)

        if (removed.isEmpty) {
        println(s"No book found with ISBN: $isbn")
        }

        removed.foreach(book => {
        library -= book
        println(s"Book removed from library: ${book.title}")
        })
    }
    
    def checkBook(library: mutable.Set[Book], isbn: String): Unit = {
        val found = library.find(_.isbn == isbn)
        found.foreach(book => {
        println(s"Book found in library: ${book.title}")
        })
        if (found.isEmpty) {
        println(s"No book found with ISBN: $isbn")
        }
    }

    def printBook(book : Book): Unit ={
        println(s"title : ${book.title}")
        println(s"auttor : ${book.auther}")
        println(s"ISBN : ${book.isbn}")
        println()
    }

    def printLibrary(library : mutable.Set[Book]):Unit = {
        library.foreach(book => printBook(book))
    }


    def main(args: Array[String]) = {
        
        var book1  = new Book("harry potter","j.k.roling","isbn1")
        val book2 = new Book("The Hobbit", "J.R.R. Tolkien", "isbn2")
        val book3 = new Book("1984", "George Orwell", "isbn3")

        var library = mutable.Set[Book](book1,book2,book3)
        
        //add new book
        addBook(library)
        // printLibrary(library)

        //remove book
        removeBook(library,"isbn2")
        // printLibrary(library)

        //check book
        checkBook(library,"isbn1")
    }
}
