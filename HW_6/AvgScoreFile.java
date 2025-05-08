package HW_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class AvgScoreFile {
    public static void main(String[] args) {
        int sum=0, count=0;
        double avg;
        try{
            File inputFile = new File("C:\\projects\\JavaQA\\JavaS_HM\\src\\hm6\\input.txt");
            Scanner scanner = new Scanner(inputFile);

            while(scanner.hasNextLine()){
                if(count==0) {
                    count=scanner.nextInt();
                    scanner.nextLine();
                }
                String line = scanner.nextLine();
                Scanner number = new Scanner(line);

                while(number.hasNextInt()){
                    sum += number.nextInt();
                }
                number.close();
            }
            scanner.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found!");
        }
        avg = (double) sum /count;
        String out_avg = Double.toString(avg);
        try{
            FileWriter outputFile = new FileWriter("src\\hm6\\output.txt", false);

            outputFile.write(out_avg);
            outputFile.close();
        } catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}