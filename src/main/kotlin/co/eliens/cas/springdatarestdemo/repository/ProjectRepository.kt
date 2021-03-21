package co.eliens.cas.springdatarestdemo.repository

import co.eliens.cas.springdatarestdemo.model.Project
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(path = "projects", collectionResourceRel = "projects")
interface ProjectRepository: PagingAndSortingRepository<Project, Long>