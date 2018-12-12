package Project;

import javax.swing.*;
import java.awt.*;

public class OrganizadorCadastro {
    /**
     * Grid Bag constraints para 'fields' e 'labels'
     */
    private GridBagConstraints ultimoConstraints = null;
    private GridBagConstraints meioConstraints = null;
    private GridBagConstraints labelConstraints = null;
    private int counter = 0  ;


    public OrganizadorCadastro(){

        // Os constraints  que estão para o "último" field em cada
        // linha primeiro, então copiar e colar os constraints.

        // weightx é 1.0 para fields, 0.0 para labels
        // gridwidth é REMAINDER para fields, 1 para labels
        ultimoConstraints = new GridBagConstraints();

        // "Espicha" os componenentes horizontalmente mas não verticalmente
        ultimoConstraints.fill =  GridBagConstraints.HORIZONTAL;

        // Componentes que são muito pequenos ou muito grandes para seu espaço
        // são presos ao canto do noroeste(superior esquerdo)
        ultimoConstraints.anchor = GridBagConstraints.NORTHWEST;

        // Dá ao "último" componente o máximo de espaço possível
        ultimoConstraints.weightx = 1.0;

        // Dá ao "último" componente o espaço restante daquela linha
        ultimoConstraints.gridwidth = GridBagConstraints.REMAINDER;

        // Adiciona um pequeno espaçamento
        ultimoConstraints.insets = new Insets(1,1,1,1);
        //ultimoConstraints.gridwidth = GridBagConstraints.RELATIVE; Faz todos ficarem em uma somente linha
        // Agora para os componentes do "Meio"
        meioConstraints =
                (GridBagConstraints)ultimoConstraints.clone();
        // Esses continuam a ter o máximo de espaço possível, mas não fechamos a linha
        meioConstraints.gridwidth = GridBagConstraints.RELATIVE;



        // E, finalmente, os contraints dos labels, tipicamente
        // para serem usados nos primeiros componentes de cada linha
        labelConstraints =
                (GridBagConstraints)ultimoConstraints.clone();
        //Dando a esses componentes o mínimo de espaço possível
        labelConstraints.weightx = 0.0;
        labelConstraints.gridwidth = 1;
    }

    /**
     * Adicionando um componente de campo. Qualquer componente pode ser usado.
     * O componente vai ser expandido para ocupar o restante da linha
     */
    public void addUltimoField(Component componente, Container parent){
        GridBagLayout gbl = (GridBagLayout) parent.getLayout();
        gbl.setConstraints(componente, ultimoConstraints);
        parent.add(componente);
    }


    /**
     * Adiciona um componente label, começando uma nova linha
     * se apropriado. A largura do componente é definida para
     * a menor largura do mais largo componente no form.
     */
    public void addLabel(Component componente, Container parent){
        GridBagLayout gbl = (GridBagLayout)parent.getLayout();
        gbl.setConstraints(componente, labelConstraints);
        parent.add(componente);
    }

    /**
     * Adiciona um JLabel com a dada String para a coluna do label
     */
    public JLabel addLabel(String string, Container parent){
        JLabel componente = new JLabel(string);
        addLabel(componente, parent);
        return componente;
    }


    /**
     * Adiciona um componente de campo do meio. Qualquer componente
     * pode ser usado. O Componente pode ser esticado para ocupar o
     * espaço total entre o Label  e o "último" campo. Todos os cam
     * pos do meio no layout terão a mesma largura.
     */
    public void addCampoMeio(Component componente, Container parent){
        ultimoConstraints.gridx = counter;
        ultimoConstraints.gridy = counter;
        GridBagLayout gbl = (GridBagLayout)parent.getLayout();
        gbl.setConstraints(componente, meioConstraints);
        parent.add(componente);

        counter++;
    }
}
