package mx.atto.ejemplo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.atto.ejemplo.dto.TerceroDto;
import mx.atto.ejemplo.exception.SitteecException;
import mx.atto.ejemplo.service.ITerceroService;

@RestController
@RequestMapping("/tercero")
public class TerceroController {

    @Autowired
    private ITerceroService terceroService;

    @RequestMapping(
        value = "/guardar",
        method = RequestMethod.POST,
        consumes = {MediaType.APPLICATION_JSON_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public TerceroDto guardar(@RequestBody TerceroDto dto) throws SitteecException{
        return terceroService.guardarTercero(dto);
    }

    @RequestMapping(
        value = "/actualizar/{id}",
        method = RequestMethod.PUT,
        consumes = {MediaType.APPLICATION_JSON_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public TerceroDto actualizar(@RequestBody TerceroDto dto, @PathVariable Integer id){

        return null;
    }
    @RequestMapping(
        value = "/eliminar/{id}",
        method = RequestMethod.PUT,
        consumes = {MediaType.APPLICATION_JSON_VALUE},
        produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public CategoriaDto eliminar(@RequestBody CategoriaDto dto, @PathVariable Integer id){

        return null;
    }
}

