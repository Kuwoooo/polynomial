public class Term implements Comparable<Term> {
    private int numCoef;
    private int degree;
    private int litCoef;

    /**
     * Default Constructor
     * */
    public Term() {
        this.numCoef = 1;
        this.degree = 1;
        this.litCoef = 1;
    }

    /**
     * Constructor with Parameters
     * */
    public Term(int numCoef, int degree, int litCoef) {
        this.numCoef = numCoef;
        this.degree = degree;
        this.litCoef = litCoef;
    }

    /**
     * Setters
     * */
    public void setNumCoef(int numCoef) {
        this.numCoef = numCoef;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public void setLitCoef(int litCoef) {
        this.litCoef = litCoef;
    }

    /**
     * Getters
     * */
    public int getNumCoef() {
        return numCoef;
    }

    public int getDegree() {
        return degree;
    }

    public int getLitCoef() {
        return litCoef;
    }

    /**
     * toString method
     * */
    @Override
    public String toString() {
        return "Term{" +
                "numCoef=" + numCoef +
                ", degree=" + degree +
                ", litCoef=" + litCoef +
                '}';
    }

    /**
     * compareTo method
     * */
    @Override
    public int compareTo(Term o) {
        return 0;
    }
}
