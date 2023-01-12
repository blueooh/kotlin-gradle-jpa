package model

import javax.persistence.*

@Entity
class Child (
    @Id @GeneratedValue
    var id: Long? = null,

    var name: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    var parent: Parent? = null
)