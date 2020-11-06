package com.example.demo.repository;

import java.util.List;
import com.example.demo.model.PostagemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface PostagemRepository extends JpaRepository <PostagemModel, Long> {
	
	public List<PostagemModel> findAllByTituloContainingIgnoreCase(String titulo);
	
	@Query(value = "select * from postagem where ano > 2011", nativeQuery = true)
	List<PostagemModel> findAllMaior();
	
	@Query(value = "select * from postagem where ano > 2011 ORDER BY ano DESC", nativeQuery = true)
	List<PostagemModel> findAllAnosDesc();
	
	@Query(value = "select * from postagem where ano > 2011 ORDER BY ano ASC", nativeQuery = true)
	List<PostagemModel> findAllAnosAsc();
	
	@Query(value = "select * from postagem where ano >= 2011 and ano <= 2013", nativeQuery = true)
	List<PostagemModel> findAllAnosIntervalos();
}
