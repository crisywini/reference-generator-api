package co.crisi.referencegenerator.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter

@Configuration
@EnableWebSecurity
class ApplicationSecurity : WebSecurityConfigurerAdapter() {
    override fun configure(web: WebSecurity?) {
        web?.ignoring()?.antMatchers("/**")
    }
}