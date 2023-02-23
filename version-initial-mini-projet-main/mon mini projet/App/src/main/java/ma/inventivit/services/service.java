package ma.inventivit.services;

import ma.inventivit.entities.Case;
import ma.inventivit.repository.Autowired;
import ma.inventivit.repository.RepositoryCases;
import ma.inventivit.repository.Service;


import java.util.Optional;

@Service
class CaseService {

    Case dossier;
    @Autowired
    private RepositoryCases repositoryCases;

    public Case create(Case dossier) {
        return repositoryCases.save(dossier);
    }

    public void remove(Long id){
        repositoryCases.deleteById(id);
    }

    public Iterable<Case> findAll(){
        return repositoryCases.findAll();
    }

    public Optional<Case> findById(Long id) {

        return repositoryCases.findById(id);
    }
}
