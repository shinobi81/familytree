package net.kamigun.familytree.resolver

import com.coxautodev.graphql.tools.GraphQLResolver
import net.kamigun.familytree.dao.RelationshipDao
import net.kamigun.familytree.dto.Person
import org.springframework.stereotype.Component

@Component
class PersonResolver(private val relationshipDao: RelationshipDao) : GraphQLResolver<Person> {
    fun relationships(person: Person, type: String?) =
            when(type) {
                null -> relationshipDao.getRelationshipsFromPerson(person.id)
                else -> relationshipDao.getRelationshipsOfTypeFromPerson(person.id, type)
            }
}
