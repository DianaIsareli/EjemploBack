package mx.atto.ejemplo.service;

import java.util.List;

import mx.atto.ejemplo.dto.ContactoDto;
import mx.atto.ejemplo.exception.SitteecException;

public interface IContactoService {

    public List<ContactoDto> findAll() throws SitteecException;

    public ContactoDto guardarContacto(ContactoDto dto) throws SitteecException;

    public boolean actualizarContacto(ContactoDto dto) throws SitteecException;

    public boolean eliminarContacto(ContactoDto dto) throws SitteecException;

    public CategoriaDto getContacto(Integer id) throws SitteecException;
    
}
