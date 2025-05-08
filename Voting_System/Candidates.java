package Voting_System;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Candidates {
    private final String permissionPassword = "admin123@";
    private boolean editPermission = false;
    private final int ID_START = 1000;
    private static int numberOfCandidates=1;
    private SortedMap<Integer, String[]> candidates = new TreeMap<>();

    /**
     * Method witch unlocks other methods to
     * edit candidates data.
     *
     * @param pass password
     * @return Returns {@code true} when password
     * matches admin password or {@code false} when not
     */
    public boolean editPermission(String pass) {
        if(Objects.equals(permissionPassword, pass)) {
            editPermission = true;
            return true;
        } else {
            editPermission = false;
            return false;
        }
    }

    public void addCandidateMenu() {
        if(editPermission) {
            Scanner scanner = new Scanner(System.in);
            String name;
            String part;

            do {
                System.out.println("To exit enter: .");
                System.out.println("Enter name:");
                name = scanner.nextLine();
                if(name.equals(".")) break;
                System.out.println("Enter part:");
                part = scanner.nextLine();
                addCandidate(name, part);
            } while(true);
        } else System.out.println("You have no permission!");
    }

    private void addCandidate(String name, String part) {
        Pattern namePattern = Pattern.compile("[A-z]\\w+(_|-)[A-z]\\w+");
        Pattern partPattern = Pattern.compile("[A-Z]\\w+");
        Matcher userMatch = namePattern.matcher(name);
        Matcher partMatch = partPattern.matcher(part);

        if (!userMatch.find()) {
            System.out.println("Invalid username format!");
        } else if (!partMatch.find()) {
            System.out.println("Invalid part format!");
        } else {
            String[] candInfo = {name, part};
            if(candidateExists(candInfo)) {
                System.out.println("Candidate already exists!");
            } else {
                candidates.put(ID_START+numberOfCandidates, candInfo);
                numberOfCandidates++;
                System.out.println("Candidate added!");
            }
        }
    }

    /**
     * Checks if in `candidates` map exists a candidate with
     * the same name.
     *
     * @param candInfo String array with name and part of candidate
     * @return {@code true} if there is a candidate with the same name
     * otherwise returns {@code false}.
     */
    public boolean candidateExists(String[] candInfo) {
        boolean result = false;
        for(String[] info : candidates.values()) {
            if (info[0].equals(candInfo[0])) {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean candidateKeyExists(Integer id) {
        return candidates.containsKey(id) && !isDeleted(id);
    }

    public void deleteCandidateMenu() {
        if(editPermission) {
            Scanner scanner = new Scanner(System.in);
            Integer id;

            do {
                System.out.println("To exit enter: 0");
                System.out.println("Enter candidate id:");
                id = scanner.nextInt();
                if(id.equals(0)) break;
                deleteCandidate(id);
            } while(true);
        } else System.out.println("You have no permission!");
    }

    private void deleteCandidate(Integer id) {
        if(candidates.containsKey(id)) {
            candidates.remove(id, candidates.get(id));
            System.out.println("Candidate N."+id+" was removed!");
        } else System.out.println("Invalid id!");
    }

    public void showCandidates() {
        try {
            for(int i = candidates.firstKey(); i <= candidates.lastKey(); i++) {
                if(candidates.containsKey(i)) {
                    System.out.print(i+" ");
                    System.out.println(Arrays.toString(candidates.get(i)));
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("There are no candidates!");
        }
    }

    // Returns set of key for voting system
    public Set<Integer> getKeys() {
        return candidates.keySet();
    }

    public void testData() {
        String[][] testCands = {{"Vladimir-Ivanov", "TestPart1"},{"Random_user", "TestPart2"}, {"Ivan-tester", "USM"}};
        for(String[] cand : testCands) {
            candidates.put(ID_START+numberOfCandidates, cand);
            numberOfCandidates++;
        }
    }

    public boolean isDeleted(Integer id) {
        return candidates.get(id) == null;
    }
}