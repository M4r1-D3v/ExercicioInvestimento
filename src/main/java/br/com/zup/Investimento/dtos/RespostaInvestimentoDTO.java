package br.com.zup.Investimento.dtos;

public class RespostaInvestimentoDTO {
    private double valorInvestido;
    private double totalLucro;
    private double valorTotal;

    public RespostaInvestimentoDTO() {
    }

    public RespostaInvestimentoDTO(double valorInvestido, double totalLucro, double valorTotal) {
        this.valorInvestido = valorInvestido;
        this.totalLucro = totalLucro;
        this.valorTotal = valorTotal;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public double getTotalLucro() {
        return totalLucro;
    }

    public void setTotalLucro(double totalLucro) {
        this.totalLucro = totalLucro;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
