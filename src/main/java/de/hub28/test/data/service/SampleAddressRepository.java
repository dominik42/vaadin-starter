package de.hub28.test.data.service;

import de.hub28.test.data.entity.SampleAddress;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleAddressRepository extends JpaRepository<SampleAddress, UUID> {

}