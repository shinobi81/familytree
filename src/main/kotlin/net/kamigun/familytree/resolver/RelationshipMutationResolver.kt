package net.kamigun.familytree.resolver

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import net.kamigun.familytree.dao.RelationshipDao
import org.springframework.stereotype.Component

@Component
class RelationshipMutationResolver(private val relationshipDao: RelationshipDao) : GraphQLMutationResolver {
    fun createRelationship(from: String, to: String, type: String) =
            relationshipDao.addRelationship(fromId = from, toId = to, type = type)
}