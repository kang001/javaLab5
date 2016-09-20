package com.Kara;

import java.io.*;

class Main {

    public static void main(String[] args) {
       String filename = "Kara.txt";
        try (BufferedReader bufReader = new BufferedReader(new FileReader(filename));) {

           BufferedWriter bufWriter = new BufferedWriter(new FileWriter("Kara.txt"));



           bufWriter.write("Kara \r\n");
           bufWriter.write("Blue \r\n");
           bufWriter.write(2425 + "\r\n");
           bufWriter.close();

           String line = bufReader.readLine();


           while (line != null) {
               System.out.printf(line);

               line = bufReader.readLine();
           }

           bufReader.close();
       } catch (IOException ioe){
           System.out.println("Could not open or read " + filename);
           System.out.println(ioe.toString());
       }
        System.out.println("If the code did not work, the program did not crash");

    }
}
