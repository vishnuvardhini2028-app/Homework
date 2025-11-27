
package LibraryItems;


public class Library 
{
    public static void main(String[] args) 
    {
        Book bk=new Book("Java","James Gosling");
        bk.fn();
        Magazine mg=new  Magazine("Science Weekly",42);
        mg.fn();
    }
}
