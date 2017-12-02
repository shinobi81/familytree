package net.kamigun.familytree.resolver

import com.coxautodev.graphql.tools.GraphQLResolver
import net.kamigun.familytree.dao.PersonDao
import net.kamigun.familytree.dto.Relationship
import org.springframework.stereotype.Component

@Component
class RelationshipResolver(private val personDao: PersonDao) : GraphQLResolver<Relationship> {
    fun getFrom(relationship: Relationship) = personDao.getPersonById(relationship.from)
    fun getTo(relationship: Relationship) = personDao.getPersonById(relationship.to)
}