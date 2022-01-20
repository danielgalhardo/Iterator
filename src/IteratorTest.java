
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;



public class IteratorTest
{
    @Test
    void retornaQuantidadeHospedesRJ()
    {
        Hotel hotel = new Hotel (
                new Hospede(101, "Cartao", "Daniel", "1997-04-07", "MG", "123", "456" ),
                new Hospede(122, "Dinheiro", "Ana", "1977-06-04", "RJ", "123", "456" ),
                new Hospede(203, "Cartao", "Fabio", "1999-08-02", "RJ", "123", "456" ),
                new Hospede(205, "Cartao", "Thales", "1999-05-09", "RJ", "123", "456" )

        );

        assertEquals(3, ControleHospede.contarHospedesPorEstado(hotel, "RJ"));
    }

    @Test
    void retornaQuantidadeMetodoPagamentoUsado()
    {

    Hotel hotel = new Hotel (
            new Hospede(101, "Cartao", "Daniel", "1997-04-07", "MG", "123", "456" ),
            new Hospede(122, "Cartao", "Ana", "1977-06-04", "RJ", "123", "456" ),
            new Hospede(203, "Cartao", "Fabio", "1999-08-02", "RJ", "123", "456" ),
            new Hospede(205, "Cartao", "Thales", "1999-05-09", "RJ", "123", "456" )

    );

    assertEquals(4, ControleHospede.contarMetodoPagamento(hotel, "Cartao"));

    }

    @Test
    void retornaHotelLotado()
    {

        Hotel hotel = new Hotel (
                new Hospede(101, "Cartao", "Daniel", "1997-04-07", "MG", "123", "456" ),
                new Hospede(122, "Cartao", "Ana", "1977-06-04", "RJ", "123", "456" ),
                new Hospede(203, "Cartao", "Fabio", "1999-08-02", "RJ", "123", "456" ),
                new Hospede(205, "Cartao", "Thales", "1999-05-09", "RJ", "123", "456" ),
                new Hospede(305, "Cartao", "Jose", "2002-10-25", "RS", "123", "456" ),
                new Hospede(305, "Dinheiro", "Maria", "193-07-13", "AC", "123", "456" )

        );

        assertEquals(true, ControleHospede.hotelLotado(hotel));

    }
   }

