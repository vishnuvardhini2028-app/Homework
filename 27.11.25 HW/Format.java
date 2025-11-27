
package MessageFormatters;


public class  Format extends FormatterImpl
{

    @Override
    void XmlFormatter() 
    {
        System.out.println("<message>hello</message>.");
    }

    @Override
    void JsonFormatter() 
    {
       System.out.println("{\"message\":\"hello\"}");

    }

    
}
