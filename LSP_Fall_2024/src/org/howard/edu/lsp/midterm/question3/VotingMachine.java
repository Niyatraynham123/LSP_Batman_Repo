package org.howard.edu.lsp.midterm.question3;

import java.util.ArrayList;
import java.util.List;

/**
 * Class representing a voting machine that manages candidates and their votes.
 */
public class VotingMachine {
    /** List to store candidates */
    private List<CanidateData> candidates;

    /**
     * Constructor for initializing the VotingMachine.
     */
    public VotingMachine() {
        candidates = new ArrayList<>();
    }

    /**
     * Adds a candidate to the list.
     *
     * @param name The name of the candidate to be added.
     */
    public void addCandidate(String name) {
        // Check if the candidate already exists
        for (CanidateData candidate : candidates) {
            if (candidate.getName().equals(name)) {
                System.out.println("Candidate already exists: " + name);
                return; // Return early if candidate already exists
            }
        }
        candidates.add(new CanidateData(name)); // Adding a new candidate
    }

    /**
     * Casts a vote for the specified candidate.
     *
     * @param name The name of the candidate for whom the vote is cast.
     */
    public void castVote(String name) {
        for (CanidateData candidate : candidates) {
            if (candidate.getName().equals(name)) {
                candidate.addVote(); // Add to the vote count
                return;
            }
        }
        System.out.println("Candidate not found: " + name); // Candidate not found message
    }

    /**
     * Returns a string representation of the candidates and their votes.
     *
     * @return A string containing the names and vote counts of all candidates.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (CanidateData candidate : candidates) {
            result.append(candidate.toString()).append("\n");
        }
        return result.toString();
    }
}
