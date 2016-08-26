package com.example.domain.user.repositories;

import com.example.core.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by galih.a.pradana on 7/30/2016.
 */
public interface ProfileRepository extends JpaRepository<Profile, Integer> {

    Profile findByUserId(int userId);
}
