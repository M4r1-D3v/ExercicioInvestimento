package br.com.zup.Investimento;

import br.com.zup.Investimento.dtos.InvestimentoDTO;
import br.com.zup.Investimento.dtos.RespostaInvestimentoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/investimentos")
public class InvestimentoController {
    @Autowired
    private InvestimentoService investimentoService; // injeção de dependência

    @PutMapping //requisição de simulação de investimento
    @ResponseStatus(HttpStatus.ACCEPTED)
    public RespostaInvestimentoDTO inputSimulacaoInvestimento (@RequestBody @Valid InvestimentoDTO investimentoInicialDTO){ //adicionar a anotação para reconhecimento das validações
         investimentoService.adicionarInvestimentoDTO(investimentoInicialDTO);                            // de forma que ao preencher a simulação no corpo da requição, já sejam realizadas as validações
           return investimentoService.calculoDaRequisicao(investimentoInicialDTO);                                                                                             // necessárias, o que impede que o programa rode desnecessariamente e que tb a segurança da aplicação seja mantida.
    }

    @GetMapping //requisição de exibição das simulações realizadas
    public List<InvestimentoDTO>exibirRequisicoesRealizadas(){
        return investimentoService.exibirSimulacoesRealizadas();
    }

}
