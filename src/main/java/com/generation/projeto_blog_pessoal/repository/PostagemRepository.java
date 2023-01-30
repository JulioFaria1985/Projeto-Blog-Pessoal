package com.generation.projeto_blog_pessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.projeto_blog_pessoal.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository  <Postagem ,Long> {
}
