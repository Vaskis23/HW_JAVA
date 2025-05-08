package Voting_System;

import jdk.jfr.Description;

import java.util.*;

public class Voting {
    private SortedMap<String, Integer> votes = new TreeMap<>();

    /**
     * Records the user's vote via the candidate ID.
     * Does not allow the user to change votes or vote multiple times
     * due to data storage in the {@code SortedMap}.
     *
     * @param username username of the user who is voting
     * @param cands ID of the candidate the user is voting for
     */
    public void vote(String username, Candidates cands) {
        Scanner scanner = new Scanner(System.in);
        Integer candID;

        try {
            System.out.println("Enter id of candidate: ");
            candID = scanner.nextInt();
            if(cands.candidateKeyExists(candID)) {
                votes.put(username, candID);
            } else System.out.println("There is no candidate with ID "+candID);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input type!");
        }
    }

    /**
     * Shows results of voting by counting id's in `votes` map
     * for each candidate. Works even when {@code cands} is empty,
     * but won't show anything.
     * @param cands Candidates object to get id's of
     *              candidates.
     */
    public void showResults(Candidates cands) {
        HashMap<Integer, Integer> results = new HashMap<>();
        for(Integer id : cands.getKeys()) { // Get all candidates id's
            if(!cands.isDeleted(id)) // Except deleted candidates
                results.put(id, 0);
        }
        for(Integer vote : votes.values()) { // Calculates results
            if(results.containsKey(vote)) results.replace(vote, results.get(vote)+1);
        }
        if(!results.isEmpty()) {
            for(Integer key : results.keySet()) { // Prints results of voting
                System.out.print("Candidate with id "+key+" has ");
                System.out.print(results.get(key)+" votes\n");
            }
        } else {
            System.out.println("No votes!");
        }
    }
}