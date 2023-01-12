import model.Child
import model.Member
import model.Parent
import model.Team
import javax.persistence.Persistence

fun main() {
    val emf = Persistence.createEntityManagerFactory("hello")
    val em = emf.createEntityManager()

    val tx = em.transaction

    tx.begin()

    val team = em.find(Team::class.java, 1L)
    team.name = "naver"

    tx.commit()

    em.close()
    emf.close()
}