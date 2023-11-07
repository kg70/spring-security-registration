package ai.thetarho.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ai.thetarho.persistence.model.NewLocationToken;
import ai.thetarho.persistence.model.UserLocation;

public interface NewLocationTokenRepository extends JpaRepository<NewLocationToken, Long> {

    NewLocationToken findByToken(String token);

    NewLocationToken findByUserLocation(UserLocation userLocation);

}
