package com.thisisnews.core.routes

import akka.http.scaladsl.server.Directives.pathPrefix
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.server.directives.MethodDirectives.get
import akka.http.scaladsl.server.directives.RouteDirectives.complete

trait Routes {

  lazy val allRoutes: Route = {
      pathPrefix("ping") {
        get {
          complete("pong")
        }
      }
  }

}
