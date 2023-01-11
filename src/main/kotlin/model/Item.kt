package model

import javax.persistence.*

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn
abstract class Item(
    @Id @GeneratedValue
    private var id: Long? = null,
    private var name: String,
    private var price: Int
)