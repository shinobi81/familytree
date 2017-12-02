package net.kamigun.familytree.resolver

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import net.kamigun.familytree.dao.PersonDao
import org.springframework.stereotype.Component

@Component
class PersonMutationResolver(private val personDao: PersonDao) : GraphQLMutationResolver {
    fun createPerson(name: String) = personDao.createPerson(name)
}