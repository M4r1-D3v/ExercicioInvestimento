package br.com.zup.Investimento;

import br.com.zup.Investimento.dtos.InvestimentoDTO;
import br.com.zup.Investimento.dtos.RespostaInvestimentoDTO;
import br.com.zup.Investimento.dtos.RiscoDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvestimentoService {
    private List<InvestimentoDTO>investimentoInicialDTOS = new ArrayList<>();

    public void adicionarInvestimentoDTO(InvestimentoDTO investimentoInicialDTO){
        investimentoInicialDTOS.add(investimentoInicialDTO);
    }

    public List<InvestimentoDTO>exibirSimulacoesRealizadas(){
        return investimentoInicialDTOS;
    }

    public RespostaInvestimentoDTO calculoDaRequisicao(InvestimentoDTO investimentoDTO){

        double valorTotal = 0;
        if (investimentoDTO.getRiscoDTO().equals(RiscoDTO.ALTO)){
            double investimentoTaxa = investimentoDTO.getValorPrevisto() * RiscoDTO.ALTO.getTaxaRetorno();
             valorTotal = Math.pow(investimentoTaxa,investimentoDTO.getPeriodoDeAplicacao());
        }else if (investimentoDTO.getRiscoDTO().equals(RiscoDTO.MEDIO)){
            double investimentoTaxa = investimentoDTO.getValorPrevisto() * RiscoDTO.MEDIO.getTaxaRetorno();
             valorTotal = Math.pow(investimentoTaxa,investimentoDTO.getPeriodoDeAplicacao());
        }else if (investimentoDTO.getRiscoDTO().equals(RiscoDTO.BAIXO)){
            double investimentoTaxa = investimentoDTO.getValorPrevisto() * RiscoDTO.BAIXO.getTaxaRetorno();
            valorTotal = Math.pow(investimentoTaxa,investimentoDTO.getPeriodoDeAplicacao());
        }
        RespostaInvestimentoDTO resposta = new RespostaInvestimentoDTO();
        resposta.setValorInvestido(investimentoDTO.getValorPrevisto());
        resposta.setValorTotal(valorTotal);
        resposta.setTotalLucro(valorTotal - investimentoDTO.getValorPrevisto());
        return resposta;
    }

}
