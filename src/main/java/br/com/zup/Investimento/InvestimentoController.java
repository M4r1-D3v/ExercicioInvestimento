package br.com.zup.Investimento;

import br.com.zup.Investimento.dtos.InvestimentoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/investimentos")
public class InvestimentoController {
    @Autowired
    private InvestimentoService investimentoService; // injeção de dependência

    @PutMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void inputSimulacaoInvestimento (@RequestBody @Valid InvestimentoDTO investimentoInicialDTO){
        investimentoService.adicionarInvestimentoDTO(investimentoInicialDTO);
    }

}
