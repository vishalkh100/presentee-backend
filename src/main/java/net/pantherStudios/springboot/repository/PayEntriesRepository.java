package net.pantherStudios.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.pantherStudios.springboot.model.PayEntries;

@Repository
public interface PayEntriesRepository extends JpaRepository<PayEntries, Long>{

}