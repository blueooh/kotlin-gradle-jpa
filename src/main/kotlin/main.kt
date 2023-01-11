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

    //val newUser = Member(userName = "andy.oh", team = newTeam)
    //em.persist(newUser)

    val user = em.find(Member::class.java,2L)

    //println(user.team?.name)

    tx.commit()

    em.close()
    emf.close()
}