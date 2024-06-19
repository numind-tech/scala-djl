import mill._
import scalalib._

object Djl extends RootModule with ScalaModule {
  def scalaVersion = "3.4.2"

  val djlVersion = "0.28.0"
  def ivyDeps = Agg(
    ivy"ai.djl:api:$djlVersion",
    ivy"ai.djl.huggingface:tokenizers:$djlVersion",
    ivy"ai.djl.pytorch:pytorch-engine:$djlVersion",
    ivy"ch.qos.logback:logback-classic:1.5.6",
  )
}
