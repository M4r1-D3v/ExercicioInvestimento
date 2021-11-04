package br.com.zup.Investimento;

import br.com.zup.Investimento.dtos.InvestimentoInicialDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/investimentos")
public class InvestimentoController {
    @Autowired
    private InvestimentoService investimentoService; // injeção de dependência

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void inputSimulacaoInvestimento (@RequestBody InvestimentoInicialDTO investimentoInicialDTO){
        investimentoService.adicionarInvestimentoDTO(investimentoInicialDTO);
    }

}
