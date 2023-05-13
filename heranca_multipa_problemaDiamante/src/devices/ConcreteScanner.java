package devices;

public class ConcreteScanner extends Device implements Scanner {

    public ConcreteScanner(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
    }

    @Override
    public String scan() {
        return null;
    }
}
