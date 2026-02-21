package com.eventario.type;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/types")
public class TypeController {
   private final TypeServices typeServices;



    public TypeController(TypeServices typeServices) {
        this.typeServices = typeServices;
    }


    //get all types
    @GetMapping("/show")
    public List<TypeModel> getAllTypes(){
        return typeServices.listAllTypes();
    }
    //get type by id
   @GetMapping("/show/{id}")
   TypeModel getAllTypes(@PathVariable Long id){
       return  typeServices.showTypeById(id);

   }
    //delete type
    @DeleteMapping("/delete/{id}")
    void deleteType(@PathVariable Long id){
        typeServices.deleteType(id);
    }

    //update type
    @PutMapping("/update/{id}")
    TypeModel updateType(@PathVariable Long id,@RequestBody TypeModel typeModel){
        return typeServices.updateType(id,typeModel);
    }
    //create type
    @PostMapping("/create")
    TypeModel createType(@RequestBody TypeModel typeModel){
        return typeServices.createType(typeModel);
    }




}
