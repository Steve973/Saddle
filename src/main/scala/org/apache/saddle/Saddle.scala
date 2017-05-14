package org.apache.saddle

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.SpringApplication

/**
  * Main application class
  */
@SpringBootApplication
class Saddle {}

object Saddle extends App {
  SpringApplication.run(classOf[Saddle], args: _*)
}
