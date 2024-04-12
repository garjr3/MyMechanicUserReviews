package cs3773.group11.mymechanic;

public class SolutionItem {

    String solutionTitle;
    String solutionDescription;
    int numLikes,numDislikes,numComments;

    public SolutionItem(String solutionTitle, String solutionDescription) {
        this.solutionTitle = solutionTitle;
        this.solutionDescription = solutionDescription;
        this.numLikes = 0;
        this.numDislikes = 0;
        this.numComments = 0;
    }

    public SolutionItem() {
        this.solutionTitle = "blank";
        this.solutionDescription = "blank";
        this.numLikes = 0;
        this.numDislikes = 0;
        this.numComments = 0;
    }

    public String getSolutionTitle() {
        return solutionTitle;
    }

    public void setSolutionTitle(String solutionTitle) {
        this.solutionTitle = solutionTitle;
    }

    public String getSolutionDescription() {
        return solutionDescription;
    }

    public void setSolutionDescription(String solutionDescription) {
        this.solutionDescription = solutionDescription;
    }

    public int getNumLikes() {
        return numLikes;
    }

    public void setNumLikes(int numLikes) {
        this.numLikes = numLikes;
    }

    public int getNumDislikes() {
        return numDislikes;
    }

    public void setNumDislikes(int numDislikes) {
        this.numDislikes = numDislikes;
    }

    public int getNumComments() {
        return numComments;
    }

    public void setNumComments(int numComments) {
        this.numComments = numComments;
    }
}
