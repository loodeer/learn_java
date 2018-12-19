@RestController
class HelloController {
	@RequestMapping("/")
	def hello() {
		return "hello world"
	}
}
