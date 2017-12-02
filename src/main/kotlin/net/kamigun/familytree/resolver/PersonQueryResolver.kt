package net.kamigun.familytree.resolver

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import net.kamigun.familytree.dao.PersonDao
import org.springframework.stereotype.Component

@Component
class PersonQueryResolver(private val personDao : PersonDao) : GraphQLQueryResolver {
    fun getPersonById(id : String) = personDao.getPersonById(id)
}