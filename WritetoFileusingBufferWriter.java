package Assignment7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritetoFileusingBufferWriter {
    public static void main(String args[]) {
        // Writing to a file using BufferedWriter in Java
         try {
        FileWriter writer = new FileWriter("src/names.txt");
        BufferedWriter bwr = new BufferedWriter(writer);
        bwr.write("Neha"); bwr.write("\n");
        bwr.write("Shaik"); bwr.close();
        System.out.println("succesfully written to a file");
         }
         catch (IOException ioe) {
             ioe.printStackTrace();
         }
    } }


