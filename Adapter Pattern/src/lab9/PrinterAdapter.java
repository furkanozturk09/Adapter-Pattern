/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;


public class PrinterAdapter implements PrinterRoom{

    Printer printer;

    public PrinterAdapter(String printerType) {
        if(printerType.equalsIgnoreCase("char") )
        {
            printer = new CharPrinter();            
        }
        else if (printerType.equalsIgnoreCase("buffer"))
        {
            printer = new BufferPrinter();
        }	
    } 
    
    
    @Override
    public void print(String printType, String text) 
    {        
        if(printType.equalsIgnoreCase("char"))
        {
            char[] charArray = text.toCharArray();
            for(int i = 0; i < text.length() ; i++)
            {
                printer.print(charArray[i]);
            }            
        }
        else if(printType.equalsIgnoreCase("buffer"))
        {    
            int m = 0, t = 4;
            
            for(int i = 0; i <= Math.ceil(text.length()/3); i++)
            {   
                if (m < text.length()) 
                {   
                    if(t<3)
                    {
                        char[] subText = (text.substring(m, m+t)).toCharArray();             
                        printer.print(subText);
                        System.out.println();
                    }
                    else
                    {
                        char[] subText = (text.substring(m, m+3)).toCharArray();             
                        printer.print(subText);
                        System.out.println();
                        m += 3;
                        t = text.length()- m;  
                    }
                }
            }
        }
    }    
}
