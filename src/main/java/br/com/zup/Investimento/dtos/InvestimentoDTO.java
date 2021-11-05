package br.com.zup.Investimento.dtos;

import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

public class InvestimentoDTO {
    @Email(message = "Email inválido, por favor digite novamente.")
    private String email;
    private String nome;
    @CPF(message = "Email inválido, por favor digite novamente.")
    private String cpf;
    private double valorPrevisto;
    @Min(2)
    private int periodoDeAplicacao;
    private RiscoDTO riscoDTO;

    public InvestimentoDTO() {
    }

    public InvestimentoDTO(String email, String nome, String cpf, double valorPrevisto, int periodoDeAplicacao, RiscoDTO riscoDTO) {
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
