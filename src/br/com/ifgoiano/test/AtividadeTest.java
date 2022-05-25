package br.com.ifgoiano.test;

import br.com.ifgoiano.entidades.Atividade;
import br.com.ifgoiano.entidades.BlocoHorario;
import br.com.ifgoiano.entidades.TipoAtividade;
import br.com.ifgoiano.negocio.AtividadeNegocio;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AtividadeTest {


    /*
    * Atividade Marcos Paulo Soares Rezende
    */

    @Test
    public void naoDeveExistirAtividadeSemBlocoHorario() {
        Atividade atividade = new Atividade ( );
        atividade.setId ( Long.valueOf ( 1 ) );
        atividade.setNome ( "Curso de HTML" );
        atividade.setDescricao ( "Curso de HTML para iniciantes" );
        atividade.setPreco ( BigDecimal.valueOf ( 24.99 ) );
        atividade.setTipoAtividade ( new TipoAtividade ( Long.valueOf ( 1 ), "Curso" ) );

        try {
            AtividadeNegocio an = new AtividadeNegocio ( );
            an.inserir ( atividade );
            assertTrue ( false );
        } catch (Exception e) {
            assertTrue ( true );
        }
    }

    @Test
    public void atividadeExisteComBlocoHorario() {
        Atividade atividade = new Atividade ( );
        atividade.setId ( Long.valueOf ( 2 ) );
        atividade.setNome ( "Usabilidade na Web" );
        atividade.setDescricao ( "Boas práticas para Fron-End" );
        atividade.setPreco ( BigDecimal.valueOf ( 50 ) );
        atividade.setTipoAtividade ( new TipoAtividade ( Long.valueOf ( 2 ), "Curso" ) );

        BlocoHorario bh = new BlocoHorario ( );
        bh.setId ( Long.valueOf ( 2 ) );
        bh.setData ( LocalDate.of ( 2019, 3, 20 ) );
        bh.setHoraInicio ( LocalDateTime.of ( 2019, 03, 20, 15, 0 ) );
        bh.setHoraFim ( LocalDateTime.of ( 2019, 3, 20, 16, 30 ) );
        atividade.setBlocosHorarios ( Collections.singletonList ( bh ) );

        try {
            AtividadeNegocio negocio = new AtividadeNegocio ( );
            negocio.inserir ( atividade );

            assertTrue ( true );
        } catch (Exception e) {
            assertTrue ( false );
        }

    }

    @Test
    public void blocoHorarioNaoDeveExistirSemAtividade(){
        BlocoHorario bh = new BlocoHorario ( );
        bh.setId ( Long.valueOf ( 2 ) );
        bh.setData ( LocalDate.of ( 2019, 3, 21 ) );
        bh.setHoraInicio ( LocalDateTime.of ( 2019, 03, 21, 9, 0 ) );
        bh.setHoraFim ( LocalDateTime.of ( 2019, 3, 21, 11, 0 ) );

        try {
            AtividadeNegocio negocio = new AtividadeNegocio ( );
            negocio.inserir ( bh.getAtividade () );
            assertTrue ( false );
        } catch (Exception e) {
            assertTrue ( true );
        }
    }

}
