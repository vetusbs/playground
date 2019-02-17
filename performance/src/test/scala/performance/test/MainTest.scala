package performance.test

import io.gatling.app.Gatling
import io.gatling.core.config.GatlingPropertiesBuilder

object MainTest {

  def main(args: Array[String]) {

    // This sets the class for the simulation we want to run.
    val simClass = classOf[FirstScenario].getName

    val props = new GatlingPropertiesBuilder
    props.simulationClass(simClass)


    Gatling.fromMap(props.build)

  }
}
