/*
 * package com.generation.LojaDeGames;
 * 
 * import javax.persistence.Entity; import javax.persistence.GeneratedValue;
 * import javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.ManyToOne; import javax.persistence.Table; import
 * javax.validation.constraints.Size;
 * 
 * import com.fasterxml.jackson.annotation.JsonIgnoreProperties; import
 * com.sun.istack.NotNull;
 * 
 * @Entity
 * 
 * @Table (name = "tb_jogos") public class JogosModel {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
 * 
 * @NotNull
 * 
 * @Size(min = 2, max = 100) private String titulo;
 * 
 * @NotNull
 * 
 * @Size(min = 2, max = 100) private String produtora;
 * 
 * @NotNull private int anoLancamento;
 * 
 * @ManyToOne
 * 
 * @JsonIgnoreProperties("tb_jogos") private CategoriaModel tb_categorias;
 * 
 * public Long getId() { return id; }
 * 
 * public void setId(Long id) { this.id = id; }
 * 
 * public String getTitulo() { return titulo; }
 * 
 * public void setTitulo(String titulo) { this.titulo = titulo; }
 * 
 * public String getProdutora() { return produtora; }
 * 
 * public void setProdutora(String produtora) { this.produtora = produtora; }
 * 
 * public int getAnoLancamento() { return anoLancamento; }
 * 
 * public void setAnoLancamento(int anoLancamento) { this.anoLancamento =
 * anoLancamento; }
 * 
 * public CategoriaModel getTb_categorias() { return tb_categorias; }
 * 
 * public void setTb_categorias(CategoriaModel tb_categorias) {
 * this.tb_categorias = tb_categorias; }
 * 
 * }
 */