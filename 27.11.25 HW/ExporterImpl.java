/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataExporters;

/**
 *
 * @author VISHNUVARDHINI
 */
public class ExporterImpl extends Exporter
{

    @Override
    void Export(String data) 
    {
        System.out.println("Data exported to CSV");
        System.out.println("Data exported to PDF");
    }
    
}
