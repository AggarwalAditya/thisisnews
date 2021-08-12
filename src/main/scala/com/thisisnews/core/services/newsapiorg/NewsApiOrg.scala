package com.thisisnews.core.services.newsapiorg

import com.thisisnews.core.services.GetNews
import com.typesafe.config.ConfigFactory

class NewsApiOrg extends GetNews{

  val totalNumberOfApiKeys: Int = ConfigFactory.load().getInt("newsapiorg.totalNumberOfApiKeys")
  val apiKey: String = getApiKey

  override def sportsNews(): Unit = ???

  override def businessNews(): Unit = ???

  override def technologyNews(): Unit = ???

  override def worldNews(): Unit = ???

  override def nationalNews(): Unit = ???

  private def getApiKey: String = {
    val start = 1
    val end   = totalNumberOfApiKeys
    val rnd = new scala.util.Random
    val keyNumberToUse = start + rnd.nextInt( (end - start) + 1 )
    ConfigFactory.load().getString("newsapiorg.apiKey_"+keyNumberToUse.toString)
  }
}
