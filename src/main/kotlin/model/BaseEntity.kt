package model

import java.time.LocalDateTime
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class BaseEntity {
    var createBy: String? = null
    var createAt: LocalDateTime? = null
}