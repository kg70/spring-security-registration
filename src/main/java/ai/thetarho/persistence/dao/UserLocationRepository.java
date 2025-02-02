package ai.thetarho.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ai.thetarho.persistence.model.User;
import ai.thetarho.persistence.model.UserLocation;

public interface UserLocationRepository extends JpaRepository<UserLocation, Long> {
    UserLocation findByCountryAndUser(String country, User user);

}
