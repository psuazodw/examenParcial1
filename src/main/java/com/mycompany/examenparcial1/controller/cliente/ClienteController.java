/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenparcial1.controller.cliente;

import com.mycompany.examenparcial1.model.Cliente;
import com.mycompany.examenparcial1.service.ClienteService;
import javax.annotation.Resource;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author pablo.suazo1
 */
@Controller
public class ClienteController {
    
    @Resource
    private ClienteService clienteService;
    
    /**
     *
     * @param model
     * @return
     */
    @GetMapping("/cliente")
    public String get(Model model) {
        
        System.out.println("Estoy en el metodo GET");
        model.addAttribute("cliente", new Cliente());
        return "cliente/crear-cliente";
        
    }
    
    @GetMapping("/cliente/codCliente/{codCliente}")
    public String getByCodigo(Model model, @PathVariable("codCliente") Long codCliente) {
        
        Cliente cliente = ClienteService.buscarCliente(codCliente);
        model.addAttribute("cliente", cliente);
        return "cliente/editar-cliente";
        
    }
    
    @GetMapping("/cliente/eliminar/{codigoCliente}")
    public String delete(Model model, @PathVariable("codCliente") Long codCliente){
        
        Cliente cliente = clienteService.buscarCliente(codCliente);       
        boolean eliminar = clienteService.eliminarCliente(cliente);        
        if(eliminar == true){
            model.addAttribute("mensaje", "Cliente eliminado");
        }else{
            model.addAttribute("mensaje", "No se elimino el cliente...");
        }
        return "cliente/eliminar-cliente";
        
    }
    
    @PostMapping("/cliente/crear")
    public String create(Model model, @ModelAttribute("cliente") Cliente cliente) {

        boolean agregado = ClienteService.agregarCliente(cliente);

        if (agregado) {
            model.addAttribute("cliente", new Cliente());
            model.addAttribute("mensaje", "Cliente agregado satisfactoriamente");
        } else {
            model.addAttribute("mensaje", "¡¡Cliente ya existe!!");
        }
        return "cliente/crear-cliente";
        
    }
    
    @PostMapping("/cliente/editar")
    public String edit(Model model, @ModelAttribute("cliente") Cliente cliente) {

        boolean editClient = clienteService.editar(cliente);
        
        if(editClient == true){
            model.addAttribute("mensaje", "Cliente editado");
        }else{
            model.addAttribute("mensaje", "No se pudo editar...");
        }        
        return "cliente/editar-cliente";
    }
    
}
