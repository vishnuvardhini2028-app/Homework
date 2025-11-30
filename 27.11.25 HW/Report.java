
package PrintableDocument;

 class Report implements Printable 
{

    @Override
    public void print() 
    {
        System.out.println("printing invoice");
    }
    
}
