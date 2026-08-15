package ir.arcademy.mamoot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/mamoot/")
public class mamootcontroller {

    @Autowired
    private PropertyService propertyService;


    @GetMapping("/hellow")
    public String sayhellow()
    {
        return "hellow";
    }

    @PostMapping("/properties")
    public PropertyDto saveproperty(@RequestBody PropertyDto propertyDto)
    {
        propertyService.saveProperty(propertyDto);
        System.out.println(propertyDto);
        return propertyDto;
    }

    @GetMapping("/properties")
    public ResponseEntity<List<PropertyDto>> getAllproperties(){

        List<PropertyDto> propertyList= propertyService.getAllproperties();
        ResponseEntity<List<PropertyDto>> responseEntity = new ResponseEntity<>(propertyList , HttpStatus.OK);
        return responseEntity;
    }
    @GetMapping("/properties/users/{userid}")
    public ResponseEntity<List<PropertyDto>> getAllpropertiesForusers(@PathVariable("userid") Long userid){

        List<PropertyDto> propertyList= propertyService.getAllproperties();
        ResponseEntity<List<PropertyDto>> responseEntity = new ResponseEntity<>(propertyList , HttpStatus.OK);
        return responseEntity;
    }

    @PutMapping("/properties/{id}")
    public ResponseEntity<PropertyDto> updateproperty(@RequestBody PropertyDto propertyDto , @PathVariable UUID id){
        propertyDto = propertyService.updateProperty(propertyDto , id);

        ResponseEntity<PropertyDto> responseEntity = new ResponseEntity<>(propertyDto , HttpStatus.CREATED);
        return responseEntity;
    }
    @DeleteMapping("/properties/{id}")
    public void deleteproperty(@PathVariable UUID id)
    {
        propertyService.deleteprpperty(id);
        ResponseEntity<Void> responseEntity = new ResponseEntity<Void>((Void) null, HttpStatus.NO_CONTENT);

    }
}




