import java.util.Date;

public class Hospede {

    private int numeroReserva;
    private String metodoPagamento;
    private String nome;
    private String dataNascimento;
    private String estado;
    private String cpf;
    private String identidade;

    public Hospede(int numeroReserva, String metodoPagamento, String nome, String dataNascimento, String estado, String cpf, String identidade) {
        this.numeroReserva = numeroReserva;
        this.metodoPagamento = metodoPagamento;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.estado = estado;
        this.cpf = cpf;
        this.identidade = identidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public void setNumeroReserva(int numeroReserva) {
        this.numeroReserva = numeroReserva;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }
}
