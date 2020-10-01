package com.soict.hoangviet.restfulapidemo.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.web.PageableHandlerMethodArgumentResolver
import org.springframework.data.web.config.PageableHandlerMethodArgumentResolverCustomizer
import org.springframework.stereotype.Component

@Component
class PageableConfig : PageableHandlerMethodArgumentResolverCustomizer {
    override fun customize(pageableResolver: PageableHandlerMethodArgumentResolver) {
        pageableResolver.setOneIndexedParameters(true)
    }
}