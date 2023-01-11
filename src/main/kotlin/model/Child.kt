package model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
class Child (
    @Id @GeneratedValue
    var id: Long? = null,

    var name: String,

    @ManyToOne
    @JoinColumn(name = "parent_id")
    var parent: Parent? = null
)