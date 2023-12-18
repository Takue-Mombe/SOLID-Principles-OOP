package Interface_Segregation.good;

public class AllinOne implements Printer,Scan{
    @Override
    public void print() {
        //prints
    }

    @Override
    public void scan() {
        //scans
    }
}
