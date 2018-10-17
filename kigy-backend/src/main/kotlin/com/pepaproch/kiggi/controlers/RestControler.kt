package com.pepaproch.kiggi.controlers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicInteger
import java.util.concurrent.atomic.AtomicLong

data class ExapmpleResponse(val count: Long , val message : String)


@RestController
class RestController {



 val counter = AtomicLong()

	@GetMapping("/counter")
	fun counter(): ExapmpleResponse {
		return ExapmpleResponse(counter.incrementAndGet(), "Hello")
	}

}