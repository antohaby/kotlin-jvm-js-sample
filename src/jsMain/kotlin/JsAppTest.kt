
import example.*
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.js.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

fun main() {
    val client = HttpClient(Js) {
        install(ContentNegotiation) {
            json()
        }
    }

    GlobalScope.launch {
        val projects = client.get("http://localhost:8080").body<List<Project>>()
        println("Projects: \u001b[0;32m${projects}\u001b[0m")
    }
}