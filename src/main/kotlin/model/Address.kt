package model

import javax.persistence.Embeddable

@Embeddable
class Address (
    var city: String,
    var zipcode: Int,
)