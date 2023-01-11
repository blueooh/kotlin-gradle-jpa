import model.Album
import model.Member
import model.Team
import javax.persistence.Persistence

fun main() {
    val emf = Persistence.createEntityManagerFactory("hello")
    val em = emf.createEntityManager()

    val tx = em.transaction

    tx.begin()

    val album = Album("andy.oh", 100, "BTS")
    em.persist(album)

    tx.commit()

    em.close()
    emf.close()
}