package org.pagsousa.ecafeteriaxxi.orgstructuremanagement.domain.repositories;

import java.util.Optional;

import org.pagsousa.ecafeteriaxxi.orgstructuremanagement.domain.model.Cafeteria;
import org.pagsousa.ecafeteriaxxi.orgstructuremanagement.domain.model.OrganicUnit;

import eapli.framework.general.domain.model.Designation;

/**
 * @author Paulo Gandra Sousa
 *
 */
public interface CafeteriaRepository {

	/**
	 *
	 * @param cafeName
	 * @param ou
	 * @return
	 */
	Optional<Cafeteria> findByName(Designation cafeName, OrganicUnit ou);

	/**
	 *
	 * @param cafe
	 * @return
	 */
	Cafeteria save(Cafeteria cafe);

	/**
	 * Returns the cafeterias of an organic unit.
	 *
	 * @param ou
	 * @return the cafeterias of an organic unit
	 */
	Iterable<Cafeteria> findByOrganicUnit(OrganicUnit ou);
}
