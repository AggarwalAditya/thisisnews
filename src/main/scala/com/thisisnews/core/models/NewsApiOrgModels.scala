package com.thisisnews.core.models

case class Source(id: String, name: String)

case class NewsApiItem(source: Source,
                       author: String,
                       title: String,
                       description: String,
                       url: String,
                       urlToImage: String,
                       publishedAt: String,
                       content: String)