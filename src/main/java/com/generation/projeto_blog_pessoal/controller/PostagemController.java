package com.generation.projeto_blog_pessoal.controller;

import com.generation.projeto_blog_pessoal.repository.PostagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostagemController {
    @Autowired
    private PostagemRepository postagemRepository;
}
