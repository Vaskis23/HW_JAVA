package Voting_System;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static void generateTestData(Users usr, Candidates cands) {
        usr.testData(); // {{"First-user", "123456"}, {"tester_test", "Testpass123"}, {"Vlad_Gray", "vlad6556"}}
        cands.testData(); // {{"Vladimir-Ivanov", "TestPart1"}, {"Random_user", "TestPart2"}, {"Ivan-tester", "USM"}}
    }

    public static void main(String[] args) {
        Users users = new Users();
        Candidates candidates = new Candidates();
        Voting votingSystem = new Voting();

        do {
            Scanner scanner = new Scanner(System.in);
            int choice;

            System.out.println("Welcome to Voting Program!\nThis is main menu.\nChoose option from list:");
            System.out.println("1.LogIn\n2.Register\n3.Edit Candidates\n4.Voting results\n5.Generate test data");

            try {
                choice = scanner.nextInt();
                if(choice<1 | choice>5) {
                    System.out.println("Incorrect option!\nPlease try again.");
                    continue;
                }

                switch(choice) {
                    case 1 -> userLogIn(users, candidates, votingSystem);
                    case 2 -> registration(users);
                    case 3 -> editCandidates(candidates);
                    case 4 -> showResults(votingSystem, candidates);
                    case 5 -> generateTestData(users, candidates);
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type!");
            }
        } while(true);
    }

    //Manipulation methods
    private static void registration(Users usr){
        String username;
        String password;
        Scanner scanner = new Scanner(System.in);
        boolean NotRegistred;
        do {
            System.out.println("To exit enter: .");
            System.out.println("Enter username:");
            username = scanner.nextLine();
            if(username.equals(".")) break;
            System.out.println("Enter password:");
            password = scanner.nextLine();
            NotRegistred = !usr.addUser(username, password);
        } while(NotRegistred);
    }

    private static void userLogIn(Users usr, Candidates cands, Voting votingS){
        String username;
        String password;
        Scanner scanner = new Scanner(System.in);
        boolean NotLogIn = true;
        do {
            System.out.println("To exit enter: .");
            System.out.println("Enter username:");
            username = scanner.nextLine();
            if(username.equals(".")) break;
            System.out.println("Enter password:");
            password = scanner.nextLine();
            if(!usr.isUserRegistered(username)){
                System.out.println("User with name `"+username+"` is not registered!");
                System.out.println("Try again, or register!");
                continue;
            }
            NotLogIn = !usr.logIn(username, password);
            if(NotLogIn) System.out.println("Incorrect password! Try again!");
        } while(NotLogIn);
        userPanel: while(!NotLogIn) {
            int choice;

            System.out.println("Welcome "+username);
            System.out.println("Menu:\n1.Show candidates\n2.Vote\n3.Exit");

            try {
                choice = scanner.nextInt();
                if(choice<1 | choice>3) {
                    System.out.println("Incorrect option!\nPlease try again.");
                    continue;
                }

                switch (choice) {
                    case 1 -> cands.showCandidates();
                    case 2 -> votingS.vote(username, cands);
                    case 3 -> {
                        break userPanel;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type!");
            }
        }
    }

    private static void editCandidates(Candidates cands){
        String password;
        Scanner scanner = new Scanner(System.in);
        boolean hasPermission = false;
        do {
            System.out.println("To exit enter: .");
            System.out.println("Enter password:"); // admin123@
            password = scanner.nextLine();
            if(password.equals(".")) break;
            hasPermission = cands.editPermission(password);
            if(!hasPermission) System.out.println("Incorrect password!");
        } while(!hasPermission);
        adminPanel: while(hasPermission) {
            int choice;

            System.out.println("Welcome to admin panel!");
            System.out.println("Menu:\n1.Show candidates\n2.Add candidates\n3.Delete candidates\n4.Exit");

            try {
                choice = scanner.nextInt();
                if(choice<1 | choice>4) {
                    System.out.println("Incorrect option!\nPlease try again.");
                    continue;
                }

                switch (choice) {
                    case 1 -> cands.showCandidates();
                    case 2 -> cands.addCandidateMenu();
                    case 3 -> cands.deleteCandidateMenu();
                    case 4 -> {
                        break adminPanel;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type!");
            }
        }
        cands.editPermission("."); // Try to get permission with incorrect password to block access when exiting admin panel
    }

    private static void showResults(Voting votingS, Candidates cands) {
        votingS.showResults(cands);
    }
}