package com.eventario.type;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class TypeServices {

    private final TypeRepository typeRepository;

    public TypeServices(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    // find type by id
    TypeModel showTypeById(long id) {
        Optional<TypeModel> typeModel = typeRepository.findById(id);
        return typeModel.orElse(null);
    }

    // create types
    TypeModel createType(TypeModel typeModel) {
        return typeRepository.save(typeModel);
    }

    // list all types
    List<TypeModel> listAllTypes() {
        return typeRepository.findAll();
    }

    // delete types
    void deleteType(long id) {
        typeRepository.deleteById(id);
    }

    // update types
    TypeModel updateType(long id, TypeModel typeModel){
             return typeRepository.save(typeModel);
         }
     }
