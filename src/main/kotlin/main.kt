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

    val child1 = Child(name = "soeun")
    val child2 = Child(name = "hayeon")

    val parent = Parent()
    parent.addChild(child1)
    parent.addChild(child2)

    em.persist(parent)

    val user = em.find(Member::class.java,2L)

    //println(user.team?.name)

    tx.commit()

    em.close()
    emf.close()
}