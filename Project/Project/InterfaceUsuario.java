package Project;

import sun.misc.JavaAWTAccess;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.util.Formatter;



public class InterfaceUsuario {

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
                        //JTextField Nome
                        JTextField nome = new JTextField("");
                            dimensionar(nome,80);
                        //criando comboBox Prenomes
                            String[] prenomes = {"Prenome","","Sr.","Sra.","Dr.","Ms."}; //Cria um "set" de opções para a combo box
                            JComboBox prenome = new JComboBox(prenomes);
                            prenome.setSelectedIndex(0);
                            dimensionar(prenome,80);

                        //JTextField Sobrenome
                            JTextField sobrenome = new JTextField("");
                            dimensionar(sobrenome,80);

                        //JFormattedTextField DataNascimento
                            MaskFormatter date = null;
                            try {
                                 date = new MaskFormatter("##/##/##");
                            } catch (java.text.ParseException exc) {
                                System.err.println("formatter é ruim: " + exc.getMessage());
                                System.exit(-1);
                            }
                            JTextField dataNascimento            = new JFormattedTextField(date);
                            dimensionar(dataNascimento,80);
                        //
                            JTextField municipioNascimento       = new JTextField("Município de Nascimento");

                        //
                            JTextField ufNascimento              = new JTextField("UF Nascimento");
                        //
                            JTextField paisNascimento            = new JTextField("País Nascimento");
                        //
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


                        JPanel nameZip = new JPanel();
                        nameZip.setLayout(new GridBagLayout());
                            organizadorCadastro.addLabel(prenome, cadastro); //Adicionando PreNome ao painel Cadastro

                            organizadorCadastro.addLabel(" Nome: ",nameZip);
                            organizadorCadastro.addLabel(nome, nameZip);

                            organizadorCadastro.addLabel(" Sobrenome: ",nameZip);
                            organizadorCadastro.addLabel(sobrenome, nameZip);

                            organizadorCadastro.addLabel(" Data de nascimento: ",nameZip);
                            organizadorCadastro.addLabel(dataNascimento, nameZip);

                            organizadorCadastro.addLabel(nameZip,cadastro); //"Link"|"Gambiarra" para ligar os dois JPanel
                            organizadorCadastro.addUltimoField(new JPanel(), cadastro); //Forma para "Pular a linha"

                    fichaLinha(organizadorCadastro, municipioNascimento," Municício de Nascimento: ",
                            ufNascimento," UF de nascimento: ",paisNascimento, " País de nascimento: ",cadastro);

                    fichaLinha(organizadorCadastro, estadoCivil, " Estado Civil: ",endereco," Endereço: ",cadastro);

                    fichaLinha(organizadorCadastro, telefoneResidencial, " Telefone Residencial: ",telefoneComercial," Telefone Comercial: "
                            ,telefoneAlternativo," Telefone alternativo: ", cadastro);

                    fichaLinha(organizadorCadastro,emailPessoal," E-mail pessoal: ",emailComercial," E-mail Comercial: "
                            ,emailAlternativo," E-mail Alternativo: ",cadastro);

                    fichaLinha(organizadorCadastro,matricula," Matrícula: ",regimeEmprego," Regime Emprego: ",regimeRemuneracao
                            ," regime Remuneração: ",cadastro);

                    fichaLinha(organizadorCadastro, centroCusto, " Centro Custo: ", unidade, " Unidade: "
                            , departamento, " Departamento: ",cadastro);

                    fichaLinha(organizadorCadastro, cargaHorariaDiaria, " Carga Horária Diária: ", cargaHorariaSemanal, " Semanal :",cargaHorariaQuinzenal, " Quinzenal: ", cargaHorariaMensal, " Mensal :", cadastro);
                    /*
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

    private static void dimensionar(Component componente, int tamanho) {
        Dimension componenteSize = componente.getPreferredSize();
        componenteSize.width = tamanho;
        componente.setPreferredSize(componenteSize);
    }

    private static void fichaLinha(OrganizadorCadastro organizadorCadastro, Component componenteUm,String textoComponenteUm, JPanel painel){
        JPanel ComponenteUmZip = new JPanel();          //Criando painel para armazenar componentes da linha
        ComponenteUmZip.setLayout(new GridBagLayout()); //Definindo o layout para o painel "Zip"

        organizadorCadastro.addLabel(textoComponenteUm, ComponenteUmZip); //Criando o label para o componenteUm
        organizadorCadastro.addLabel(componenteUm,ComponenteUmZip);

        organizadorCadastro.addLabel(ComponenteUmZip, painel); //"Link"|"Gambiarra" para ligar os dois JPanel
        organizadorCadastro.addUltimoField(new JPanel(), painel); //Forma para "Pular a linha"
    }
    private static void fichaLinha(OrganizadorCadastro organizadorCadastro, Component componenteUm, JPanel painel){
        JPanel ComponenteUmZip = new JPanel();          //Criando painel para armazenar componentes da linha
        ComponenteUmZip.setLayout(new GridBagLayout()); //Definindo o layout para o painel "Zip"

        organizadorCadastro.addLabel(componenteUm,ComponenteUmZip);

        organizadorCadastro.addLabel(ComponenteUmZip, painel); //"Link"|"Gambiarra" para ligar os dois JPanel
        organizadorCadastro.addUltimoField(new JPanel(), painel); //Forma para "Pular a linha"
    }
    private static void fichaLinha(OrganizadorCadastro organizadorCadastro, Component componenteUm,String textoComponenteUm,Component componenteDois,String textoComponenteDois, JPanel painel) {
        JPanel ComponenteUmZip = new JPanel();          //Criando painel para armazenar componentes da linha
        ComponenteUmZip.setLayout(new GridBagLayout()); //Definindo o layout para o painel "Zip"

        organizadorCadastro.addLabel(textoComponenteUm, ComponenteUmZip); //Criando o label para o componenteUm
        organizadorCadastro.addLabel(componenteUm,ComponenteUmZip); //Colocando o componenteUm

        organizadorCadastro.addLabel(textoComponenteDois, ComponenteUmZip); //Criando o label para o componenteDois
        organizadorCadastro.addLabel(componenteDois,ComponenteUmZip); //Colocando o componenteDois

        organizadorCadastro.addLabel(ComponenteUmZip, painel); //"Link"|"Gambiarra" para ligar os dois JPanel
        organizadorCadastro.addUltimoField(new JPanel(), painel); //Forma para "Pular a linha"
    }
    private static void fichaLinha(OrganizadorCadastro organizadorCadastro, Component componenteUm,String textoComponenteUm,Component componenteDois, JPanel painel) {
        JPanel ComponenteUmZip = new JPanel();          //Criando painel para armazenar componentes da linha
        ComponenteUmZip.setLayout(new GridBagLayout()); //Definindo o layout para o painel "Zip"

        organizadorCadastro.addLabel(textoComponenteUm, ComponenteUmZip); //Criando o label para o componenteUm
        organizadorCadastro.addLabel(componenteUm,ComponenteUmZip); //Colocando o componenteUm

        organizadorCadastro.addLabel(componenteDois,ComponenteUmZip); //Colocando o componenteDois

        organizadorCadastro.addLabel(ComponenteUmZip, painel); //"Link"|"Gambiarra" para ligar os dois JPanel
        organizadorCadastro.addUltimoField(new JPanel(), painel); //Forma para "Pular a linha"
    }
    private static void fichaLinha(OrganizadorCadastro organizadorCadastro, Component componenteUm,String textoComponenteUm,Component componenteDois,String textoComponenteDois,Component componenteTres,String textoComponenteTres, JPanel painel) {
        JPanel ComponenteUmZip = new JPanel();          //Criando painel para armazenar componentes da linha
        ComponenteUmZip.setLayout(new GridBagLayout()); //Definindo o layout para o painel "Zip"

        organizadorCadastro.addLabel(textoComponenteUm, ComponenteUmZip); //Criando o label para o componenteUm
        organizadorCadastro.addLabel(componenteUm,ComponenteUmZip); //Colocando o componenteUm

        organizadorCadastro.addLabel(textoComponenteDois, ComponenteUmZip); //Criando o label para o componenteDois
        organizadorCadastro.addLabel(componenteDois,ComponenteUmZip); //Colocando o componenteDois


        organizadorCadastro.addLabel(textoComponenteTres, ComponenteUmZip); //Criando o label para o componenteTres
        organizadorCadastro.addLabel(componenteTres,ComponenteUmZip); //Colocando o componenteTres

        organizadorCadastro.addLabel(ComponenteUmZip, painel); //"Link"|"Gambiarra" para ligar os dois JPanel
        organizadorCadastro.addUltimoField(new JPanel(), painel); //Forma para "Pular a linha"
    }

    private static void fichaLinha(OrganizadorCadastro organizadorCadastro, Component componenteUm,String textoComponenteUm,Component componenteDois,String textoComponenteDois,Component componenteTres, JPanel painel) {
        JPanel ComponenteUmZip = new JPanel();          //Criando painel para armazenar componentes da linha
        ComponenteUmZip.setLayout(new GridBagLayout()); //Definindo o layout para o painel "Zip"

        organizadorCadastro.addLabel(textoComponenteUm, ComponenteUmZip); //Criando o label para o componenteUm
        organizadorCadastro.addLabel(componenteUm,ComponenteUmZip); //Colocando o componenteUm

        organizadorCadastro.addLabel(textoComponenteUm, ComponenteUmZip); //Criando o label para o componenteDois
        organizadorCadastro.addLabel(componenteUm,ComponenteUmZip); //Colocando o componenteDois

        organizadorCadastro.addLabel(componenteTres,ComponenteUmZip); //Colocando o componenteTres

        organizadorCadastro.addLabel(ComponenteUmZip, painel); //"Link"|"Gambiarra" para ligar os dois JPanel
        organizadorCadastro.addUltimoField(new JPanel(), painel); //Forma para "Pular a linha"
    }

}
