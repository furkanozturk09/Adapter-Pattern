/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

public class BufferPrinter  implements Printer{

    @Override
    public void print(char c) { }

    @Override
    public void print(char[] buffer) {
        for (char element: buffer) {
            System.out.print(element);
        }
    }    
}
