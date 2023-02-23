package ma.inventivit.repository;

import ma.inventivit.entities.Case;

import java.util.Optional;


public abstract class RepositoryCases implements JpaRepository<Case, Long> {

    public abstract Optional<Case> findById(Long id);

    public Case save(Case dossier) {
        return null;
    }

    public void deleteById(Long id) {

    }

    public Iterable<Case> findAll() {
        return null;
    }
}
