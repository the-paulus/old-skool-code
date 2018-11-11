/* Example code from JPL pg 228
    Counts the number of bytes in a file or from System.in
    if no file is specified
 */

import java.io.*;

class CountBytes {
    public static void main(String[] args) throws IOException {
        InputStream in;
        if( args.length == 0 )
            in = System.in;
        else
            in = new FileInputStream(args[0]);
            
        int total = 0;
        while( in.read() != -1 )
            total++;
            
        System.out.println("Total bytes: " + total);  
        in.close();                                              
    }
}
