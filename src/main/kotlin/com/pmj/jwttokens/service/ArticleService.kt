package com.pmj.jwttokens.service

import com.pmj.jwttokens.model.Article
import com.pmj.jwttokens.repository.ArticleRepository
import org.springframework.stereotype.Service

@Service
class ArticleService(private val articleRepository: ArticleRepository) {
    fun findAll(): List<Article> =
        articleRepository.findAll()
}