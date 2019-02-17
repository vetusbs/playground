package performance.test

import io.gatling.core.Predef.{heavisideUsers, _}
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.http.Predef._
import io.gatling.http.protocol.HttpProtocolBuilder

class FirstScenario extends Simulation {

  val baseUrl = "http://localhost:8080/"
  val httpProtocol: HttpProtocolBuilder = http.baseUrl(baseUrl)

  val scn: ScenarioBuilder = scenario("BlazemeterPricing")
    .exec(http("request_0")
      .get("/number"))

  setUp(
    scn.inject(
      rampConcurrentUsers(10) to 200 during 60
    )).protocols(httpProtocol)
}