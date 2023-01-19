import model.*
import javax.persistence.Persistence

fun main() {
    val emf = Persistence.createEntityManagerFactory("hello")
    val em = emf.createEntityManager()

    val tx = em.transaction

    tx.begin()

    val address = Address(city = "Young-in", zipcode = 1111)
    val member1 = Member(userName = "andy.oh", address = address)
    em.persist(member1)

    em.createQuery("select m from Member as m").resultList

    val memberList = em.createNamedQuery("Member.findByUsername", Member::class.java)
        .setParameter("userName", "andy.oh")
        .resultList
    memberList.forEach {
        println("--> ${it.userName}")
    }

    tx.commit()

    em.close()
    emf.close()
}