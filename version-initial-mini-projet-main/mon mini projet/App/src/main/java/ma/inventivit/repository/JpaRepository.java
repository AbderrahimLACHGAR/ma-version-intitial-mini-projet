package ma.inventivit.repository;

import ma.inventivit.entities.Case;

public interface JpaRepository<T, T1> {
    Case save(Case dossier);

    void deleteById(Long id);

    Iterable<Case> findAll();
}
