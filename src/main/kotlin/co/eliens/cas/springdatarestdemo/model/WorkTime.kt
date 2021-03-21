package co.eliens.cas.springdatarestdemo.model

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class WorkTime(
        @Id @GeneratedValue
        var id: Long,
        var start: LocalDateTime,
        var end: LocalDateTime,
        @ManyToOne var employee: Employee,
        @ManyToOne var project: Project
)