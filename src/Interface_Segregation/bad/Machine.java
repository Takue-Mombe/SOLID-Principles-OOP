package Interface_Segregation.bad;
/*
* by separating  interfaces into units
* this principle helps in reducing dependencies
* and promoting flexibility in code design
*
* It means that we should design smaller
* and more specific interfaces
*
* Machine interface violets ISP because
* it includes methods for both printing and scanning
* which may not be supported by all implementing classes
* */
public interface Machine {
    void print();
    boolean scan();
}
class AllinOneMachine implements Machine{
    @Override
    public void print() {
        //print a document
    }

    @Override
    public boolean scan() {
        //scan a document
        return true;
    }
}
class PrinterMachine implements Machine{
    @Override
    public void print() {
    //prints machine
    }

    @Override
    public boolean scan() {
        throw new UnsupportedOperationException("Cannot support " +
                "this operation");
    }
}
class Main{
    public static void main(String[] args) {
        PrinterMachine print1=new PrinterMachine();

        System.out.println(print1.scan());
    }
}
