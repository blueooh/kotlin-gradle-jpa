package model

import javax.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
class Item(
    @Id @GeneratedValue
    private var id: Long? = null,
    private var name: String,
    private var price: Int
)