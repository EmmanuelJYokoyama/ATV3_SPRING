package com.autobots.automanager;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.autobots.automanager.entitades.CredencialUsuarioSenha;
import com.autobots.automanager.entitades.Documento;
import com.autobots.automanager.entitades.Email;
import com.autobots.automanager.entitades.Empresa;
import com.autobots.automanager.entitades.Endereco;
import com.autobots.automanager.entitades.Mercadoria;
import com.autobots.automanager.entitades.Servico;
import com.autobots.automanager.entitades.Telefone;
import com.autobots.automanager.entitades.Usuario;
import com.autobots.automanager.entitades.Veiculo;
import com.autobots.automanager.entitades.Venda;
import com.autobots.automanager.enumeracoes.PerfilUsuario;
import com.autobots.automanager.enumeracoes.TipoDocumento;
import com.autobots.automanager.enumeracoes.TipoVeiculo;
import com.autobots.automanager.repositorios.RepositorioEmpresa;

@SpringBootApplication
public class AutomanagerApplication implements CommandLineRunner {

	@Autowired
	private RepositorioEmpresa repositorioEmpresa;

	public static void main(String[] args) {
		SpringApplication.run(AutomanagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Empresa empresa = new Empresa();
		empresa.setRazaoSocial("Car service toyota ltda");
		empresa.setNomeFantasia("Car service manutenção veicular");
		empresa.setCadastro(new Date());

		Endereco enderecoEmpresa = new Endereco();
		enderecoEmpresa.setEstado("São Paulo");
		enderecoEmpresa.setCidade("São Paulo");
		enderecoEmpresa.setBairro("Centro");
		enderecoEmpresa.setRua("Av. São João");
		enderecoEmpresa.setNumero("00");
		enderecoEmpresa.setCodigoPostal("01035-000");

		empresa.setEndereco(enderecoEmpresa);

		Telefone telefoneEmpresa = new Telefone();
		telefoneEmpresa.setDdd("011");
		telefoneEmpresa.setNumero("986454527");

		empresa.getTelefones().add(telefoneEmpresa);

		Usuario funcionario = new Usuario();
		funcionario.setNome("Pedro Alcântara de Bragança e Bourbon");
		funcionario.setNomeSocial("Dom Pedro");
		funcionario.getPerfis().add(PerfilUsuario.FUNCIONARIO);

		Email emailFuncionario = new Email();
		emailFuncionario.setEndereco("a@a.com");

		funcionario.getEmails().add(emailFuncionario);

		Endereco enderecoFuncionario = new Endereco();
		enderecoFuncionario.setEstado("São Paulo");
		enderecoFuncionario.setCidade("São Paulo");
		enderecoFuncionario.setBairro("Jardins");
		enderecoFuncionario.setRua("Av. São Gabriel");
		enderecoFuncionario.setNumero("00");
		enderecoFuncionario.setCodigoPostal("01435-001");

		funcionario.setEndereco(enderecoFuncionario);

		empresa.getUsuarios().add(funcionario);

		Telefone telefoneFuncionario = new Telefone();
		telefoneFuncionario.setDdd("011");
		telefoneFuncionario.setNumero("9854633728");

		funcionario.getTelefones().add(telefoneFuncionario);

		Documento cpf = new Documento();
		cpf.setDataEmissao(new Date());
		cpf.setNumero("856473819229");
		cpf.setTipo(TipoDocumento.CPF);

		funcionario.getDocumentos().add(cpf);

		CredencialUsuarioSenha credencialFuncionario = new CredencialUsuarioSenha();
		credencialFuncionario.setInativo(false);
		credencialFuncionario.setNomeUsuario("dompedrofuncionario");
		credencialFuncionario.setSenha("123456");
		credencialFuncionario.setCriacao(new Date());
		credencialFuncionario.setUltimoAcesso(new Date());

		funcionario.getCredenciais().add(credencialFuncionario);

		Usuario cliente = new Usuario();
		cliente.setNome("Laura Ferreira");
		cliente.getPerfis().add(PerfilUsuario.CLIENTE);

		Veiculo ranger = new Veiculo();
		ranger.setPlaca("QWE-1020");
		ranger.setModelo("Ford Ranger Limited");
		ranger.setTipo(TipoVeiculo.PICKUP);
		ranger.setProprietario(cliente);

		cliente.getVeiculos().add(ranger);
		empresa.getUsuarios().add(cliente);

		Mercadoria filtroAr = new Mercadoria();
		filtroAr.setNome("Filtro de Ar Ford Ranger");
		filtroAr.setValor(120);
		filtroAr.setQuantidade(10);

		Mercadoria oleo = new Mercadoria();
		oleo.setNome("Óleo 5W30 Ford");
		oleo.setValor(80);
		oleo.setQuantidade(25);

		empresa.getMercadorias().add(filtroAr);
		empresa.getMercadorias().add(oleo);

		Servico revisao = new Servico();
		revisao.setNome("Revisão completa");
		revisao.setValor(600);

		Servico lavagem = new Servico();
		lavagem.setNome("Lavagem Premium");
		lavagem.setValor(90);

		empresa.getServicos().add(revisao);
		empresa.getServicos().add(lavagem);

		Venda venda = new Venda();
		venda.setCadastro(new Date());
		venda.setCliente(cliente);
		venda.setFuncionario(funcionario);
		venda.setIdentificacao("FORD-8899");
		venda.setVeiculo(ranger);
		venda.getMercadorias().add(filtroAr);
		venda.getMercadorias().add(oleo);
		venda.getServicos().add(revisao);
		venda.getServicos().add(lavagem);

		empresa.getVendas().add(venda);

		repositorioEmpresa.save(empresa);
	}
	
}