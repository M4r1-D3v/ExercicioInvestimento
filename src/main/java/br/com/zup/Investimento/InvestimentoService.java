package br.com.zup.Investimento;

import br.com.zup.Investimento.dtos.InvestimentoInicialDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InvestimentoService {
    private List<InvestimentoInicialDTO>investimentoInicialDTOS = new ArrayList<>();

    public void adicionarInvestimentoDTO(InvestimentoInicialDTO investimentoInicialDTO){
        investimentoInicialDTOS.add(investimentoInicialDTO);
    }


}
