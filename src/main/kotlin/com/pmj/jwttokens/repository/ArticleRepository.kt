package com.pmj.jwttokens.repository

import com.pmj.jwttokens.model.Article
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
class ArticleRepository {
    private val arcticle = listOf(
        Article(id = UUID.randomUUID(), title = "Article 1", content = "Content 1"),
        Article(id = UUID.randomUUID(), title = "Article 2", content = "Content 2"),
    )

    fun findAll(): List<Article> =
        arcticle
}