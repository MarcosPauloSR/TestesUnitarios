package br.com.ifgoiano.negocio;

import br.com.ifgoiano.entidades.Atividade;
import br.com.ifgoiano.exception.AtividadeException;

public class AtividadeNegocio {

    public void inserir(Atividade atividade){
        if (atividade.getBlocosHorarios ().isEmpty()){
            throw new AtividadeException ("Não pode inserir atividade sem bloco de horário.");
        }
    }

}
