package me.wonsang.blogapplicationkotlin

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class BlogApplicationKotlinApplication

fun main(args: Array<String>) {
    runApplication<BlogApplicationKotlinApplication>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}
