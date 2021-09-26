
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class EcomerceSiteSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("http://automationpractice.com")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/93.0.4577.82 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Cache-Control" -> "max-age=0",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_74 = Map("Accept" -> "text/css,*/*;q=0.1")

	val headers_75 = Map("Origin" -> "http://automationpractice.com")

	val headers_76 = Map(
		"Origin" -> "http://automationpractice.com",
		"sec-ch-ua" -> """Google Chrome";v="93", " Not;A Brand";v="99", "Chromium";v="93""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_80 = Map("Accept" -> "*/*")

	val headers_82 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"origin" -> "http://automationpractice.com",
		"sec-ch-ua" -> """Google Chrome";v="93", " Not;A Brand";v="99", "Chromium";v="93""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

	val headers_83 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache")

	val headers_98 = Map(
		"Accept" -> "text/css,*/*;q=0.1",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9")

	val headers_99 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_140 = Map(
		"Accept" -> "*/*",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9")

	val headers_148 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9")

	val headers_160 = Map(
		"Accept" -> "application/json, text/javascript, */*; q=0.01",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
		"Origin" -> "http://automationpractice.com",
		"X-Requested-With" -> "XMLHttpRequest")

	val headers_293 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Cache-Control" -> "max-age=0",
		"Origin" -> "http://automationpractice.com",
		"Upgrade-Insecure-Requests" -> "1")

    val uri1 = "connect.facebook.net"
    val uri2 = "https://www.facebook.com/x/oauth/status"
    val uri4 = "https://fonts.gstatic.com/s/opensans/v26/memvYaGs126MiZpBA-UvWbX2vVnXBbObj2OVTS-muw.woff2"
    val uri5 = "fonts.googleapis.com"

	val scn = scenario("EcomerceSiteSimulation")
		.exec(http("request_0")
			.get("/index.php")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/js/jquery/jquery-1.11.0.min.js"),
            http("request_2")
			.get("/js/jquery/jquery-migrate-1.2.1.min.js"),
            http("request_3")
			.get("/js/jquery/plugins/jquery.easing.js"),
            http("request_4")
			.get("/js/tools.js"),
            http("request_5")
			.get("/themes/default-bootstrap/js/global.js"),
            http("request_6")
			.get("/themes/default-bootstrap/js/autoload/10-bootstrap.min.js"),
            http("request_7")
			.get("/themes/default-bootstrap/js/autoload/15-jquery.total-storage.min.js"),
            http("request_8")
			.get("/themes/default-bootstrap/js/autoload/15-jquery.uniform-modified.js"),
            http("request_9")
			.get("/js/jquery/plugins/fancybox/jquery.fancybox.js"),
            http("request_10")
			.get("/themes/default-bootstrap/js/products-comparison.js"),
            http("request_11")
			.get("/themes/default-bootstrap/js/modules/blockcart/ajax-cart.js"),
            http("request_12")
			.get("/js/jquery/plugins/jquery.scrollTo.js"),
            http("request_13")
			.get("/js/jquery/plugins/jquery.serialScroll.js"),
            http("request_14")
			.get("/js/jquery/plugins/bxslider/jquery.bxslider.js"),
            http("request_15")
			.get("/themes/default-bootstrap/js/tools/treeManagement.js"),
            http("request_16")
			.get("/modules/blockfacebook/blockfacebook.js"),
            http("request_17")
			.get("/themes/default-bootstrap/js/modules/blocknewsletter/blocknewsletter.js"),
            http("request_18")
			.get("/js/jquery/plugins/autocomplete/jquery.autocomplete.js"),
            http("request_19")
			.get("/themes/default-bootstrap/js/modules/blocksearch/blocksearch.js"),
            http("request_20")
			.get("/themes/default-bootstrap/js/modules/homeslider/js/homeslider.js"),
            http("request_21")
			.get("/themes/default-bootstrap/js/modules/blockwishlist/js/ajax-wishlist.js"),
            http("request_22")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/hoverIntent.js"),
            http("request_23")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/superfish-modified.js"),
            http("request_24")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/blocktopmenu.js"),
            http("request_25")
			.get("/themes/default-bootstrap/js/index.js"),
            http("request_26")
			.get("/modules/blockbanner/img/sale70.png"),
            http("request_27")
			.get("/img/logo.jpg"),
            http("request_28")
			.get("/img/p/8/8-cart_default.jpg"),
            http("request_29")
			.get("/img/c/3-0_thumb.jpg"),
            http("request_30")
			.get("/img/c/3-1_thumb.jpg"),
            http("request_31")
			.get("/modules/homeslider/images/sample-1.jpg"),
            http("request_32")
			.get("/modules/homeslider/images/sample-2.jpg"),
            http("request_33")
			.get("/modules/homeslider/images/sample-3.jpg"),
            http("request_34")
			.get("/modules/themeconfigurator/img/banner-img6.jpg"),
            http("request_35")
			.get("/modules/themeconfigurator/img/banner-img7.jpg"),
            http("request_36")
			.get("/img/p/1/1-home_default.jpg"),
            http("request_37")
			.get("/img/p/7/7-home_default.jpg"),
            http("request_38")
			.get("/img/p/8/8-home_default.jpg"),
            http("request_39")
			.get("/img/p/1/0/10-home_default.jpg"),
            http("request_40")
			.get("/img/p/1/2/12-home_default.jpg"),
            http("request_41")
			.get("/img/p/1/6/16-home_default.jpg"),
            http("request_42")
			.get("/img/p/2/0/20-home_default.jpg"),
            http("request_43")
			.get("/themes/default-bootstrap/css/global.css"),
            http("request_44")
			.get("/themes/default-bootstrap/css/autoload/highdpi.css"),
            http("request_45")
			.get("/themes/default-bootstrap/css/autoload/responsive-tables.css"),
            http("request_46")
			.get("/themes/default-bootstrap/css/autoload/uniform.default.css"),
            http("request_47")
			.get("/js/jquery/plugins/fancybox/jquery.fancybox.css"),
            http("request_48")
			.get("/themes/default-bootstrap/css/modules/blockbanner/blockbanner.css"),
            http("request_49")
			.get("/themes/default-bootstrap/css/product_list.css"),
            http("request_50")
			.get("/themes/default-bootstrap/css/modules/blockcart/blockcart.css"),
            http("request_51")
			.get("/themes/default-bootstrap/css/modules/blockcategories/blockcategories.css"),
            http("request_52")
			.get("/themes/default-bootstrap/css/modules/blockcurrencies/blockcurrencies.css"),
            http("request_53")
			.get("/modules/blockfacebook/css/blockfacebook.css"),
            http("request_54")
			.get("/themes/default-bootstrap/css/modules/blocklanguages/blocklanguages.css"),
            http("request_55")
			.get("/themes/default-bootstrap/css/modules/blockcontact/blockcontact.css"),
            http("request_56")
			.get("/themes/default-bootstrap/css/modules/blocknewsletter/blocknewsletter.css"),
            http("request_57")
			.get("/js/jquery/plugins/autocomplete/jquery.autocomplete.css"),
            http("request_58")
			.get("/themes/default-bootstrap/css/modules/blocksearch/blocksearch.css"),
            http("request_59")
			.get("/themes/default-bootstrap/css/modules/blockuserinfo/blockuserinfo.css"),
            http("request_60")
			.get("/themes/default-bootstrap/css/modules/blockviewed/blockviewed.css"),
            http("request_61")
			.get("/themes/default-bootstrap/css/modules/blocktags/blocktags.css"),
            http("request_62")
			.get("/themes/default-bootstrap/css/modules/homeslider/homeslider.css"),
            http("request_63")
			.get("/modules/themeconfigurator/css/hooks.css"),
            http("request_64")
			.get("/themes/default-bootstrap/css/modules/blockwishlist/blockwishlist.css"),
            http("request_65")
			.get("/themes/default-bootstrap/css/modules/productcomments/productcomments.css"),
            http("request_66")
			.get("/modules/editorial/css/editorial.css"),
            http("request_67")
			.get("/themes/default-bootstrap/css/modules/blocktopmenu/css/blocktopmenu.css"),
            http("request_68")
			.get("/themes/default-bootstrap/css/modules/blocktopmenu/css/superfish-modified.css"),
            http("request_69")
			.get("/modules/themeconfigurator/img/banner-img1.jpg"),
            http("request_70")
			.get("/modules/themeconfigurator/img/banner-img2.jpg"),
            http("request_71")
			.get("/modules/themeconfigurator/img/banner-img3.jpg"),
            http("request_72")
			.get("/modules/themeconfigurator/img/banner-img4.jpg"),
            http("request_73")
			.get("/modules/themeconfigurator/img/banner-img5.jpg"),
            http("request_74")
			.get("http://" + uri5 + "/css?family=Open+Sans:300,600&subset=latin,latin-ext")
			.headers(headers_74),
            http("request_75")
			.get("/themes/default-bootstrap/font/fontawesome-webfont.woff?v=3.2.1")
			.headers(headers_75),
            http("request_76")
			.get(uri4)
			.headers(headers_76),
            http("request_77")
			.get("/themes/default-bootstrap/img/footer-bg.png"),
            http("request_78")
			.get("/themes/default-bootstrap/css/modules/homeslider/images/bx_loader.gif"),
            http("request_79")
			.get("/themes/default-bootstrap/img/bg_bt.gif"),
            http("request_80")
			.get("http://" + uri1 + "/en_US/all.js")
			.headers(headers_80),
            http("request_81")
			.get("https://" + uri1 + "/en_US/all.js?hash=cd7644979c30885710c8bf55d4255742")
			.headers(headers_76),
            http("request_82")
			.get(uri2 + "?client_id=334341610034299&input_token&origin=1&redirect_uri=http%3A%2F%2Fautomationpractice.com%2Findex.php&sdk=joey&wants_cookie_data=false")
			.headers(headers_82),
            http("request_83")
			.get("/img/favicon.ico?1461205423")
			.headers(headers_83),
            http("request_84")
			.get("/img/favicon.ico?1461205423")))
		.pause(5)
		.exec(http("request_85")
			.get("/themes/default-bootstrap/css/autoload/highdpi.css")
			.resources(http("request_86")
			.get("/themes/default-bootstrap/css/autoload/responsive-tables.css"),
            http("request_87")
			.get("/themes/default-bootstrap/css/autoload/uniform.default.css"),
            http("request_88")
			.get("/js/jquery/plugins/fancybox/jquery.fancybox.css"),
            http("request_89")
			.get("/themes/default-bootstrap/css/modules/blockbanner/blockbanner.css"),
            http("request_90")
			.get("/themes/default-bootstrap/css/modules/blockcart/blockcart.css"),
            http("request_91")
			.get("/themes/default-bootstrap/css/modules/blockcategories/blockcategories.css"),
            http("request_92")
			.get("/themes/default-bootstrap/css/modules/blockcurrencies/blockcurrencies.css"),
            http("request_93")
			.get("/themes/default-bootstrap/css/modules/blocklanguages/blocklanguages.css"),
            http("request_94")
			.get("/themes/default-bootstrap/css/global.css"),
            http("request_95")
			.get("/themes/default-bootstrap/css/modules/blockcontact/blockcontact.css"),
            http("request_96")
			.get("/themes/default-bootstrap/css/modules/blocknewsletter/blocknewsletter.css"),
            http("request_97")
			.get("/js/jquery/plugins/autocomplete/jquery.autocomplete.css"),
            http("request_98")
			.get("/modules/socialsharing/css/socialsharing.css")
			.headers(headers_98),
            http("request_99")
			.get("/index.php?id_product=2&controller=product")
			.headers(headers_99),
            http("request_100")
			.get("/themes/default-bootstrap/css/product.css")
			.headers(headers_98),
            http("request_101")
			.get("/js/jquery/jquery-1.11.0.min.js"),
            http("request_102")
			.get("/js/jquery/jquery-migrate-1.2.1.min.js"),
            http("request_103")
			.get("/js/jquery/plugins/jquery.easing.js"),
            http("request_104")
			.get("/js/tools.js"),
            http("request_105")
			.get("/themes/default-bootstrap/js/global.js"),
            http("request_106")
			.get("/themes/default-bootstrap/js/autoload/10-bootstrap.min.js"),
            http("request_107")
			.get("/themes/default-bootstrap/js/autoload/15-jquery.total-storage.min.js"),
            http("request_108")
			.get("/themes/default-bootstrap/js/autoload/15-jquery.uniform-modified.js"),
            http("request_109")
			.get("/js/jquery/plugins/fancybox/jquery.fancybox.js"),
            http("request_110")
			.get("/themes/default-bootstrap/js/products-comparison.js"),
            http("request_111")
			.get("/js/jquery/plugins/jquery.scrollTo.js"),
            http("request_112")
			.get("/js/jquery/plugins/jquery.serialScroll.js"),
            http("request_113")
			.get("/js/jquery/plugins/bxslider/jquery.bxslider.js"),
            http("request_114")
			.get("/themes/default-bootstrap/js/modules/blockcart/ajax-cart.js"),
            http("request_115")
			.get("/themes/default-bootstrap/js/tools/treeManagement.js"),
            http("request_116")
			.get("/themes/default-bootstrap/js/modules/blocknewsletter/blocknewsletter.js"),
            http("request_117")
			.get("/js/jquery/plugins/autocomplete/jquery.autocomplete.js"),
            http("request_118")
			.get("/themes/default-bootstrap/js/modules/blocksearch/blocksearch.js"),
            http("request_119")
			.get("/themes/default-bootstrap/js/modules/blockwishlist/js/ajax-wishlist.js"),
            http("request_120")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/hoverIntent.js"),
            http("request_121")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/superfish-modified.js"),
            http("request_122")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/blocktopmenu.js"),
            http("request_123")
			.get("/themes/default-bootstrap/css/product_list.css"),
            http("request_124")
			.get("/themes/default-bootstrap/css/modules/blocksearch/blocksearch.css"),
            http("request_125")
			.get("/modules/blockbanner/img/sale70.png"),
            http("request_126")
			.get("/img/logo.jpg"),
            http("request_127")
			.get("/img/p/8/8-cart_default.jpg"),
            http("request_128")
			.get("/img/c/3-0_thumb.jpg"),
            http("request_129")
			.get("/themes/default-bootstrap/css/modules/blocktags/blocktags.css"),
            http("request_130")
			.get("/img/c/3-1_thumb.jpg"),
            http("request_131")
			.get("/themes/default-bootstrap/css/modules/blockuserinfo/blockuserinfo.css"),
            http("request_132")
			.get("/img/p/7/7-home_default.jpg"),
            http("request_133")
			.get("/themes/default-bootstrap/css/modules/blockviewed/blockviewed.css"),
            http("request_134")
			.get("/modules/themeconfigurator/css/hooks.css"),
            http("request_135")
			.get("/themes/default-bootstrap/css/modules/blockwishlist/blockwishlist.css"),
            http("request_136")
			.get("/themes/default-bootstrap/css/modules/productcomments/productcomments.css"),
            http("request_137")
			.get("/themes/default-bootstrap/css/modules/blocktopmenu/css/blocktopmenu.css"),
            http("request_138")
			.get("/themes/default-bootstrap/css/modules/blocktopmenu/css/superfish-modified.css"),
            http("request_139")
			.get("/modules/sendtoafriend/sendtoafriend.css")
			.headers(headers_98),
            http("request_140")
			.get("/js/jquery/plugins/jquery.idTabs.js")
			.headers(headers_140),
            http("request_141")
			.get("http://" + uri5 + "/css?family=Open+Sans:300,600&subset=latin,latin-ext")
			.headers(headers_74),
            http("request_142")
			.get("/modules/socialsharing/js/socialsharing.js")
			.headers(headers_140),
            http("request_143")
			.get("/modules/productcomments/js/jquery.rating.pack.js")
			.headers(headers_140),
            http("request_144")
			.get("/themes/default-bootstrap/js/modules/sendtoafriend/sendtoafriend.js")
			.headers(headers_140),
            http("request_145")
			.get("/modules/productcomments/js/jquery.textareaCounter.plugin.js")
			.headers(headers_140),
            http("request_146")
			.get("/themes/default-bootstrap/js/modules/productcomments/js/productcomments.js")
			.headers(headers_140),
            http("request_147")
			.get("/themes/default-bootstrap/js/product.js")
			.headers(headers_140),
            http("request_148")
			.get("/img/p/6/6-cart_default.jpg")
			.headers(headers_148),
            http("request_149")
			.get("/img/p/5/5-cart_default.jpg")
			.headers(headers_148),
            http("request_150")
			.get("/img/p/7/7-cart_default.jpg")
			.headers(headers_148),
            http("request_151")
			.get("/img/p/7/7-medium_default.jpg")
			.headers(headers_148),
            http("request_152")
			.get("/img/p/7/7-large_default.jpg")
			.headers(headers_148),
            http("request_153")
			.get("/themes/default-bootstrap/css/print.css")
			.headers(headers_98),
            http("request_154")
			.get("/themes/default-bootstrap/font/fontawesome-webfont.woff?v=3.2.1")
			.headers(headers_75),
            http("request_155")
			.get(uri4)
			.headers(headers_76),
            http("request_156")
			.get("/modules/productpaymentlogos/img/payment-logo.png")
			.headers(headers_148),
            http("request_157")
			.get("/themes/default-bootstrap/img/footer-bg.png"),
            http("request_158")
			.get("/themes/default-bootstrap/img/border-1.gif")
			.headers(headers_148),
            http("request_159")
			.get("/themes/default-bootstrap/img/jquery/uniform/sprite.png")))
		.pause(3)
		.exec(http("request_160")
			.post("/index.php?rand=1632498792038")
			.headers(headers_160)
			.formParam("controller", "cart")
			.formParam("add", "1")
			.formParam("ajax", "true")
			.formParam("qty", "1")
			.formParam("id_product", "2")
			.formParam("token", "e817bb0705dd58da8db074c69f729fd8")
			.formParam("ipa", "7")
			.resources(http("request_161")
			.get("/themes/default-bootstrap/img/bg_bt.gif")))
		.pause(3)
		.exec(http("request_162")
			.get("/index.php?controller=order")
			.headers(headers_99)
			.resources(http("request_163")
			.get("/js/jquery/jquery-1.11.0.min.js"),
            http("request_164")
			.get("/js/jquery/jquery-migrate-1.2.1.min.js"),
            http("request_165")
			.get("/js/jquery/plugins/jquery.easing.js"),
            http("request_166")
			.get("/js/tools.js"),
            http("request_167")
			.get("/themes/default-bootstrap/js/global.js"),
            http("request_168")
			.get("/themes/default-bootstrap/js/autoload/10-bootstrap.min.js"),
            http("request_169")
			.get("/themes/default-bootstrap/js/autoload/15-jquery.total-storage.min.js"),
            http("request_170")
			.get("/themes/default-bootstrap/js/autoload/15-jquery.uniform-modified.js"),
            http("request_171")
			.get("/js/jquery/plugins/fancybox/jquery.fancybox.js"),
            http("request_172")
			.get("/themes/default-bootstrap/js/products-comparison.js"),
            http("request_173")
			.get("/themes/default-bootstrap/js/modules/blockcart/ajax-cart.js"),
            http("request_174")
			.get("/js/jquery/plugins/jquery.scrollTo.js"),
            http("request_175")
			.get("/js/jquery/plugins/jquery.serialScroll.js"),
            http("request_176")
			.get("/js/jquery/plugins/bxslider/jquery.bxslider.js"),
            http("request_177")
			.get("/themes/default-bootstrap/js/tools/treeManagement.js"),
            http("request_178")
			.get("/themes/default-bootstrap/js/modules/blocknewsletter/blocknewsletter.js"),
            http("request_179")
			.get("/js/jquery/plugins/autocomplete/jquery.autocomplete.js"),
            http("request_180")
			.get("/themes/default-bootstrap/js/modules/blocksearch/blocksearch.js"),
            http("request_181")
			.get("/themes/default-bootstrap/js/modules/blockwishlist/js/ajax-wishlist.js"),
            http("request_182")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/hoverIntent.js"),
            http("request_183")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/superfish-modified.js"),
            http("request_184")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/blocktopmenu.js"),
            http("request_185")
			.get("/modules/blockbanner/img/sale70.png"),
            http("request_186")
			.get("/img/logo.jpg"),
            http("request_187")
			.get("/img/p/8/8-cart_default.jpg"),
            http("request_188")
			.get("/img/p/7/7-cart_default.jpg")
			.headers(headers_148),
            http("request_189")
			.get("/img/c/3-0_thumb.jpg"),
            http("request_190")
			.get("/img/c/3-1_thumb.jpg"),
            http("request_191")
			.get("/themes/default-bootstrap/css/global.css"),
            http("request_192")
			.get("/themes/default-bootstrap/css/autoload/highdpi.css"),
            http("request_193")
			.get("/themes/default-bootstrap/css/autoload/responsive-tables.css"),
            http("request_194")
			.get("/themes/default-bootstrap/css/autoload/uniform.default.css"),
            http("request_195")
			.get("/js/jquery/plugins/fancybox/jquery.fancybox.css"),
            http("request_196")
			.get("/themes/default-bootstrap/css/addresses.css"),
            http("request_197")
			.get("/themes/default-bootstrap/css/modules/blockbanner/blockbanner.css"),
            http("request_198")
			.get("/themes/default-bootstrap/css/modules/blockcart/blockcart.css"),
            http("request_199")
			.get("/themes/default-bootstrap/css/modules/blockcategories/blockcategories.css"),
            http("request_200")
			.get("/themes/default-bootstrap/css/modules/blockcurrencies/blockcurrencies.css"),
            http("request_201")
			.get("/themes/default-bootstrap/css/modules/blocklanguages/blocklanguages.css"),
            http("request_202")
			.get("/themes/default-bootstrap/css/modules/blockcontact/blockcontact.css"),
            http("request_203")
			.get("/themes/default-bootstrap/css/modules/blocknewsletter/blocknewsletter.css"),
            http("request_204")
			.get("/js/jquery/plugins/autocomplete/jquery.autocomplete.css"),
            http("request_205")
			.get("/themes/default-bootstrap/css/product_list.css"),
            http("request_206")
			.get("/themes/default-bootstrap/css/modules/blocksearch/blocksearch.css"),
            http("request_207")
			.get("/themes/default-bootstrap/css/modules/blocktags/blocktags.css"),
            http("request_208")
			.get("/themes/default-bootstrap/css/modules/blockuserinfo/blockuserinfo.css"),
            http("request_209")
			.get("/themes/default-bootstrap/css/modules/blockviewed/blockviewed.css"),
            http("request_210")
			.get("/modules/themeconfigurator/css/hooks.css"),
            http("request_211")
			.get("/themes/default-bootstrap/css/modules/blockwishlist/blockwishlist.css"),
            http("request_212")
			.get("/themes/default-bootstrap/css/modules/productcomments/productcomments.css"),
            http("request_213")
			.get("/themes/default-bootstrap/css/modules/blocktopmenu/css/blocktopmenu.css"),
            http("request_214")
			.get("/themes/default-bootstrap/css/modules/blocktopmenu/css/superfish-modified.css"),
            http("request_215")
			.get("/js/jquery/plugins/jquery.typewatch.js"),
            http("request_216")
			.get("/themes/default-bootstrap/js/cart-summary.js"),
            http("request_217")
			.get("http://" + uri5 + "/css?family=Open+Sans:300,600&subset=latin,latin-ext")
			.headers(headers_74),
            http("request_218")
			.get("/img/p/7/7-small_default.jpg"),
            http("request_219")
			.get("/img/p/8/8-small_default.jpg"),
            http("request_220")
			.get("/themes/default-bootstrap/font/fontawesome-webfont.woff?v=3.2.1")
			.headers(headers_75),
            http("request_221")
			.get(uri4)
			.headers(headers_76),
            http("request_222")
			.get("/themes/default-bootstrap/img/order-step-a.png"),
            http("request_223")
			.get("/themes/default-bootstrap/img/order-step-current.png"),
            http("request_224")
			.get("/themes/default-bootstrap/img/footer-bg.png")))
		.pause(3)
		.exec(http("request_225")
			.get("/index.php?controller=order&step=1")
			.headers(headers_99)
			.resources(http("request_226")
			.get("/js/jquery/jquery-migrate-1.2.1.min.js"),
            http("request_227")
			.get("/js/jquery/plugins/jquery.easing.js"),
            http("request_228")
			.get("/js/tools.js"),
            http("request_229")
			.get("/themes/default-bootstrap/js/global.js"),
            http("request_230")
			.get("/themes/default-bootstrap/js/autoload/10-bootstrap.min.js"),
            http("request_231")
			.get("/themes/default-bootstrap/js/autoload/15-jquery.total-storage.min.js"),
            http("request_232")
			.get("/themes/default-bootstrap/js/autoload/15-jquery.uniform-modified.js"),
            http("request_233")
			.get("/js/jquery/plugins/fancybox/jquery.fancybox.js"),
            http("request_234")
			.get("/themes/default-bootstrap/js/products-comparison.js"),
            http("request_235")
			.get("/js/jquery/plugins/jquery.typewatch.js"),
            http("request_236")
			.get("/themes/default-bootstrap/js/modules/blockcart/ajax-cart.js"),
            http("request_237")
			.get("/js/jquery/plugins/jquery.scrollTo.js"),
            http("request_238")
			.get("/js/jquery/plugins/jquery.serialScroll.js"),
            http("request_239")
			.get("/js/jquery/plugins/bxslider/jquery.bxslider.js"),
            http("request_240")
			.get("/themes/default-bootstrap/js/tools/treeManagement.js"),
            http("request_241")
			.get("/themes/default-bootstrap/js/modules/blocknewsletter/blocknewsletter.js"),
            http("request_242")
			.get("/js/jquery/plugins/autocomplete/jquery.autocomplete.js"),
            http("request_243")
			.get("/themes/default-bootstrap/js/modules/blocksearch/blocksearch.js"),
            http("request_244")
			.get("/themes/default-bootstrap/js/modules/blockwishlist/js/ajax-wishlist.js"),
            http("request_245")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/hoverIntent.js"),
            http("request_246")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/superfish-modified.js"),
            http("request_247")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/blocktopmenu.js"),
            http("request_248")
			.get("/modules/blockbanner/img/sale70.png"),
            http("request_249")
			.get("/img/logo.jpg"),
            http("request_250")
			.get("/img/p/8/8-cart_default.jpg"),
            http("request_251")
			.get("/img/p/7/7-cart_default.jpg")
			.headers(headers_148),
            http("request_252")
			.get("/img/c/3-0_thumb.jpg"),
            http("request_253")
			.get("/img/c/3-1_thumb.jpg"),
            http("request_254")
			.get("/themes/default-bootstrap/css/autoload/highdpi.css"),
            http("request_255")
			.get("/themes/default-bootstrap/css/autoload/responsive-tables.css"),
            http("request_256")
			.get("/themes/default-bootstrap/css/global.css"),
            http("request_257")
			.get("/themes/default-bootstrap/css/autoload/uniform.default.css"),
            http("request_258")
			.get("/js/jquery/plugins/fancybox/jquery.fancybox.css"),
            http("request_259")
			.get("/themes/default-bootstrap/css/authentication.css"),
            http("request_260")
			.get("/themes/default-bootstrap/css/modules/blockbanner/blockbanner.css"),
            http("request_261")
			.get("/themes/default-bootstrap/css/modules/blockcurrencies/blockcurrencies.css"),
            http("request_262")
			.get("/themes/default-bootstrap/css/modules/blockcart/blockcart.css"),
            http("request_263")
			.get("/themes/default-bootstrap/css/modules/blockcategories/blockcategories.css"),
            http("request_264")
			.get("/themes/default-bootstrap/css/modules/blocklanguages/blocklanguages.css"),
            http("request_265")
			.get("/themes/default-bootstrap/css/modules/blockcontact/blockcontact.css"),
            http("request_266")
			.get("/themes/default-bootstrap/css/modules/blocknewsletter/blocknewsletter.css"),
            http("request_267")
			.get("/js/jquery/plugins/autocomplete/jquery.autocomplete.css"),
            http("request_268")
			.get("/themes/default-bootstrap/css/product_list.css"),
            http("request_269")
			.get("/themes/default-bootstrap/css/modules/blocksearch/blocksearch.css"),
            http("request_270")
			.get("/themes/default-bootstrap/css/modules/blocktags/blocktags.css"),
            http("request_271")
			.get("/themes/default-bootstrap/css/modules/blockviewed/blockviewed.css"),
            http("request_272")
			.get("/modules/themeconfigurator/css/hooks.css"),
            http("request_273")
			.get("/themes/default-bootstrap/css/modules/blockuserinfo/blockuserinfo.css"),
            http("request_274")
			.get("/themes/default-bootstrap/css/modules/blockwishlist/blockwishlist.css"),
            http("request_275")
			.get("/themes/default-bootstrap/css/modules/productcomments/productcomments.css"),
            http("request_276")
			.get("/themes/default-bootstrap/css/modules/blocktopmenu/css/blocktopmenu.css"),
            http("request_277")
			.get("/themes/default-bootstrap/css/modules/blocktopmenu/css/superfish-modified.css"),
            http("request_278")
			.get("/themes/default-bootstrap/js/tools/vatManagement.js"),
            http("request_279")
			.get("/themes/default-bootstrap/js/tools/statesManagement.js"),
            http("request_280")
			.get("/themes/default-bootstrap/js/authentication.js"),
            http("request_281")
			.get("/js/validate.js"),
            http("request_282")
			.get("/index.php?controller=authentication&multi-shipping=0&display_guest_checkout=0&back=http%3A%2F%2Fautomationpractice.com%2Findex.php%3Fcontroller%3Dorder%26step%3D1%26multi-shipping%3D0")
			.headers(headers_99),
            http("request_283")
			.get("http://" + uri5 + "/css?family=Open+Sans:300,600&subset=latin,latin-ext")
			.headers(headers_74),
            http("request_284")
			.get("/themes/default-bootstrap/font/fontawesome-webfont.woff?v=3.2.1")
			.headers(headers_75),
            http("request_285")
			.get(uri4)
			.headers(headers_76),
            http("request_286")
			.get("/themes/default-bootstrap/img/order-step-a.png"),
            http("request_287")
			.get("/themes/default-bootstrap/img/order-step-current.png"),
            http("request_288")
			.get("/themes/default-bootstrap/img/footer-bg.png"),
            http("request_289")
			.get("/themes/default-bootstrap/img/order-step-done-last.png")))
		.pause(9)
		.exec(http("request_290")
			.get("/themes/default-bootstrap/img/icon/form-ok.png")
			.resources(http("request_291")
			.post("/index.php")
			.headers(headers_160)
			.formParam("controller", "authentication")
			.formParam("SubmitCreate", "1")
			.formParam("ajax", "true")
			.formParam("email_create", "binbin@gmail.com")
			.formParam("back", "http://automationpractice.com/index.php?controller=order&step=1&multi-shipping=0")
			.formParam("token", "ce65cefcbafad255f0866d3b32d32058")))
		.pause(1)
		.exec(http("request_292")
			.get("/themes/default-bootstrap/img/jquery/uniform/sprite.png"))
		.pause(76)
		.exec(http("request_293")
			.post("/index.php?controller=authentication")
			.headers(headers_293)
			.formParam("id_gender", "1")
			.formParam("customer_firstname", "Joseph")
			.formParam("customer_lastname", "test")
			.formParam("email", "binbin@gmail.com")
			.formParam("passwd", "hythythythy")
			.formParam("days", "28")
			.formParam("months", "2")
			.formParam("years", "2001")
			.formParam("newsletter", "1")
			.formParam("optin", "1")
			.formParam("firstname", "Joseph")
			.formParam("lastname", "La Macchia")
			.formParam("company", "")
			.formParam("address1", "court court 08832")
			.formParam("address2", "")
			.formParam("city", "tasmin")
			.formParam("id_state", "16")
			.formParam("postcode", "08832")
			.formParam("id_country", "21")
			.formParam("other", "")
			.formParam("phone", "")
			.formParam("phone_mobile", "8431212122")
			.formParam("alias", "My address")
			.formParam("dni", "")
			.formParam("email_create", "1")
			.formParam("is_new_customer", "1")
			.formParam("back", "http://automationpractice.com/index.php?controller=order&step=1&multi-shipping=0")
			.formParam("submitAccount", "")
			.resources(http("request_294")
			.get("/js/jquery/jquery-1.11.0.min.js"),
            http("request_295")
			.get("/js/jquery/jquery-migrate-1.2.1.min.js"),
            http("request_296")
			.get("/js/jquery/plugins/jquery.easing.js"),
            http("request_297")
			.get("/js/tools.js"),
            http("request_298")
			.get("/themes/default-bootstrap/js/global.js"),
            http("request_299")
			.get("/themes/default-bootstrap/js/autoload/10-bootstrap.min.js"),
            http("request_300")
			.get("/themes/default-bootstrap/js/autoload/15-jquery.total-storage.min.js"),
            http("request_301")
			.get("/themes/default-bootstrap/js/autoload/15-jquery.uniform-modified.js"),
            http("request_302")
			.get("/js/jquery/plugins/fancybox/jquery.fancybox.js"),
            http("request_303")
			.get("/themes/default-bootstrap/js/products-comparison.js"),
            http("request_304")
			.get("/themes/default-bootstrap/js/modules/blockcart/ajax-cart.js"),
            http("request_305")
			.get("/js/jquery/plugins/jquery.scrollTo.js"),
            http("request_306")
			.get("/js/jquery/plugins/jquery.serialScroll.js"),
            http("request_307")
			.get("/js/jquery/plugins/bxslider/jquery.bxslider.js"),
            http("request_308")
			.get("/themes/default-bootstrap/js/tools/treeManagement.js"),
            http("request_309")
			.get("/themes/default-bootstrap/js/modules/blocknewsletter/blocknewsletter.js"),
            http("request_310")
			.get("/js/jquery/plugins/autocomplete/jquery.autocomplete.js"),
            http("request_311")
			.get("/themes/default-bootstrap/js/modules/blocksearch/blocksearch.js"),
            http("request_312")
			.get("/themes/default-bootstrap/js/modules/blockwishlist/js/ajax-wishlist.js"),
            http("request_313")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/hoverIntent.js"),
            http("request_314")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/superfish-modified.js"),
            http("request_315")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/blocktopmenu.js"),
            http("request_316")
			.get("/modules/blockbanner/img/sale70.png"),
            http("request_317")
			.get("/img/logo.jpg"),
            http("request_318")
			.get("/img/p/8/8-cart_default.jpg"),
            http("request_319")
			.get("/img/p/7/7-cart_default.jpg")
			.headers(headers_148),
            http("request_320")
			.get("/img/c/3-0_thumb.jpg"),
            http("request_321")
			.get("/img/c/3-1_thumb.jpg"),
            http("request_322")
			.get("/themes/default-bootstrap/css/global.css"),
            http("request_323")
			.get("/themes/default-bootstrap/css/autoload/highdpi.css"),
            http("request_324")
			.get("/themes/default-bootstrap/css/autoload/responsive-tables.css"),
            http("request_325")
			.get("/themes/default-bootstrap/css/autoload/uniform.default.css"),
            http("request_326")
			.get("/js/jquery/plugins/fancybox/jquery.fancybox.css"),
            http("request_327")
			.get("/themes/default-bootstrap/css/addresses.css"),
            http("request_328")
			.get("/themes/default-bootstrap/css/modules/blockbanner/blockbanner.css"),
            http("request_329")
			.get("/themes/default-bootstrap/css/modules/blockcart/blockcart.css"),
            http("request_330")
			.get("/themes/default-bootstrap/css/modules/blockcategories/blockcategories.css"),
            http("request_331")
			.get("/themes/default-bootstrap/css/modules/blockcurrencies/blockcurrencies.css"),
            http("request_332")
			.get("/themes/default-bootstrap/css/modules/blocklanguages/blocklanguages.css"),
            http("request_333")
			.get("/themes/default-bootstrap/css/product_list.css"),
            http("request_334")
			.get("/themes/default-bootstrap/css/modules/blockcontact/blockcontact.css"),
            http("request_335")
			.get("/themes/default-bootstrap/css/modules/blocknewsletter/blocknewsletter.css"),
            http("request_336")
			.get("/js/jquery/plugins/autocomplete/jquery.autocomplete.css"),
            http("request_337")
			.get("/themes/default-bootstrap/css/modules/blocksearch/blocksearch.css"),
            http("request_338")
			.get("/themes/default-bootstrap/css/modules/blocktags/blocktags.css"),
            http("request_339")
			.get("/themes/default-bootstrap/css/modules/blockuserinfo/blockuserinfo.css"),
            http("request_340")
			.get("/themes/default-bootstrap/css/modules/blockwishlist/blockwishlist.css"),
            http("request_341")
			.get("/themes/default-bootstrap/css/modules/productcomments/productcomments.css"),
            http("request_342")
			.get("/themes/default-bootstrap/css/modules/blockviewed/blockviewed.css"),
            http("request_343")
			.get("/modules/themeconfigurator/css/hooks.css"),
            http("request_344")
			.get("/themes/default-bootstrap/css/modules/blocktopmenu/css/blocktopmenu.css"),
            http("request_345")
			.get("/themes/default-bootstrap/css/modules/blocktopmenu/css/superfish-modified.css"),
            http("request_346")
			.get("/themes/default-bootstrap/js/order-address.js")
			.headers(headers_140),
            http("request_347")
			.get("http://" + uri5 + "/css?family=Open+Sans:300,600&subset=latin,latin-ext")
			.headers(headers_74),
            http("request_348")
			.get("/themes/default-bootstrap/font/fontawesome-webfont.woff?v=3.2.1")
			.headers(headers_75),
            http("request_349")
			.get(uri4)
			.headers(headers_76),
            http("request_350")
			.get("/themes/default-bootstrap/img/order-step-done-last.png"),
            http("request_351")
			.get("/themes/default-bootstrap/img/order-step-a.png"),
            http("request_352")
			.get("/themes/default-bootstrap/img/order-step-current.png"),
            http("request_353")
			.get("/themes/default-bootstrap/img/footer-bg.png"),
            http("request_354")
			.get("/themes/default-bootstrap/img/order-step-done.png")
			.headers(headers_148),
            http("request_355")
			.get("/themes/default-bootstrap/img/jquery/uniform/sprite.png")))
		.pause(3)
		.exec(http("request_356")
			.get("/themes/default-bootstrap/css/autoload/highdpi.css")
			.resources(http("request_357")
			.get("/themes/default-bootstrap/css/autoload/responsive-tables.css"),
            http("request_358")
			.get("/themes/default-bootstrap/css/autoload/uniform.default.css"),
            http("request_359")
			.get("/js/jquery/plugins/fancybox/jquery.fancybox.css"),
            http("request_360")
			.get("/themes/default-bootstrap/css/addresses.css"),
            http("request_361")
			.get("/themes/default-bootstrap/css/modules/blockbanner/blockbanner.css"),
            http("request_362")
			.get("/themes/default-bootstrap/css/modules/blockcart/blockcart.css"),
            http("request_363")
			.get("/themes/default-bootstrap/css/modules/blockcategories/blockcategories.css"),
            http("request_364")
			.get("/themes/default-bootstrap/css/modules/blocknewsletter/blocknewsletter.css"),
            http("request_365")
			.get("/themes/default-bootstrap/css/global.css"),
            http("request_366")
			.get("/themes/default-bootstrap/css/modules/blockcurrencies/blockcurrencies.css"),
            http("request_367")
			.get("/themes/default-bootstrap/css/modules/blocklanguages/blocklanguages.css"),
            http("request_368")
			.get("/themes/default-bootstrap/css/modules/blockcontact/blockcontact.css"),
            http("request_369")
			.get("/js/jquery/plugins/autocomplete/jquery.autocomplete.css"),
            http("request_370")
			.get("/themes/default-bootstrap/css/product_list.css"),
            http("request_371")
			.get("/themes/default-bootstrap/css/modules/blocksearch/blocksearch.css"),
            http("request_372")
			.post("/index.php?controller=order")
			.headers(headers_293)
			.formParam("id_address_delivery", "573035")
			.formParam("same", "1")
			.formParam("message", "")
			.formParam("step", "2")
			.formParam("back", "")
			.formParam("processAddress", ""),
            http("request_373")
			.get("/js/jquery/jquery-1.11.0.min.js"),
            http("request_374")
			.get("/js/jquery/jquery-migrate-1.2.1.min.js"),
            http("request_375")
			.get("/js/jquery/plugins/jquery.easing.js"),
            http("request_376")
			.get("/js/tools.js"),
            http("request_377")
			.get("/themes/default-bootstrap/js/global.js"),
            http("request_378")
			.get("/themes/default-bootstrap/js/autoload/10-bootstrap.min.js"),
            http("request_379")
			.get("/themes/default-bootstrap/js/autoload/15-jquery.total-storage.min.js"),
            http("request_380")
			.get("/themes/default-bootstrap/js/autoload/15-jquery.uniform-modified.js"),
            http("request_381")
			.get("/js/jquery/plugins/fancybox/jquery.fancybox.js"),
            http("request_382")
			.get("/themes/default-bootstrap/js/products-comparison.js"),
            http("request_383")
			.get("/js/jquery/plugins/jquery.typewatch.js"),
            http("request_384")
			.get("/themes/default-bootstrap/js/cart-summary.js"),
            http("request_385")
			.get("/themes/default-bootstrap/js/modules/blockcart/ajax-cart.js"),
            http("request_386")
			.get("/js/jquery/plugins/jquery.scrollTo.js"),
            http("request_387")
			.get("/js/jquery/plugins/jquery.serialScroll.js"),
            http("request_388")
			.get("/js/jquery/plugins/bxslider/jquery.bxslider.js"),
            http("request_389")
			.get("/themes/default-bootstrap/js/tools/treeManagement.js"),
            http("request_390")
			.get("/themes/default-bootstrap/js/modules/blocknewsletter/blocknewsletter.js"),
            http("request_391")
			.get("/js/jquery/plugins/autocomplete/jquery.autocomplete.js"),
            http("request_392")
			.get("/themes/default-bootstrap/js/modules/blocksearch/blocksearch.js"),
            http("request_393")
			.get("/themes/default-bootstrap/js/modules/blockwishlist/js/ajax-wishlist.js"),
            http("request_394")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/hoverIntent.js"),
            http("request_395")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/superfish-modified.js"),
            http("request_396")
			.get("/themes/default-bootstrap/css/modules/blocktags/blocktags.css"),
            http("request_397")
			.get("/themes/default-bootstrap/css/modules/blockuserinfo/blockuserinfo.css"),
            http("request_398")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/blocktopmenu.js"),
            http("request_399")
			.get("/modules/blockbanner/img/sale70.png"),
            http("request_400")
			.get("/img/logo.jpg"),
            http("request_401")
			.get("/img/p/8/8-cart_default.jpg"),
            http("request_402")
			.get("/themes/default-bootstrap/css/modules/blockviewed/blockviewed.css"),
            http("request_403")
			.get("/img/p/7/7-cart_default.jpg")
			.headers(headers_148),
            http("request_404")
			.get("/img/c/3-0_thumb.jpg"),
            http("request_405")
			.get("/img/c/3-1_thumb.jpg"),
            http("request_406")
			.get("/modules/themeconfigurator/css/hooks.css"),
            http("request_407")
			.get("/themes/default-bootstrap/css/modules/blockwishlist/blockwishlist.css"),
            http("request_408")
			.get("/themes/default-bootstrap/css/modules/productcomments/productcomments.css"),
            http("request_409")
			.get("/themes/default-bootstrap/css/modules/blocktopmenu/css/blocktopmenu.css"),
            http("request_410")
			.get("/themes/default-bootstrap/css/modules/blocktopmenu/css/superfish-modified.css"),
            http("request_411")
			.get("http://" + uri5 + "/css?family=Open+Sans:300,600&subset=latin,latin-ext")
			.headers(headers_74),
            http("request_412")
			.get("https://" + uri5 + "/css?family=Open+Sans:300,600&subset=latin,latin-ext"),
            http("request_413")
			.get("/img/s/2.jpg")
			.headers(headers_148),
            http("request_414")
			.get("/themes/default-bootstrap/font/fontawesome-webfont.woff?v=3.2.1")
			.headers(headers_75),
            http("request_415")
			.get("/themes/default-bootstrap/img/order-step-done.png")
			.headers(headers_148),
            http("request_416")
			.get("/themes/default-bootstrap/img/order-step-done-last.png"),
            http("request_417")
			.get("/themes/default-bootstrap/img/order-step-a.png"),
            http("request_418")
			.get("/themes/default-bootstrap/img/footer-bg.png"),
            http("request_419")
			.get(uri4)
			.headers(headers_76),
            http("request_420")
			.get("/themes/default-bootstrap/img/jquery/uniform/sprite.png")))
		.pause(2)
		.exec(http("request_421")
			.get("/js/jquery/plugins/fancybox/fancybox_overlay.png")
			.headers(headers_148))
		.pause(3)
		.exec(http("request_422")
			.post("/index.php?controller=order&multi-shipping=")
			.headers(headers_293)
			.formParam("delivery_option[573035]", "2,")
			.formParam("cgv", "1")
			.formParam("step", "3")
			.formParam("back", "")
			.formParam("processCarrier", "")
			.resources(http("request_423")
			.get("/js/jquery/jquery-1.11.0.min.js"),
            http("request_424")
			.get("/js/jquery/jquery-migrate-1.2.1.min.js"),
            http("request_425")
			.get("/js/jquery/plugins/jquery.easing.js"),
            http("request_426")
			.get("/js/tools.js"),
            http("request_427")
			.get("/themes/default-bootstrap/js/global.js"),
            http("request_428")
			.get("/themes/default-bootstrap/js/autoload/10-bootstrap.min.js"),
            http("request_429")
			.get("/themes/default-bootstrap/js/autoload/15-jquery.total-storage.min.js"),
            http("request_430")
			.get("/themes/default-bootstrap/js/autoload/15-jquery.uniform-modified.js"),
            http("request_431")
			.get("/js/jquery/plugins/fancybox/jquery.fancybox.js"),
            http("request_432")
			.get("/themes/default-bootstrap/js/products-comparison.js"),
            http("request_433")
			.get("/themes/default-bootstrap/js/modules/blockcart/ajax-cart.js"),
            http("request_434")
			.get("/js/jquery/plugins/jquery.scrollTo.js"),
            http("request_435")
			.get("/js/jquery/plugins/jquery.serialScroll.js"),
            http("request_436")
			.get("/js/jquery/plugins/bxslider/jquery.bxslider.js"),
            http("request_437")
			.get("/themes/default-bootstrap/js/tools/treeManagement.js"),
            http("request_438")
			.get("/themes/default-bootstrap/js/modules/blocknewsletter/blocknewsletter.js"),
            http("request_439")
			.get("/js/jquery/plugins/autocomplete/jquery.autocomplete.js"),
            http("request_440")
			.get("/themes/default-bootstrap/js/modules/blocksearch/blocksearch.js"),
            http("request_441")
			.get("/themes/default-bootstrap/js/modules/blockwishlist/js/ajax-wishlist.js"),
            http("request_442")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/hoverIntent.js"),
            http("request_443")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/superfish-modified.js"),
            http("request_444")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/blocktopmenu.js"),
            http("request_445")
			.get("/modules/blockbanner/img/sale70.png"),
            http("request_446")
			.get("/img/logo.jpg"),
            http("request_447")
			.get("/img/p/8/8-cart_default.jpg"),
            http("request_448")
			.get("/img/p/7/7-cart_default.jpg")
			.headers(headers_148),
            http("request_449")
			.get("/img/c/3-0_thumb.jpg"),
            http("request_450")
			.get("/img/c/3-1_thumb.jpg"),
            http("request_451")
			.get("/img/p/8/8-small_default.jpg"),
            http("request_452")
			.get("/img/p/7/7-small_default.jpg"),
            http("request_453")
			.get("/themes/default-bootstrap/css/autoload/highdpi.css"),
            http("request_454")
			.get("/themes/default-bootstrap/css/autoload/responsive-tables.css"),
            http("request_455")
			.get("/themes/default-bootstrap/css/autoload/uniform.default.css"),
            http("request_456")
			.get("/js/jquery/plugins/fancybox/jquery.fancybox.css"),
            http("request_457")
			.get("/themes/default-bootstrap/css/global.css"),
            http("request_458")
			.get("/themes/default-bootstrap/css/addresses.css"),
            http("request_459")
			.get("/themes/default-bootstrap/css/modules/blockbanner/blockbanner.css"),
            http("request_460")
			.get("/themes/default-bootstrap/css/modules/blockcart/blockcart.css"),
            http("request_461")
			.get("/themes/default-bootstrap/css/modules/blockcategories/blockcategories.css"),
            http("request_462")
			.get("/themes/default-bootstrap/css/modules/blockcurrencies/blockcurrencies.css"),
            http("request_463")
			.get("/themes/default-bootstrap/css/modules/blocklanguages/blocklanguages.css"),
            http("request_464")
			.get("/themes/default-bootstrap/css/modules/blockcontact/blockcontact.css"),
            http("request_465")
			.get("/themes/default-bootstrap/css/modules/blocknewsletter/blocknewsletter.css"),
            http("request_466")
			.get("/js/jquery/plugins/autocomplete/jquery.autocomplete.css"),
            http("request_467")
			.get("/themes/default-bootstrap/css/product_list.css"),
            http("request_468")
			.get("/themes/default-bootstrap/css/modules/blocksearch/blocksearch.css"),
            http("request_469")
			.get("/modules/themeconfigurator/css/hooks.css"),
            http("request_470")
			.get("/themes/default-bootstrap/css/modules/blocktags/blocktags.css"),
            http("request_471")
			.get("/themes/default-bootstrap/css/modules/blockuserinfo/blockuserinfo.css"),
            http("request_472")
			.get("/themes/default-bootstrap/css/modules/blockviewed/blockviewed.css"),
            http("request_473")
			.get("/themes/default-bootstrap/css/modules/blockwishlist/blockwishlist.css"),
            http("request_474")
			.get("/themes/default-bootstrap/css/modules/productcomments/productcomments.css"),
            http("request_475")
			.get("/themes/default-bootstrap/css/modules/blocktopmenu/css/blocktopmenu.css"),
            http("request_476")
			.get("/themes/default-bootstrap/css/modules/blocktopmenu/css/superfish-modified.css"),
            http("request_477")
			.get("http://" + uri5 + "/css?family=Open+Sans:300,600&subset=latin,latin-ext")
			.headers(headers_74),
            http("request_478")
			.get("/themes/default-bootstrap/font/fontawesome-webfont.woff?v=3.2.1")
			.headers(headers_75),
            http("request_479")
			.get(uri4)
			.headers(headers_76),
            http("request_480")
			.get("/themes/default-bootstrap/img/order-step-done.png")
			.headers(headers_148),
            http("request_481")
			.get("/themes/default-bootstrap/img/order-step-done-last.png"),
            http("request_482")
			.get("/themes/default-bootstrap/img/footer-bg.png"),
            http("request_483")
			.get("/themes/default-bootstrap/img/bankwire.png")
			.headers(headers_148),
            http("request_484")
			.get("/themes/default-bootstrap/img/cheque.png")
			.headers(headers_148)))
		.pause(3)
		.exec(http("request_485")
			.get("/index.php?fc=module&module=bankwire&controller=payment")
			.headers(headers_99)
			.resources(http("request_486")
			.get("/js/jquery/jquery-1.11.0.min.js"),
            http("request_487")
			.get("/js/jquery/jquery-migrate-1.2.1.min.js"),
            http("request_488")
			.get("/js/jquery/plugins/jquery.easing.js"),
            http("request_489")
			.get("/js/tools.js"),
            http("request_490")
			.get("/themes/default-bootstrap/js/global.js"),
            http("request_491")
			.get("/themes/default-bootstrap/js/autoload/10-bootstrap.min.js"),
            http("request_492")
			.get("/themes/default-bootstrap/js/autoload/15-jquery.total-storage.min.js"),
            http("request_493")
			.get("/themes/default-bootstrap/js/autoload/15-jquery.uniform-modified.js"),
            http("request_494")
			.get("/js/jquery/plugins/fancybox/jquery.fancybox.js"),
            http("request_495")
			.get("/themes/default-bootstrap/js/products-comparison.js"),
            http("request_496")
			.get("/themes/default-bootstrap/js/modules/blockcart/ajax-cart.js"),
            http("request_497")
			.get("/js/jquery/plugins/jquery.scrollTo.js"),
            http("request_498")
			.get("/js/jquery/plugins/jquery.serialScroll.js"),
            http("request_499")
			.get("/js/jquery/plugins/bxslider/jquery.bxslider.js"),
            http("request_500")
			.get("/themes/default-bootstrap/js/tools/treeManagement.js"),
            http("request_501")
			.get("/themes/default-bootstrap/js/modules/blocknewsletter/blocknewsletter.js"),
            http("request_502")
			.get("/js/jquery/plugins/autocomplete/jquery.autocomplete.js"),
            http("request_503")
			.get("/themes/default-bootstrap/js/modules/blocksearch/blocksearch.js"),
            http("request_504")
			.get("/themes/default-bootstrap/js/modules/blockwishlist/js/ajax-wishlist.js"),
            http("request_505")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/hoverIntent.js"),
            http("request_506")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/superfish-modified.js"),
            http("request_507")
			.get("/themes/default-bootstrap/js/modules/blocktopmenu/js/blocktopmenu.js"),
            http("request_508")
			.get("/modules/blockbanner/img/sale70.png"),
            http("request_509")
			.get("/img/logo.jpg"),
            http("request_510")
			.get("/img/p/8/8-cart_default.jpg"),
            http("request_511")
			.get("/img/p/7/7-cart_default.jpg")
			.headers(headers_148),
            http("request_512")
			.get("/img/c/3-0_thumb.jpg"),
            http("request_513")
			.get("/img/c/3-1_thumb.jpg"),
            http("request_514")
			.get("/themes/default-bootstrap/css/autoload/highdpi.css"),
            http("request_515")
			.get("/themes/default-bootstrap/css/global.css"),
            http("request_516")
			.get("/themes/default-bootstrap/css/autoload/responsive-tables.css"),
            http("request_517")
			.get("/themes/default-bootstrap/css/autoload/uniform.default.css"),
            http("request_518")
			.get("/js/jquery/plugins/fancybox/jquery.fancybox.css"),
            http("request_519")
			.get("/themes/default-bootstrap/css/modules/blockbanner/blockbanner.css"),
            http("request_520")
			.get("/themes/default-bootstrap/css/modules/blockcart/blockcart.css"),
            http("request_521")
			.get("/themes/default-bootstrap/css/modules/blockcategories/blockcategories.css"),
            http("request_522")
			.get("/themes/default-bootstrap/css/modules/blockcurrencies/blockcurrencies.css"),
            http("request_523")
			.get("/themes/default-bootstrap/css/modules/blocklanguages/blocklanguages.css"),
            http("request_524")
			.get("/themes/default-bootstrap/css/modules/blocknewsletter/blocknewsletter.css"),
            http("request_525")
			.get("/themes/default-bootstrap/css/modules/blockcontact/blockcontact.css"),
            http("request_526")
			.get("/js/jquery/plugins/autocomplete/jquery.autocomplete.css"),
            http("request_527")
			.get("/themes/default-bootstrap/css/product_list.css"),
            http("request_528")
			.get("/themes/default-bootstrap/css/modules/blocksearch/blocksearch.css"),
            http("request_529")
			.get("/themes/default-bootstrap/css/modules/blocktags/blocktags.css"),
            http("request_530")
			.get("/themes/default-bootstrap/css/modules/blockuserinfo/blockuserinfo.css"),
            http("request_531")
			.get("/themes/default-bootstrap/css/modules/blockviewed/blockviewed.css"),
            http("request_532")
			.get("/modules/themeconfigurator/css/hooks.css"),
            http("request_533")
			.get("/themes/default-bootstrap/css/modules/blockwishlist/blockwishlist.css"),
            http("request_534")
			.get("/themes/default-bootstrap/css/modules/productcomments/productcomments.css"),
            http("request_535")
			.get("/themes/default-bootstrap/css/modules/blocktopmenu/css/blocktopmenu.css"),
            http("request_536")
			.get("/themes/default-bootstrap/css/modules/blocktopmenu/css/superfish-modified.css"),
            http("request_537")
			.get("http://" + uri5 + "/css?family=Open+Sans:300,600&subset=latin,latin-ext")
			.headers(headers_74),
            http("request_538")
			.get("/themes/default-bootstrap/font/fontawesome-webfont.woff?v=3.2.1")
			.headers(headers_75),
            http("request_539")
			.get(uri4)
			.headers(headers_76),
            http("request_540")
			.get("/themes/default-bootstrap/img/order-step-done.png")
			.headers(headers_148),
            http("request_541")
			.get("/themes/default-bootstrap/img/order-step-done-last.png"),
            http("request_542")
			.get("/themes/default-bootstrap/img/footer-bg.png")))
		.pause(2)
		.exec(http("request_543")
			.post("/index.php?fc=module&module=bankwire&controller=validation")
			.headers(headers_293)
			.formParam("currency_payement", "1")
			.resources(http("request_544")
			.get("/themes/default-bootstrap/font/fontawesome-webfont.woff?v=3.2.1")
			.headers(headers_75),
            http("request_545")
			.get(uri4)
			.headers(headers_76),
            http("request_546")
			.get("/themes/default-bootstrap/img/order-step-done.png")
			.headers(headers_148),
            http("request_547")
			.get("/themes/default-bootstrap/img/order-step-done-last.png"),
            http("request_548")
			.get("/themes/default-bootstrap/img/footer-bg.png")))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}