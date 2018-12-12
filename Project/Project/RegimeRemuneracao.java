//package sistemaacademico;
package Project;

import Project.ElementoDescritivo;
import java.util.ArrayList;
/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: RegimeRemuneracao
* Objetivo...: Representa os poss�veis regimes de remuneracao que um empregado
*              pode ter.
* Observacoes: Se for desconhecido, utilize o tipo 0 - DS - Desconhecido.
*/
public class RegimeRemuneracao {
    private final int                       NUMERO_REGIME_REMUNERACAO = 1;
    private ArrayList <ElementoDescritivo>  regimeRemuneracao;
    
    /**
     * Implementar de maneira semelhante � UnidadeFederativa.
     * 
     *      C�d  Descri��o Completa     Descri��o Abreviada
            00 - Desconhecido           DS
            01 - Horista                HR
            02 - Semanal                SM
            03 - Quinzenal              QN
            04 - Mensal                 MS
            05 - por Tarefa             TF
            06 - Outro                  OUT
     */
}