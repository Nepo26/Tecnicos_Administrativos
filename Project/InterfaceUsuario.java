package Project;

import sun.misc.JavaAWTAccess;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.util.Formatter;

public class InterfaceUsuario {


    //

    public static void main(String[] args) {
        //Criando a janela principla
        JFrame janela = new JFrame("janela");

        janela.setLayout(new BorderLayout());

        //Criando Componentes
        JButton cadastrar = new JButton("CADASTRAR");
            cadastrar.setBorderPainted(false);
            cadastrar.setBackground(Color.decode("#0288d1"));
            cadastrar.setFont(new Font("Roboto-Thin", Font.TRUETYPE_FONT, 14));
            cadastrar.setForeground(Color.WHITE);
        JButton pesquisar = new JButton("PESQUISAR");
            pesquisar.setBorderPainted(false);
            pesquisar.setBackground(Color.decode("#0288d1"));
            pesquisar.setFont(new Font("Roboto-Thin", Font.TRUETYPE_FONT, 14));
            pesquisar.setForeground(Color.WHITE);

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
                        JTextField nome = new JTextField("");
                            Dimension nomeSize = nome.getPreferredSize();
                            nomeSize.width = 80;
                            nome.setPreferredSize(nomeSize);
                        //criando comboBox
                            String[] prenomes = {"Prenome","","Sr.","Sra.","Dr.","Ms."}; //Cria um "set" de opções para a combo box
                            JComboBox prenome = new JComboBox(prenomes);
                            prenome.setSelectedIndex(0);

                        //JTextField sobrenome = new JTextField("");
                            JTextField sobrenome = new JTextField("");
                            Dimension sobrenomeSize = sobrenome.getPreferredSize();
                            sobrenomeSize.width = 80;
                            sobrenome.setPreferredSize(sobrenomeSize);

                        MaskFormatter formatter = null;
                        try {
                             formatter = new MaskFormatter("##/##/##");
                        } catch (java.text.ParseException exc) {
                            System.err.println("formatter is bad: " + exc.getMessage());
                            System.exit(-1);
                        }
                        JTextField dataNascimento            = new JFormattedTextField(formatter);
                        JTextField municipioNascimento       = new JTextField("Município de Nascimento");
                        JTextField ufNascimento              = new JTextField("UF Nascimento");
                        JTextField paisNascimento            = new JTextField("País Nascimento");
                        JTextField estadoCivil               = new JTextField("Estado Civil");
                        JTextField endereco                  = new JTextField("Endereço");
                        JTextField telefoneResidencial       = new JTextField("Project.Telefone Residencial");
                        JTextField telefoneComercial         = new JTextField("Project.Telefone Comercial");
                        JTextField telefoneAlternativo       = new JTextField("Project.Telefone Alternativo");
                        JTextField emailPessoal              = new JTextField("E-mail Pessoal");
                        JTextField emailComercial            = new JTextField("E-mail Comercial");
                        JTextField emailAlternativo          = new JTextField("E-mail Alternativo");
                        JTextField matricula                 = new JTextField("Matrícula");
                        JTextField regimeEmprego             = new JTextField("Regime Emprego");
                        JTextField regimeRemuneracao         = new JTextField("Regime Remuneração");
                        JTextField centroCusto               = new JTextField("Centro Custo");
                        JTextField unidade                   = new JTextField("Unidade");
                        JTextField departamento              = new JTextField("Departamento");
                        JTextField cargaHorariaDiaria        = new JTextField("Carga Horária Diária");
                        JTextField cargaHorariaSemanal       = new JTextField("Carga Horária Semanal");
                        JTextField cargaHorariaQuinzenal     = new JTextField("Carga Horária Quinzenal");
                        JTextField cargaHorariaMensal        = new JTextField("Carga Horária Mensal");
                        JTextField remuneracaoBasica         = new JTextField("Remuneração Básica");
                        JTextField remuneracaoComplementar   = new JTextField("Remuneração Complementar");
                        JTextField remuneracaoAdicional      = new JTextField("Remuneração Adicional");
                        JTextField remuneracaoGratificada    = new JTextField("Remuneração Gratificada");
                        JTextField titulacaoMaxima           = new JTextField("Titulação Máxima");

                        //Custom JButton
                        JButton finalizarCadastro = new JButton("Finalizar Cadastro");
                        finalizarCadastro.setBorderPainted(false);
                        finalizarCadastro.setBackground(Color.decode("#0288d1"));
                        finalizarCadastro.setFont(new Font("Roboto-Thin", Font.TRUETYPE_FONT, 14));
                        finalizarCadastro.setForeground(Color.WHITE);

                    //Conteineres internos à aba
                    JPanel cadastro = new JPanel(new GridBagLayout());
                    cadastro.setBackground(Color.WHITE);

                    //
                    OrganizadorCadastro organizadorCadastro  = new OrganizadorCadastro();
                    //organizadorCadastro.addUltimoField(nome, cadastro);
                    //organizadorCadastro.addCampoMeio(prenome, cadastro);

                    //organizadorCadastro.addLabel(" Pré-nome: ", cadastro);
                    organizadorCadastro.addLabel(prenome, cadastro);
                        JPanel nameZip = new JPanel();
                        nameZip.setLayout(new GridBagLayout());
                            organizadorCadastro.addLabel(" Nome: ",nameZip);

                            organizadorCadastro.addLabel(nome, nameZip);


                            organizadorCadastro.addLabel(" Sobrenome: ",nameZip);
                            organizadorCadastro.addLabel(sobrenome, nameZip);
                            organizadorCadastro.addLabel(nameZip,cadastro); //"Link"|"Gambiarra" para ligar os dois JPanel
                            organizadorCadastro.addUltimoField(new JPanel(), cadastro); //Forma para "Pular a linha"


                    /*organizadorCadastro.addLabel(" Sobrenome: ", cadastro);
                    /organizadorCadastro.addCampoMeio(sobrenome, cadastro);

                    organizadorCadastro.addLabel(" Data de Nascimento: ",cadastro);
                    organizadorCadastro.addLabel(dataNascimento, cadastro);


                    organizadorCadastro.addLabel(" Município nascimento: ",cadastro);
                    organizadorCadastro.addCampoMeio(municipioNascimento, cadastro);

                    organizadorCadastro.addLabel(" UF Nascimento: ", cadastro);
                    organizadorCadastro.addUltimoField(ufNascimento, cadastro);

                    organizadorCadastro.addLabel(" País de nascimento: ",cadastro);
                    organizadorCadastro.addCampoMeio(paisNascimento, cadastro);

                    organizadorCadastro.addLabel(" Estado Civil: ", cadastro);
                    organizadorCadastro.addCampoMeio(estadoCivil, cadastro);
                    /*
                    organizadorCadastro.addLabel(" Endereço: ", cadastro);
                    organizadorCadastro.addLabel(endereco,cadastro);


                    organizadorCadastro.addLabel(" Project.Telefone Residencial: ", cadastro);
                    organizadorCadastro.addLabel(telefoneResidencial, cadastro);

                    organizadorCadastro.addLabel(" Project.Telefone Comercial: ", cadastro);
                    organizadorCadastro.addLabel(telefoneComercial, cadastro);

                    organizadorCadastro.addLabel(" Project.Telefone Alternativo: ", cadastro);
                    organizadorCadastro.addLabel(telefoneAlternativo, cadastro);


                    organizadorCadastro.addLabel("E-mail Pessoal: ", cadastro);
                    organizadorCadastro.addLabel(emailPessoal, cadastro);

                    organizadorCadastro.addLabel(" E-mail Comercial: ", cadastro);
                    organizadorCadastro.addLabel(emailComercial,cadastro);

                    organizadorCadastro.addLabel(" E-mail Alternativo: ", cadastro);
                    organizadorCadastro.addLabel(emailAlternativo, cadastro);


                    organizadorCadastro.addLabel(" Matrícula: ", cadastro);
                    organizadorCadastro.addLabel(matricula, cadastro);

                    organizadorCadastro.addLabel(" Regime Emprego: ", cadastro);
                    organizadorCadastro.addLabel(regimeEmprego, cadastro);

                    organizadorCadastro.addLabel(" Regime Remuneração: ", cadastro);
                    organizadorCadastro.addLabel(regimeRemuneracao, cadastro);

                    organizadorCadastro.addLabel(" Centro Custo: ", cadastro);
                    organizadorCadastro.addLabel(centroCusto, cadastro);

                    organizadorCadastro.addLabel(" Unidade: ", cadastro);
                    organizadorCadastro.addLabel(unidade, cadastro);

                    organizadorCadastro.addLabel("Departamento:", cadastro);
                    organizadorCadastro.addLabel(departamento, cadastro);


                    organizadorCadastro.addLabel("Carga Horária Diária:", cadastro);
                    organizadorCadastro.addLabel(cargaHorariaDiaria, cadastro);

                    organizadorCadastro.addLabel(" Semanal: ",cadastro);
                    organizadorCadastro.addLabel(cargaHorariaSemanal,cadastro);

                    organizadorCadastro.addLabel(" Quinzenal: ",cadastro);
                    organizadorCadastro.addLabel(cargaHorariaQuinzenal, cadastro);

                    organizadorCadastro.addLabel(" Mensal: ",cadastro);
                    organizadorCadastro.addLabel(cargaHorariaMensal, cadastro);


                    organizadorCadastro.addLabel(" Remuneração Básica: ", cadastro);
                    organizadorCadastro.addLabel(remuneracaoBasica, cadastro);

                    organizadorCadastro.addLabel(" Remuneração Compplementar: ", cadastro);
                    organizadorCadastro.addLabel(remuneracaoComplementar, cadastro);

                    organizadorCadastro.addLabel(" Remuneração Adicional: ", cadastro);
                    organizadorCadastro.addLabel(remuneracaoAdicional, cadastro);

                    organizadorCadastro.addLabel(" Remuneração Gratificada: ", cadastro);
                    organizadorCadastro.addLabel(remuneracaoGratificada, cadastro);

                    organizadorCadastro.addLabel(" Titulação Máxima: ", cadastro);
                    organizadorCadastro.addLabel(titulacaoMaxima, cadastro);

                    /*

                  //  cadastro.add(finalizarCadastro, BorderLayout.CENTER);

                    */
                    //Botões
                    abaCadastrar.add(cadastro, BorderLayout.NORTH);


        janela.add(abaCadastrar, BorderLayout.CENTER);



        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        janela.setExtendedState(janela.getExtendedState() | JFrame.MAXIMIZED_BOTH); //Isso faz o programa iniciar em "tela cheia"




    }

}
