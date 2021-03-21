package co.eliens.cas.springdatarestdemo.repository

import co.eliens.cas.springdatarestdemo.model.WorkTime
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path = "time", collectionResourceRel = "times")
interface WorkTimeRepository: PagingAndSortingRepository<WorkTime, Long>