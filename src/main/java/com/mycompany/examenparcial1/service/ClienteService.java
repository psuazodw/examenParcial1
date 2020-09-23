/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examenparcial1.service;

import com.mycompany.examenparcial1.model.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author pablo.suazo1
 */
public class ClienteService {
    
    public static List<Cliente> clienteList = new ArrayList();
    
    public static boolean agregarCliente(Cliente cliente) {
        
        //boolean existe = clienteList.stream().anyMatch(p -> p.equals(cliente));
        boolean existe = false;
        for (int i = 0; i < clienteList.size(); i++){
            if(Objects.equals(clienteList.get(i).getCodCliente(), cliente.getCodCliente())){
                existe = true;
            }
        }

        if (!existe) {
            clienteList.add(cliente);
        }

        return existe;

    }
   
    public static Cliente buscarCliente(Long codCliente) {
        
        for (Cliente client : clienteList){
            if (client.getCodCliente().equals(codCliente)){                
                return client;
            }
        }
        return null;
        
        /*return clienteList.stream()
                .filter(p -> p.getCodigo().equalsIgnoreCase(codCliente))
                .findFirst()
                .orElse(null);*/
    }
   
    public boolean eliminarCliente(Cliente cliente){
        
        for (int i = 0; i < clienteList.size(); i++){
            if (clienteList.get(i).getCodCliente().equals(cliente.getCodCliente())){
                clienteList.get(i).setActivo(false);
                return true;
            }
        }
        return false;
    }
    
    public boolean editar(Cliente cliente){
            
        for(int i = 0; i < clienteList.size(); i++){
            if(clienteList.get(i).getCodCliente().equals(cliente.getCodCliente())){
                clienteList.get(i).setNombre(cliente.getNombre());
                clienteList.get(i).setDireccion(cliente.getDireccion());
                clienteList.get(i).setNit(cliente.getNit());
                return true;
            }else{
                continue;
            }
        }
        return false;
        
    }
}
