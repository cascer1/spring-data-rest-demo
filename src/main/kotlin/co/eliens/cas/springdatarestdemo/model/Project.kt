package co.eliens.cas.springdatarestdemo.model

import javax.persistence.*

@Entity
class Project(
        @Id @GeneratedValue
        val id: Long,

        var name: String,
        var slogan: String?,
        var description: String?,

        @ManyToMany(cascade = [CascadeType.ALL], mappedBy = "projects")
        var employees: List<Employee> = ArrayList(),
        @OneToMany(mappedBy = "project")
        var workTimes: List<WorkTime> = ArrayList()
)