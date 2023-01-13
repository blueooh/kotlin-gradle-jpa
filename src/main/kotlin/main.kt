import model.*
import javax.persistence.Persistence

fun main() {
    val emf = Persistence.createEntityManagerFactory("hello")
    val em = emf.createEntityManager()

    val tx = em.transaction

    tx.begin()

    val address = Address("Young-in", 1111)
    val member = Member(userName = "andy.oh", address = address)
    em.persist(member)

    tx.commit()

    em.close()
    emf.close()
}