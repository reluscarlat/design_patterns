package chainOfResponsability;

public interface Chain {
    public void calculate(Numbers request);
    public void setNextChain(Chain nextChain);
}