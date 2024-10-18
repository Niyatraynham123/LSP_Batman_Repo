package org.howard.edu.lsp.midterm.question3;

/**
 * Class representing a candidate in an election.
 */
public class CanidateData {
    /** The name of the candidate */
    private String name;
    
    /** The number of votes received by the candidate */
    private int votes;
    
    /**
     * Constructor for creating a CanidateData object.
     *
     * @param name The name of the candidate.
     */
    public CanidateData(String name) {
        this.name = name;
        this.votes = 0; /** Initialize vote count to 0 */
    }
    
    /** 
     * Returns the name of the candidate.
     *
     * @return The name of the candidate.
     */
    public String getName() {
        return name;
    }

    /** 
     * Returns the number of votes received by the candidate.
     *
     * @return The number of votes.
     */
    public int getVotes() {
        return votes;
    }

    /** 
     * Increments the vote count for the candidate.
     */
    public void addVote() {
        votes++;
    }

    @Override
    /** 
     * Returns a string representation of the candidate and their votes.
     *
     * @return A string indicating the candidate's name and vote count.
     */
    public String toString() {
        return name + ": " + votes + " votes";
    }
}
