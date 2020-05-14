package lec17io2;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class AddLineNumberForFile {
    public static void main(String[] args) {
        String inputFile="demo/test.txt";
        String outputFile="demo/test2.txt";
        try{


            Scanner cin=new Scanner(new File(inputFile));
            PrintWriter cout=new PrintWriter(new File(outputFile));
            int number=0;
            while(cin.hasNextLine()){
                String line=cin.nextLine();
                cout.printf("%02d\t",++number);
                cout.println(line);
            }

            cin.close();
            cout.close();

        }catch (Exception e){
            e.printStackTrace();

        }
    }
}
