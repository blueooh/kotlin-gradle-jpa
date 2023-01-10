package model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToMany

@Entity
class Team (
    @Id @GeneratedValue
    @Column(name = "team_id")
    var id: Long? = null,

    var name: String,

    @OneToMany
    @JoinColumn(name = "team")
    var members: MutableList<Member> = mutableListOf()
)