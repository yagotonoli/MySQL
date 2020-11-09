package com.generation.LojaDeGames;


//import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table (name = "tb_categorias")
public class CategoriaModel {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;

		@NotNull
		@Size(min = 2, max = 100)
		private String genero;
		
		@Size(min = 0, max = 500)
		private String descricao;
		
		//@OneToMany (mappedBy = "tb_jogos", cascade = CascadeType.ALL)
		//@JsonIgnoreProperties ("tb_jogos")
		//private List<JogosModel> tb_jogos;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		//public List<JogosModel> getTb_jogos() {
		//	return tb_jogos;
		//}

		//public void setTb_jogos(List<JogosModel> tb_jogos) {
		//	this.tb_jogos = tb_jogos;
		//}
		
}