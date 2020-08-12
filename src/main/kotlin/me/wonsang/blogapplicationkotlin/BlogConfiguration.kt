package me.wonsang.blogapplicationkotlin

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BlogConfiguration {

    @Bean
    fun databaseInit(userRepository: UserRepository,
                     articleRepository: ArticleRepository) = ApplicationRunner {
        val smaldini = userRepository.save(User("smaldini", "Stéphane", "Maldini"))
        articleRepository.save(Article(
                title = "Reactor Bismuth is out",
                headline = "Lorem ipsum",
                content = "dolor sit amet",
                author = smaldini
        ))
        articleRepository.save(Article(
                title = "Reactor Aluminium has landed",
                headline = "Lorem ipsum",
                content = "dolor sit amet",
                author = smaldini
        ))
    }

    // 위의 코드와 같은 코드임.
//    @Autowired
//    lateinit var userRepository: UserRepository
//
//    @Autowired
//    lateinit var articleRepository: ArticleRepository
//
//    @Bean
//    fun databaesInit() {
//        val smaldini = userRepository.save(User("smaldini", "Stéphane", "Maldini"))
//        articleRepository.save(Article(
//                title = "Reactor Bismuth is out",
//                headline = "Lorem ipsum",
//                content = "dolor sit amet",
//                author = smaldini
//        ))
//        articleRepository.save(Article(
//                title = "Reactor Aluminium has landed",
//                headline = "Lorem ipsum",
//                content = "dolor sit amet",
//                author = smaldini
//        ))
//    }
}