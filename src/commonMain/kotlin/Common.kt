package example

import kotlinx.serialization.Serializable

@Serializable
data class Project(
    val id: Int,
    val name: String
)