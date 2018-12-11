package Project;//package sistemaacademico;

import Project.ElementoDescritivo;

import java.util.ArrayList;

/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: Project.Unidades
* Objetivo...: Representa a unidade (acad�mica ou administrativa) ao qual um 
*              empregado pode estar vinculado.
* Observacoes: Se for desconhecido, utilize o tipo 0 - DS - Desconhecido.
*/
public class Unidades {
    private ArrayList <ElementoDescritivo>  unidades;
    
    /**
     * Implemente de maneira similar � UnidadeFederativa.
     * 
     * C�digo Descri��o Abreviada   Descri��o Completa
     * 	00  - DS                    Desconhecida
	01  - EE                    Escola de Engenharia 
	02  - INF                   Instituto de Inform�tica
	03  - IME                   Instituto de Matem�tica e Estat�stica
        04  - FO                    Faculdade de Odontologia
        05  - DRH                   Departamento de Recursos Humanos
        06  - PRG                   Pr�-Reitoria de Gradua��o
	07  - OUT                   Outro
     
     * Observa��o: Basta colocar estes 07, apesar de ser poss�vel muitos outros.
     */    
}