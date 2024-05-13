package io.github.lulily13.purrfectmatch

import org.h2.tools.Server
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Application {

    @Bean(initMethod = "start", destroyMethod = "stop")
    fun h2Server(): Server = Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9092")
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}