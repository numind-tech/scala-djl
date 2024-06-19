package tech.numind

import ai.djl.ndarray.types.Shape
import ai.djl.ndarray.{BaseNDManager, NDList, NDManager}

import scala.util.Using

object Main extends App {
  Using.resource(NDManager.newBaseManager()) { manager =>
    val first = manager.create(Array(1f, 2f, 3f), new Shape(1L, 3L))
    val second = manager.create(Array(2f, 3f, 4f), new Shape(3L, 1L))
    val result = first.dot(second).getFloat(0)
    assert(result == 20f)
  }
}
