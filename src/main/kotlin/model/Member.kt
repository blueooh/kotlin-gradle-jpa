package model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Member(
    @Id
    val id: Long,
    var name: String
)