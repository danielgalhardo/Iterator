import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Hotel implements  Iterable<Hospede>{

    private List<Hospede> hospedes = new ArrayList<Hospede>();

    public Hotel(Hospede... hospedes)
    {
        this.hospedes = Arrays.asList(hospedes);
    }

    @Override
    public Iterator<Hospede>  iterator()
    {
        return hospedes.iterator();
    }
}
