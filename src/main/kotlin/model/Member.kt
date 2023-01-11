package model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Member(
    @Id @GeneratedValue
    @Column(name = "member_id")
    val id: Long? = null,

    @Column(name="name")
    var userName: String,

    //@Column(name = "team_id")
    //var teamId: Long,

    @ManyToOne(fetch = FetchType.LAZY)
    //@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "team_id")
    var team: Team? = null,

): BaseEntity() {
}