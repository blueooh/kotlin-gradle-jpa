package model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@NamedQuery(
    name = "Member.findByUsername",
    query = "select m from Member m where m.userName = :userName"
)
class Member(
    @Id @GeneratedValue
    @Column(name = "member_id")
    val id: Long? = null,

    @Column(name="name")
    var userName: String,

    //@Column(name = "team_id")
    //var teamId: Long,

    @Embedded
    var address: Address,

    @ManyToOne(fetch = FetchType.LAZY)
    //@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "team_id")
    var team: Team? = null,

    @ElementCollection
    @CollectionTable(name = "favorite_food", joinColumns = [JoinColumn(name = "member_id")])
    var favoriteFoods: Set<String> = setOf(),

    @ElementCollection
    @CollectionTable(name = "address", joinColumns = [JoinColumn(name = "member_id")])
    var addressHistory: MutableList<Address> = mutableListOf()

): BaseEntity() {
}