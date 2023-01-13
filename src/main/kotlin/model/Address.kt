package model

import javax.persistence.Embeddable

@Embeddable
data class Address (
    private var city: String,
    private var zipcode: Int,
)