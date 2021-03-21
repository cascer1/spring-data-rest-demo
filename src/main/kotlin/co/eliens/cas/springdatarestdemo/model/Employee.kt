package co.eliens.cas.springdatarestdemo.model

import javax.persistence.*

@Entity
class Employee(
        @Id @GeneratedValue
        var id: Long,
        var name: String,
        var email: String,
        @ManyToMany(cascade = [CascadeType.ALL])
        var projects: List<Project> = ArrayList(),
        @OneToMany(mappedBy = "employee")
        var workTimes: List<WorkTime> = ArrayList()
)