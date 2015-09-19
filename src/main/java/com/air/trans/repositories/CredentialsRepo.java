package com.air.trans.repositories;

import com.air.trans.model.Credentials;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Andrii on 20.09.2015.
 */
@Repository
public interface CredentialsRepo extends CrudRepository<Credentials, Long> {
    Credentials findByName(String name);
}
