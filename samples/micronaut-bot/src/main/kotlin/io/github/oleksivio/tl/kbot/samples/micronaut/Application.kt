package io.github.oleksivio.tl.kbot.samples.micronaut

import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
            .packages(
                "io.github.oleksivio.tl.kbot.samples.micronaut",
                "io.github.oleksivio.tl.kbot.micronaut"
            )
            .mainClass(Application.javaClass)
            .start()
    }
}
