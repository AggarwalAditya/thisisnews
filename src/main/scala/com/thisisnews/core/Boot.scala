package com.thisisnews.core

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Route
import com.thisisnews.core.routes.Routes
import com.thisisnews.core.services.newsapiorg.NewsApiOrg
import com.typesafe.config.ConfigFactory

import scala.concurrent.Future
import scala.util.{Failure, Success}

object Boot extends App with Routes{

  implicit val system = ActorSystem("thisisnewsActorSystem")
  import system.dispatcher

  lazy val routes: Route = allRoutes

  val serverBinding: Future[Http.ServerBinding] = Http().bindAndHandle(routes, "localhost", 9001)

  serverBinding.onComplete {
    case Success(bound) => println(s"THIS IS NEWS API Server online at http://${bound.localAddress.getHostString}:${bound.localAddress.getPort}/")
    case Failure(e) => println(s"THIS IS NEWS API Server could not start!", e)
  }

}
