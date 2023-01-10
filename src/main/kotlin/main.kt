import model.Member
import model.Team
import javax.persistence.Persistence

fun main() {
    val emf = Persistence.createEntityManagerFactory("hello")
    val em = emf.createEntityManager()

    val tx = em.transaction
    tx.begin()

    //val newTeam = Team(name = "kakao")
    //em.persist(newTeam)
    val newMember = Member(userName = "hayeon.oh")
    em.persist(newMember)

    val newTeam = Team(name = "naver")
    newTeam.members.add(newMember)
    em.persist(newTeam)

    tx.commit()

    em.close()
    emf.close()
}