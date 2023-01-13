import model.*
import javax.persistence.Persistence

fun main() {
    val emf = Persistence.createEntityManagerFactory("hello")
    val em = emf.createEntityManager()

    val tx = em.transaction

    tx.begin()

    val member = em.find(Member::class.java, 1L)
    member.addressHistory.remove(Address("Young-in", 1111))

    tx.commit()

    em.close()
    emf.close()
}