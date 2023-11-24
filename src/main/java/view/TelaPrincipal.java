package view;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class TelaPrincipal {
    public static void main(String[] args) {

        //criar uma empresa
        Empresa emp = new Empresa("Jornal Expresso");

        //criar 4 cidades
        Cidade cid = new Cidade("São Gonçalo");
        Cidade cid2 = new Cidade("Niterói");
        Cidade cid3 = new Cidade("Rio de Janeiro");
        Cidade cid4 = new Cidade("Nova Iguaçu");

        //adicionando as cidades a empresa
        List<Cidade> listaCidades = new ArrayList<>();
        listaCidades.add(cid);
        listaCidades.add(cid2);
        listaCidades.add(cid3);
        listaCidades.add(cid4);
        emp.setCidades(listaCidades);

        //criar 4 distribuições
        Distribuicao dist = new Distribuicao("Jornais nas Ruas");
        Distribuicao dist2 = new Distribuicao("Rota Jornalística");
        Distribuicao dist3 = new Distribuicao("Jornal em Movimento");
        Distribuicao dist4 = new Distribuicao("Jornal Delivery");

        //adicionando as distribuicoes a cidade
        cid.setDistribuicao(dist);
        cid2.setDistribuicao(dist2);
        cid3.setDistribuicao(dist3);
        cid4.setDistribuicao(dist4);

        //criar 4 clientes
        Cliente cli = new Cliente("Felipe", "123.456.789-90", "Rua Pamelato Jardim de Mendes, 136",
                "Rua Jorge Caetano, 289", true, 3695255, 695559);
        Cliente cli2 = new Cliente("Laura", "124.456.789-90", "Rua Marcelo de Oliveira, 785",
                "Rua Cabresto de Mirim, 102", false, 515919, 789789);
        Cliente cli3 = new Cliente("Marcelo", "125.456.789-90", "Rua Silva Jardim dos Anjos, 547",
                "Rua Bertanazzo de Vascaina, 456", true, 3695255, 695559);
        Cliente cli4 = new Cliente("Cristiano", "126.456.789-90", "Rua Bertolazo de Almeida, 2365",
                "Rua Gaizer de Azevedo, 220", false, 9895255, 695229);

        //fotos de cada cliente

        //cliente 1
        List<String> conjuntoFotos1 = new ArrayList<>();
        conjuntoFotos1.add("foto1.1");
        conjuntoFotos1.add("foto2.1");
        conjuntoFotos1.add("foto3.1");
        cli.setFotos(conjuntoFotos1);

        //cliente 2
        List<String> conjuntoFotos2 = new ArrayList<>();
        conjuntoFotos1.add("foto1.2");
        conjuntoFotos1.add("foto2.2");
        conjuntoFotos1.add("foto3.2");
        cli2.setFotos(conjuntoFotos2);

        //cliente 3
        List<String> conjuntoFotos3 = new ArrayList<>();
        conjuntoFotos1.add("foto1.3");
        conjuntoFotos1.add("foto2.3");
        conjuntoFotos1.add("foto3.3");
        cli3.setFotos(conjuntoFotos3);

        //cliente 4
        List<String> conjuntoFotos4 = new ArrayList<>();
        conjuntoFotos1.add("foto1.4");
        conjuntoFotos1.add("foto2.4");
        conjuntoFotos1.add("foto3.4");
        cli4.setFotos(conjuntoFotos4);

        //criar um administrador
        //falta vincular uma distribuicao ou n ao administrador
        Administrador adm = new Administrador("Claudio", "965874321-17",
                "Rua dos Bandeirantes, 654", "administrador");

        //cadastrando uma distribuicao ao administrador
        List<Distribuicao> distribuicoes = new ArrayList<>();
        distribuicoes.add(dist);
        adm.setDistribuicoes(distribuicoes);

        //criar 3 entregadores
        //falta vincular uma distribuicao ou n e uma rota ou n ao entregador
        EntregadorJornal ent = new EntregadorJornal("Natalia", "147852963-36", "Rua Zulum de Abreu, 730", "colaborador");
        EntregadorJornal ent2 = new EntregadorJornal("Bernardo", "947852963-26", "Rua Sabrina de Moraes, 421", "colaborador");
        EntregadorJornal ent3 = new EntregadorJornal("Natalia", "787852963-66", "Rua Fanicio de Abraao, 1002", "colaborador");

        //cadastrando funcionarios a empresa
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(adm);
        funcionarios.add(ent);
        funcionarios.add(ent2);
        funcionarios.add(ent3);
        emp.setFuncionarios(funcionarios);

        //criação de listas de clientes para o construtor da classe "Rota"
        List<Cliente> listaCliente = new ArrayList<>();
        listaCliente.add(cli);

        List<Cliente> listaCliente2 = new ArrayList<>();
        listaCliente2.add(cli2);

        List<Cliente> listaCliente3 = new ArrayList<>();
        listaCliente3.add(cli3);

        List<Cliente> listaCliente4 = new ArrayList<>();
        listaCliente4.add(cli4);

        //cadastrar 4 rotas
        Rota rota = new Rota("Primeira Rota", ent, listaCliente, "Entrega por Carro");
        Rota rota2 = new Rota("Segunda Rota", ent, listaCliente2, "Entrega por Caminhao");
        Rota rota3 = new Rota("Terceira Rota", ent2, listaCliente3, "Entrega por Moto");
        Rota rota4 = new Rota("Quarta Rota", ent3, listaCliente4, "Entrega por Caminhao");

        //cadastrar cada rota a sua distribuicao

        List<Rota> rotas = new ArrayList<>();
        rotas.add(rota);

        List<Rota> rotas2 = new ArrayList<>();
        rotas.add(rota2);

        List<Rota> rotas3 = new ArrayList<>();
        rotas.add(rota3);

        List<Rota> rotas4 = new ArrayList<>();
        rotas.add(rota4);

        List<Rota> rotas5 = new ArrayList<>();
        rotas5.add(rota);
        rotas5.add(rota2);

        dist.setRotas(rotas);
        dist2.setRotas(rotas2);
        dist3.setRotas(rotas3);
        dist4.setRotas(rotas4);

        //cadastrando distribuicoes e as rotas aos entregadores

        List<Distribuicao> distribuicoes2 = new ArrayList<>();
        distribuicoes2.add(dist);
        ent.setDistribuicoes(distribuicoes2); //entregador 1
        ent.setRotas(rotas5);

        List<Distribuicao> distribuicoes3 = new ArrayList<>();
        distribuicoes3.add(dist3);
        ent2.setDistribuicoes(distribuicoes3); //entregador 2
        ent2.setRotas(rotas3);

        List<Distribuicao> distribuicoes4 = new ArrayList<>();
        distribuicoes4.add(dist4);
        ent3.setDistribuicoes(distribuicoes4); //entregador 3
        ent3.setRotas(rotas4);

        //cadastrar 4 periodos de trabalho
        PeriodoTrabalho per = new PeriodoTrabalho("09-09-2023", "10-09-2023");
        PeriodoTrabalho per2 = new PeriodoTrabalho("12-07-2023", "10-08-2023");
        PeriodoTrabalho per3 = new PeriodoTrabalho("28-03-2023", "28-03-2023");
        PeriodoTrabalho per4 = new PeriodoTrabalho("15-05-2023", "20-05-2023");

        //cadastrar 4 rastros
        Rastro ras = new Rastro(cli.getLatitude(), cli.getLongitude());
        Rastro ras2 = new Rastro(cli2.getLatitude(), cli2.getLongitude());
        Rastro ras3 = new Rastro(cli3.getLatitude(), cli3.getLongitude());
        Rastro ras4 = new Rastro(cli4.getLatitude(), cli4.getLongitude());

        //cadastrar 4 detalhes de execucao de uma rota
        DetalhesExecucaoRota detal = new DetalhesExecucaoRota("13:30", "22h30min", "Carro");
        DetalhesExecucaoRota detal2 = new DetalhesExecucaoRota("16:00", "29 dias", "Caminhao");
        DetalhesExecucaoRota detal3 = new DetalhesExecucaoRota("08:00", "2h", "Moto");
        DetalhesExecucaoRota detal4 = new DetalhesExecucaoRota("07:00", "5 dias", "Caminhao");

        //cadastrando os rastros para cada detalhe de execucao de rota
        List<Rastro> listaRastro = new ArrayList<>();
        listaRastro.add(ras);

        List<Rastro> listaRastro2 = new ArrayList<>();
        listaRastro2.add(ras2);

        List<Rastro> listaRastro3 = new ArrayList<>();
        listaRastro3.add(ras3);

        List<Rastro> listaRastro4 = new ArrayList<>();
        listaRastro4.add(ras4);

        detal.setRastros(listaRastro);
        detal2.setRastros(listaRastro2);
        detal3.setRastros(listaRastro3);
        detal4.setRastros(listaRastro4);

        //objetos que nao foram utilizados:

        //Pessoa pes = new Pessoa();
        //Funcionario func = new Funcionario();
        //Secretaria sec = new Secretaria();
        //GerenteVenda ger = new GerenteVenda();

    }
}
