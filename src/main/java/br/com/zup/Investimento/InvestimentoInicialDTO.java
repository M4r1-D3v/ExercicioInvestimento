package br.com.zup.Investimento;

public class InvestimentoInicialDTO {
    private String email;
    private String nome;
    private String cpf;
    private double valorPrevisto;
    private int periodoDeAplicacao = 12;
    private RiscoDTO riscoDTO;

    public InvestimentoInicialDTO() {
    }

    public InvestimentoInicialDTO(String email, String nome, String cpf, double valorPrevisto, int periodoDeAplicacao, RiscoDTO riscoDTO) {
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
        this.valorPrevisto = valorPrevisto;
        this.periodoDeAplicacao = periodoDeAplicacao;
        this.riscoDTO = riscoDTO;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getValorPrevisto() {
        return valorPrevisto;
    }

    public void setValorPrevisto(double valorPrevisto) {
        this.valorPrevisto = valorPrevisto;
    }

    public int getPeriodoDeAplicacao() {
        return periodoDeAplicacao;
    }

    public void setPeriodoDeAplicacao(int periodoDeAplicacao) {
        this.periodoDeAplicacao = periodoDeAplicacao;
    }

    public RiscoDTO getRiscoDTO() {
        return riscoDTO;
    }

    public void setRiscoDTO(RiscoDTO riscoDTO) {
        this.riscoDTO = riscoDTO;
    }
}
