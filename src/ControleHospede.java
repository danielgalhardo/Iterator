import java.util.Iterator;

public class ControleHospede {

    public static Integer contarHospedesPorEstado(Hotel hotel, String estado) {
        int quantidade = 0;
        for (Hospede hospede : hotel) {
            if (hospede.getEstado().equals(estado)) {
                quantidade++;
            }
        }
        return quantidade;
    }


    public static Integer contarMetodoPagamento(Hotel hotel, String metodoPagamento) {
        int quantidade = 0;
        for (Hospede hospede : hotel) {
            if (hospede.getMetodoPagamento().equals(metodoPagamento)) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalHospedesHotel(Hotel hotel) {
        int quantidade = 0;
        for (Iterator a = hotel.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }

    public static boolean hotelLotado(Hotel hotel)
    {
        int quantidade = contarTotalHospedesHotel(hotel);
        if(quantidade > 5)
        {
            return true;
        }
        else {
            return false;
        }
    }

}
