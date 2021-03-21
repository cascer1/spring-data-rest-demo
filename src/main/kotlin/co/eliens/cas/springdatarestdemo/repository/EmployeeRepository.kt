package co.eliens.cas.springdatarestdemo.repository

import co.eliens.cas.springdatarestdemo.model.Employee
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path = "employees", collectionResourceRel = "employees")
interface EmployeeRepository: PagingAndSortingRepository<Employee, Long>