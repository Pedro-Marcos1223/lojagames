package org.generation.lojagames.lojagames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**		 
 * 		
 * 		Class responsible to create the Table "tb_categoria" in MYSQL and its atributes, also, this class creates the methods getters and setters.
 *		 Atributes description:
 *		* id - it's the PRIMARY KEY
 *		* genero - KInd of game(fps, sports, etc )
 *		* console - The console of the game (PS4, PC, XBoX)
 *		* There's is also a list of the class tb_produto, as FOREIGN KEY
 *
 *			PORTUGUES
 * 		Classe responsavel por criar a Tabela tb_categoria no MYSQL e seus atributos, essa classe também possui os methodos GEtters e Setters.
 * 		* id - É a chave primaria
 * 		* genero - Tipo de jogo (FPS, ESPORTES, etc)
 * 		* console - Tipo de console do produto (XBOX, PC, PS4)
 * 		* Também possui uma lista da classe tb_produto, como CHAVE ESTRANTGEIRA
 * 
 * 
 * */

@Entity
@Table(name = "tb_categoria")


public class Categoria {
      @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	 private long id;
	 
      //Atributo 1
	 @NotNull
	 @Size(min = 3, max = 20 )
	 private String genero;
	 //
	 //Atributo 2
	 @NotNull
	 @Size(min = 3, max = 20)
     private String console;
	 //
	 
	 @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	 @JsonIgnoreProperties("categoria")
	 private List<Produto> produto;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getConsole() {
		return console;
	}
	public void setConsole(String console) {
		this.console = console;
	}
	public List<Produto> getProduto() {
		return produto;
	}
	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}
	
	//METODOS
	 

	
	
	
	

}
