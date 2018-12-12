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
        fundo.setBackground(Color.BLUE);
        fundo.setOpaque(true);
        janela.add(fundo, BorderLayout.CENTER); //Adiciona o fundo à janela principal


        //Criando Base de Escolhas
        JPanel baseDeEscolhas = new JPanel(new GridLayout(1,5));
        baseDeEscolhas.setBackground(Color.GREEN);

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
                            dimensionar(municipioNascimento,80);
                        //
                            JTextField ufNascimento              = new JTextField("UF Nascimento");
                            dimensionar(ufNascimento,80);
                        //
                            JTextField paisNascimento            = new JTextField("País Nascimento");
                            dimensionar(paisNascimento,80);
                        //
                            JTextField estadoCivil               = new JTextField("Estado Civil");
                            dimensionar(estadoCivil,50);

                            JTextField endereco                  = new JTextField("Endereço");
                            dimensionar(endereco,100);

                            JTextField telefoneResidencial       = new JTextField("Project.Telefone Residencial");
                            dimensionar(telefoneResidencial,50);

                            JTextField telefoneComercial         = new JTextField("Project.Telefone Comercial");
                            dimensionar(telefoneComercial,50);

                            JTextField telefoneAlternativo       = new JTextField("Project.Telefone Alternativo");
                            dimensionar(telefoneAlternativo, 50);

                            JTextField emailPessoal              = new JTextField("E-mail Pessoal");
                            dimensionar(emailPessoal, 90);

                            JTextField emailComercial            = new JTextField("E-mail Comercial");
                            dimensionar(emailComercial,90);

                            JTextField emailAlternativo          = new JTextField("E-mail Alternativo");
                            dimensionar(emailAlternativo, 90);

                            JTextField matricula                 = new JTextField("Matrícula");
                            dimensionar(matricula,60);

                            JTextField regimeEmprego             = new JTextField("Regime Emprego");
                            dimensionar(regimeEmprego,70);

                            JTextField regimeRemuneracao         = new JTextField("Regime Remuneração");
                            dimensionar(regimeRemuneracao,70);

                            JTextField centroCusto               = new JTextField("Centro Custo");
                            dimensionar(centroCusto, 70);

                            JTextField unidade                   = new JTextField("Unidade");
                            dimensionar(unidade,50);

                            JTextField departamento              = new JTextField("Departamento");
                            dimensionar(departamento,50);

                            JTextField cargaHorariaDiaria        = new JTextField("Carga Horária Diária");
                            dimensionar(cargaHorariaDiaria,40);

                            JTextField cargaHorariaSemanal       = new JTextField("Carga Horária Semanal");
                            dimensionar(cargaHorariaSemanal, 40);

                            JTextField cargaHorariaQuinzenal     = new JTextField("Carga Horária Quinzenal");
                            dimensionar(cargaHorariaQuinzenal, 40);

                            JTextField cargaHorariaMensal        = new JTextField("Carga Horária Mensal");
                            dimensionar(cargaHorariaMensal,40);

                            JTextField remuneracaoBasica         = new JTextField("Remuneração Básica");
                            dimensionar(remuneracaoBasica,50);

                            JTextField remuneracaoComplementar   = new JTextField("Remuneração Complementar");
                            dimensionar(remuneracaoComplementar,50);

                            JTextField remuneracaoAdicional      = new JTextField("Remuneração Adicional");
                            dimensionar(remuneracaoAdicional,50);

                            JTextField remuneracaoGratificada    = new JTextField("Remuneração Gratificada");
                            dimensionar(remuneracaoGratificada,50);

                            JTextField titulacaoMaxima           = new JTextField("Titulação Máxima");
                            dimensionar(titulacaoMaxima, 100);

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
                            organizadorCadastro.addLabel(prenome, nameZip); //Adicionando PreNome ao painel Cadastro

                            organizadorCadastro.addLabel(" Nome: ",nameZip);
                            organizadorCadastro.addLabel(nome, nameZip);

                            organizadorCadastro.addLabel(" Sobrenome: ",nameZip);
                            organizadorCadastro.addLabel(sobrenome, nameZip);

                            organizadorCadastro.addLabel(" Data de nascimento: ",nameZip);
                            organizadorCadastro.addLabel(dataNascimento, nameZip);

                            organizadorCadastro.addLabel(nameZip,cadastro); //"Link"|"Gambiarra" para ligar os dois JPanel
                            JPanel painelTeste = new JPanel();
                            //organizadorCadastro.addUltimoField(painelTeste, cadastro); //Forma para "Pular a linha"
                            cadastro.add(painelTeste);
                            painelTeste.setBackground(Color.MAGENTA);

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

                    fichaLinha(organizadorCadastro, cargaHorariaDiaria, " Carga Horária Diária: ", cargaHorariaSemanal, " Semanal :"
                            ,cargaHorariaQuinzenal, " Quinzenal: ", cargaHorariaMensal, " Mensal :", cadastro);

                    fichaLinha(organizadorCadastro, remuneracaoBasica, " Remuneração Básica: ", remuneracaoComplementar, " Remuneração Complementar: "
                            ,remuneracaoAdicional, " Remuneração Adicional: ", remuneracaoGratificada, " Remuneração Gratificada ", cadastro);

                    fichaLinha(organizadorCadastro,titulacaoMaxima, " Titulação Máxima: ",cadastro);





                    //Botões
                    abaCadastrar.add(cadastro, BorderLayout.NORTH);


        janela.add(abaCadastrar, BorderLayout.CENTER);



        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
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

        organizadorCadastro.addLabel(textoComponenteDois, ComponenteUmZip); //Criando o label para o componenteDois
        organizadorCadastro.addLabel(componenteDois,ComponenteUmZip); //Colocando o componenteDois

        organizadorCadastro.addLabel(componenteTres,ComponenteUmZip); //Colocando o componenteTres

        organizadorCadastro.addLabel(ComponenteUmZip, painel); //"Link"|"Gambiarra" para ligar os dois JPanel
        organizadorCadastro.addUltimoField(new JPanel(), painel); //Forma para "Pular a linha"
    }

    private static void fichaLinha(OrganizadorCadastro organizadorCadastro, Component componenteUm,String textoComponenteUm,Component componenteDois,String textoComponenteDois,Component componenteTres,String textoComponenteTres, Component componenteQuatro,String textoComponenteQuatro, JPanel painel) {
        JPanel ComponenteUmZip = new JPanel();          //Criando painel para armazenar componentes da linha
        ComponenteUmZip.setLayout(new GridBagLayout()); //Definindo o layout para o painel "Zip"

        organizadorCadastro.addLabel(textoComponenteUm, ComponenteUmZip); //Criando o label para o componenteUm
        organizadorCadastro.addLabel(componenteUm,ComponenteUmZip); //Colocando o componenteUm

        organizadorCadastro.addLabel(textoComponenteDois, ComponenteUmZip); //Criando o label para o componenteDois
        organizadorCadastro.addLabel(componenteDois,ComponenteUmZip); //Colocando o componenteDois

        organizadorCadastro.addLabel(textoComponenteTres, ComponenteUmZip); //Criando o label para o componenteTres
        organizadorCadastro.addLabel(componenteTres,ComponenteUmZip); //Colocando o componenteTres

        organizadorCadastro.addLabel(textoComponenteQuatro, ComponenteUmZip); //Criando o label para o componenteQuatro
        organizadorCadastro.addLabel(componenteQuatro,ComponenteUmZip); //Colocando o componenteQuatro

        organizadorCadastro.addLabel(ComponenteUmZip, painel); //"Link"|"Gambiarra" para ligar os dois JPanel
        organizadorCadastro.addUltimoField(new JPanel(), painel); //Forma para "Pular a linha"

    }

}
