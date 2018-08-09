package io.rediron.roadtoglory;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "leagues", path = "leagues")
public interface LeagueRepository extends MongoRepository<League, String> {

    List<League> findByName(@Param("name") String name);

}
