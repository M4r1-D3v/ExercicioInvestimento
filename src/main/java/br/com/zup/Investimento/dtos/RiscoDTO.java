package br.com.zup.Investimento.dtos;

public enum RiscoDTO {
    ALTO(0.25), MEDIO(0.15), BAIXO(0.005);

    private double taxaRetorno;

    RiscoDTO(double taxaRetorno) {
        this.taxaRetorno = taxaRetorno;
    }

    public double getTaxaRetorno() {
        return taxaRetorno;
    }
}
