package com.backend.terminplanungsassitent.databaseClasses;


import org.springframework.data.jpa.repository.JpaRepository;

public interface BesuchenRepository extends JpaRepository<Besuchen, BesuchenId> {
}
