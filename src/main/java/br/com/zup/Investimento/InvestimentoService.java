package br.com.zup.Investimento;

import br.com.zup.Investimento.dtos.InvestimentoDTO;
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

}
