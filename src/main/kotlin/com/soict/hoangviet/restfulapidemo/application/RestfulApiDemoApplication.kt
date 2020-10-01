package com.soict.hoangviet.restfulapidemo.application

import com.soict.hoangviet.restfulapidemo.entity.Book
import com.soict.hoangviet.restfulapidemo.repository.BookRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication

@EntityScan(basePackages = ["com.soict.hoangviet.restfulapidemo.entity"])
@EnableJpaRepositories(basePackages = ["com.soict.hoangviet.restfulapidemo.repository"])
@ComponentScan(basePackages = ["com.soict.hoangviet.restfulapidemo.controller", "com.soict.hoangviet.restfulapidemo.config"])
class RestfulApiDemoApplication {

//    @Bean
//    fun init(bookRepository: BookRepository) = CommandLineRunner {
//        bookRepository.saveAll(arrayListOf(
//                Book(name = "Code dao ki su", author = "Toi di code dao"),
//                Book(name = "Toi tai gioi ban cung the", author = "Adam Khoo")
//        ))
//    }
}

fun main(args: Array<String>) {
    runApplication<RestfulApiDemoApplication>(*args)
}
