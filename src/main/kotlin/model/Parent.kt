package model

import javax.persistence.CascadeType
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class Parent (
    @Id @GeneratedValue
    @Column(name = "parent_id")
    var id: Long? = null,

    @OneToMany(mappedBy = "parent", cascade = [CascadeType.ALL])
    var children: MutableList<Child> = mutableListOf()
) {
    fun addChild(child: Child) {
        children.add(child)
        child.parent = this
    }
}