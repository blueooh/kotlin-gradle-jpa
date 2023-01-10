package model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
class Member(
    @Id @GeneratedValue
    @Column(name = "member_id")
    val id: Long? = null,

    @Column(name="name")
    var userName: String,

    //@Column(name = "team_id")
    //var teamId: Long,

    @ManyToOne
    @JoinColumn(name = "team_id")
    var team: Team? = null
)