import model.Member
import javax.persistence.Persistence

fun main() {
    val emf = Persistence.createEntityManagerFactory("hello")
    val em = emf.createEntityManager()

    val tx = em.transaction
    tx.begin()

    val m = em.find(Member::class.java, 1L)
    m.name = "ksoh"
    println(m.name)

    tx.commit()

    em.close()
    emf.close()
}