package com.company;

import sun.misc.JavaAWTAccess;

import javax.swing.*;
import java.awt.*;

public class InterfaceUsuario {


    //

    public static void main(String[] args) {
        //Criando a janela principla
        JFrame janela = new JFrame("janela");

        janela.setLayout(new BorderLayout());

        //Criando Componentes
        JButton cadastrar = new JButton("cadastrar");
            cadastrar.setBorderPainted(false);
        JButton pesquisar = new JButton("pesquisar");
            pesquisar.setBorderPainted(false);


        //Criando fundo
        JPanel fundo = new JPanel();
        fundo.setBackground(Color.WHITE);
        fundo.setOpaque(true);
        janela.add(fundo, BorderLayout.CENTER); //Adiciona o fundo à janela principal


        //Criando Base de Escolhas
        JPanel baseDeEscolhas = new JPanel(new GridLayout(1,5));

            //Adicionando os componentes à base de Escolhas
            baseDeEscolhas.add(cadastrar,0);
            baseDeEscolhas.add(pesquisar,1);

        janela.add(baseDeEscolhas, BorderLayout.NORTH); //Adiciona a Base de Escolhas à janela principal


        //Criando Aba Cadastrar
        JPanel abaCadastrar = new JPanel();
        abaCadastrar.setBackground(Color.WHITE);
        abaCadastrar.setOpaque(true);
        abaCadastrar.setLayout(new BorderLayout()); //Setando o layout da aba cadastro

            //Adicionando os componentes à base da Aba Cadastrar

                //Criando o ambiente de cadastro
                    //Componentes de entrada
                        //JTextField
                        JTextField nome                      = new JTextField("Nome",5);
                        JTextField prenome                   = new JTextField("Pré-nome",3);
                        JTextField sobrenome                 = new JTextField("Sobrenome",5);
                        JTextField dataNascimento            = new JTextField("Data de Nascimento",7);
                        JTextField municipioNascimento       = new JTextField("Município de Nascimento",8);
                        JTextField ufNascimento              = new JTextField("UF Nascimento",8);
                        JTextField paisNascimento            = new JTextField("País Nascimento",8);
                        JTextField estadoCivil               = new JTextField("Estado Civil",8);
                        JTextField endereco                  = new JTextField("Endereço",8);
                        JTextField telefoneResidencial       = new JTextField("Telefone Residencial",17);
                        JTextField telefoneComercial         = new JTextField("Telefone Comercial",17);
                        JTextField telefoneAlternativo       = new JTextField("Telefone Alternativo",17);
                        JTextField emailPessoal              = new JTextField("E-mail Pessoal",15);
                        JTextField emailComercial            = new JTextField("E-mail Comercial",15);
                        JTextField emailAlternativo          = new JTextField("E-mail Alternativo",15);
                        JTextField matricula                 = new JTextField("Matrícula",8);
                        JTextField regimeEmprego             = new JTextField("Regime Emprego",14);
                        JTextField regimeRemuneracao         = new JTextField("Regime Remuneração",14);
                        JTextField centroCusto               = new JTextField("Centro Custo",14);
                        JTextField unidade                   = new JTextField("Unidade",10);
                        JTextField departamento              = new JTextField("Departamento",10);
                        JTextField cargaHorariaDiaria        = new JTextField("Carga Horária Diária",4);
                        JTextField cargaHorariaSemanal       = new JTextField("Carga Horária Semanal",4);
                        JTextField cargaHorariaQuinzenal     = new JTextField("Carga Horária Quinzenal",5);
                        JTextField cargaHorariaMensal        = new JTextField("Carga Horária Mensal",7);
                        JTextField remuneracaoBasica         = new JTextField("Remuneração Básica",8);
                        JTextField remuneracaoComplementar   = new JTextField("Remuneração Complementar",14);
                        JTextField remuneracaoAdicional      = new JTextField("Remuneração Adicional",4);
                        JTextField remuneracaoGratificada    = new JTextField("Remuneração Gratificada",4);
                        JTextField titulacaoMaxima           = new JTextField("Titulação Máxima",4);

                        //Custom JButton
                        JButton finalizarCadastro = new JButton("Finalizar Cadastro");
                        finalizarCadastro.setBorderPainted(false);
                        finalizarCadastro.setBackground(Color.decode("#0288d1"));
                        finalizarCadastro.setFont(new Font("Roboto-Thin", Font.TRUETYPE_FONT, 14));
                        finalizarCadastro.setForeground(Color.WHITE);

                    //Conteineres internos à aba
                    JPanel cadastro = new JPanel(new FlowLayout());

                    //
                    //OrganizadorCadastro organizadorCadastro  = new OrganizadorCadastro();
                    //organizadorCadastro.addUltimoField(nome, cadastro);
                    //organizadorCadastro.addCampoMeio(prenome, cadastro);
                    cadastro.add(prenome);
                    cadastro.add(nome);
                    cadastro.add(sobrenome);
                    cadastro.add(dataNascimento);
                    cadastro.add(municipioNascimento);
                    cadastro.add(ufNascimento);
                    cadastro.add(paisNascimento);
                    cadastro.add(estadoCivil);
                    cadastro.add(endereco);
                    cadastro.add(telefoneResidencial);
                    cadastro.add(telefoneComercial);
                    cadastro.add(telefoneAlternativo);
                    cadastro.add(emailPessoal);
                    cadastro.add(emailComercial);
                    cadastro.add(emailAlternativo);
                    cadastro.add(matricula);
                    cadastro.add(regimeEmprego);
                    cadastro.add(regimeRemuneracao);
                    cadastro.add(centroCusto);
                    cadastro.add(unidade);
                    cadastro.add(departamento);
                    cadastro.add(cargaHorariaDiaria);
                    cadastro.add(cargaHorariaSemanal);
                    cadastro.add(cargaHorariaQuinzenal);
                    cadastro.add(cargaHorariaMensal);
                    cadastro.add(remuneracaoBasica);
                    cadastro.add(remuneracaoComplementar);
                    cadastro.add(remuneracaoAdicional);
                    cadastro.add(remuneracaoGratificada);
                    cadastro.add(titulacaoMaxima);

                    cadastro.add(finalizarCadastro);


                    //Botões
                    //abaCadastrar.add(cadastro, BorderLayout.CENTER);


        janela.add(abaCadastrar, BorderLayout.CENTER);



        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        janela.setExtendedState(janela.getExtendedState() | JFrame.MAXIMIZED_BOTH); //Isso faz o programa iniciar em "tela cheia"




    }

}
