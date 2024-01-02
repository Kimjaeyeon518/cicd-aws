package nbcdocker.learning.cicd_aws.controller

import org.springframework.cache.annotation.CacheConfig
import org.springframework.cache.annotation.Cacheable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.text.SimpleDateFormat
import java.util.*

@RestController
@CacheConfig(cacheNames = ["cache1"])
class HomeController {

    @GetMapping("/")
    fun home(): String {
        return "home-aws"
    }

    @GetMapping("/healthz")
    fun healthz(): String {
        return "healthz-aws"
    }

    @GetMapping("/healthzzz")
    fun healthzz(): String {
        return "cicd-check-final!#2"
    }

    @GetMapping("/test-cache")
    @Cacheable(key = "'all'")
    fun testCache(): String {
        val date = Date()
        val format = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        return format.format(date)
    }
}
