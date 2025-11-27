
package LibraryItems;


public class Book 
{
    String bookname;
    String authorname;
    Book(String bookname,String authorname)
    {
        this.bookname=bookname;
        this.authorname=authorname;
    }
    void fn()
    {
        System.out.println("book: " +bookname+ " by " + authorname);
    }
}
