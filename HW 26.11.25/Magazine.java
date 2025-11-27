
package LibraryItems;


public class Magazine 
{
    String subject;
    int mark;
    Magazine(String subject,int mark)
    {
        this.subject=subject;
        this.mark=mark;
    }
    void fn()
    {
        System.out.println("Magazine: " +subject+ " - "+" Issue "+ mark);
    }
}
