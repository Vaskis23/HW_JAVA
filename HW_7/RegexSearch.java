package HW_7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.*;

public class RegexSearch {
    private  static void writeFile(FileWriter writer, int lineCounter, String result){
        try {
            writer.append("Match found on line "+lineCounter+":\n");
            writer.append(result+"\n");
        } catch (IOException e) {
            System.out.println("Error occurred when writing output file!");
        }
    }

    private static void finder(Pattern pattern){
        try {
            FileWriter writer = new FileWriter("src\\hm7\\output.txt", false); // Change true -> false if you want to rewrite output file
            File inputFile = new File("src\\hm7\\input.txt");
            Scanner input = new Scanner(inputFile);

            int lineCounter=0;
            while(input.hasNext()){
                String line = input.nextLine();
                lineCounter++;
                Matcher matcher = pattern.matcher(line);
                boolean matchFound = matcher.find();

                if(matchFound){
                    writeFile(writer, lineCounter, matcher.group()); //To return whole line use 'line' instead of 'matcher.group()'
                }
            }
            input.close();
            writer.close();


        } catch (FileNotFoundException e) {
            System.out.println("Input file not found!");
        } catch (IOException e) {
            System.out.println("Error occurred when creating output file!");
        }
    }

    public static void main(String[] args) {
        final String[] patterns = {"\\+[0-9]{1,3}-[0-9]{3}-[0-9]{3}-[0-9]{4}", "\\w+@\\w+\\.\\w+", "[A-Z]\\w+(\\s|-)[A-Z]\\w+"}; //Prepared patterns

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any pattern: ");
        System.out.println("Or choose from existed(format: \\n):\n1.Phone\n2.Email\n3.Name");
        String inputPattern = scanner.nextLine();
        Pattern inputRegex = Pattern.compile("^\\\\[1-9]$");
        Pattern pattern = Pattern.compile("");

        boolean flag = true;

        try {
            if(inputRegex.matcher(inputPattern).find()){
                int choice = Integer.parseInt(String.valueOf(inputPattern.charAt(1)))-1; //Get integer from string
                if(choice<0 | choice>2) {
                    System.out.println("No such option!");
                    flag = false;
                } else pattern = Pattern.compile(patterns[choice]);
            } else {
                pattern = Pattern.compile(inputPattern);
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (PatternSyntaxException e) {
            System.out.println("Incorrect pattern!");
        }

        if(flag) finder(pattern); //Run finder() if input is correct
    }
}