import java.io.*;

class WriteToAFile {
    public static void main(String[] args) {
        // create a file and write something to it
        try {
            FileWriter out = new FileWriter("testWrite.txt");
            out.write("Test writing to a file.");
            out.flush();
            out.close();
        }catch( IOException e ) {
            System.err.println(e);
        }
        
        // append something to the file
        try {
            FileWriter out = new FileWriter("testWrite.txt", true);
            out.write("This was added.");
            out.flush();
            out.close();
        }catch( IOException e) {
            System.err.println(e);
        }
    }
}
