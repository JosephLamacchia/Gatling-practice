package simulations


import io.gatling.core.Predef._
import io.gatling.http.Predef._

class gatingjenkinstestsim extends Simulation {

	val httpProtocol = http
		.baseUrl("https://www.saucedemo.com")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.61 Safari/537.36 Edg/94.0.992.31")

	val headers_0 = Map(
		"sec-ch-ua" -> """Chromium";v="94", "Microsoft Edge";v="94", ";Not A Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")



	val scn = scenario("gatingjenkinstestsim")
		.exec(http("request_0")
			.get("/static/media/menu3x.34aee3ab.svg")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/static/media/close@3x.3a2a3ada.svg")
			.headers(headers_0),
            http("request_2")
			.get("/static/media/SwagBot_Footer_graphic.2e87acec.png")
			.headers(headers_0),
            http("request_3")
			.get("/static/media/sauce-backpack-1200x1500.34e7aa42.jpg")
			.headers(headers_0),
            http("request_4")
			.get("/static/media/logo3x.096bf4a7.svg")
			.headers(headers_0),
            http("request_5")
			.get("/static/media/red-onesie-1200x1500.1b15e1fa.jpg")
			.headers(headers_0),
            http("request_6")
			.get("/static/media/cart3x.d236358a.svg")
			.headers(headers_0),
            http("request_7")
			.get("/static/media/headerBot3x.db38f1aa.svg")
			.headers(headers_0),
            http("request_8")
			.get("/static/media/filter3x.4d6d6e7f.svg")
			.headers(headers_0),
            http("request_9")
			.get("/static/media/bike-light-1200x1500.a0c9caae.jpg")
			.headers(headers_0),
            http("request_10")
			.get("/static/media/bolt-shirt-1200x1500.c0dae290.jpg")
			.headers(headers_0),
            http("request_11")
			.get("/static/media/red-tatt-1200x1500.e32b4ef9.jpg")
			.headers(headers_0),
            http("request_12")
			.get("/static/media/sauce-pullover-1200x1500.439fc934.jpg")
			.headers(headers_0)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}