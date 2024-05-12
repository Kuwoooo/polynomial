import java.util.ArrayList;

public class Polynomial implements PolynomialInterface {
    private ArrayList<Term> terms;
    private int degree;

    /**
     * Constructor with Parameters
     * */
    public Polynomial() {
        this.terms = new ArrayList<>();
        this.degree = degree;
    }

    /**
     * Setters
     * */
    public void setTerms(ArrayList<Term> terms) {
        this.terms = terms;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    /**
     * Getters
     * */
    public ArrayList<Term> getTerms() {
        return terms;
    }

    public int getDegree() {
        return degree;
    }

    /**
     * Evaluate method
     * */
    @Override
    public float evaluate() {
        float result = 0.0F;
        for (Term term : terms) {
            result += term.getNumCoef() * Math.pow(term.getLitCoef(), term.getDegree());
        }
        return result;
    }

    /**
     * Add method
     * */
    @Override
    public Polynomial add(Polynomial other) {
        Polynomial result = new Polynomial();
        return result;
    }

    /**
     * Subtract method
     * */
    @Override
    public Polynomial subtract(Polynomial other) {
        Polynomial result = new Polynomial();
        return result;
    }

    /**
     * Multiply method
     * */
    @Override
    public Polynomial multiply(Polynomial other) {
        return null;
    }

    /**
     * Subtract method
     * */
    @Override
    public Polynomial divide(Polynomial other) {
        return null;
    }
}
