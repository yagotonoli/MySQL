package com.example.demo.repository;

import java.util.List;
import com.example.demo.model.PostagemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PostagemRepository extends JpaRepository <PostagemModel, Long> {
	
	public List<PostagemModel> findAllByTituloContainingIgnoreCase(String titulo);
}
