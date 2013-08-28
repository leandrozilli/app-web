package com.betha.daos;

import java.util.ArrayList;

import java.util.List;



import com.betha.business.Pessoa;


public class PessoaDAO {
	private List<Pessoa> lista;

	public PessoaDAO() {
		this.lista = new ArrayList<Pessoa>();
		this.lista.add(new Pessoa(1, "Antônio João Shultz",
				"Rua Álvaro de Oliveira", "4141-4545"));
		this.lista.add(new Pessoa(2, "Maria José da Silva",
				"Rua Geral, sem número", "3432-0000"));
		this.lista.add(new Pessoa(3, "João Pereira",
				"Avenida Centenário, 1542", "3437-7445"));
		this.lista.add(new Pessoa(4, "Eduardo Gonçalves",
				"Rua Machado de Assis, 345", "8841-6952"));
		this.lista.add(new Pessoa(5, "Joana Gusmão",
				"Travessa Elias Benedetti", "2106-4545"));
		this.lista.add(new Pessoa(6, "Fábio de Souza Machado",
				"Rua Carlos Henrique Medeiros, 234", "4545-2421"));
		this.lista.add(new Pessoa(7, "João Pereira",
				"Avenida Centenário, 1542", "3437-7445"));
	}

	public Pessoa buscarPorCodigo(Integer codigo) {

		for (int i = 0; i < this.lista.size(); i++) {
			if(this.lista.get(i).getCodigo() == codigo)
				return this.lista.get(i);
		}
		return null;
	}
	public ArrayList<Pessoa> listarTodas(){
		
	
		return (ArrayList<Pessoa>) this.lista;
	}
}
