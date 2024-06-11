package com.luna.springboot;

public class Produto{
	
	@SuppressWarnings
		("unused")
	
	private long id;
	@SuppressWarnings
		("unused")
	
	private String nome, desc, preco, qnt, categ;
	
	public Produto(long id, String nome, String desc, String preco, String qnt, String categ) {
		this.id = id;
		this.nome = nome;
		this.desc = desc;
		this.preco = preco;
		this.qnt = qnt;
		this.categ = categ;
	}
	
	@Override
	public String toString() {
		return String.format(
				"Produto[id=%d, nome=%s, desc=%s, preco=%d, qnt=%d, categ=%s]"
				);
	}

}


	


