package model

import javax.persistence.Entity

@Entity
class Album(
    var name: String,
    var price: Int,
    var artist: String
): Item(name = name, price = price)