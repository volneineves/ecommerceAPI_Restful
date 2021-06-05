package com.residencia.ecommerce.services;


import com.residencia.ecommerce.entities.Pedido;
import com.residencia.ecommerce.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {


    @Autowired
    public PedidoRepository pedidoRepository;
//******************************************************************************************************************

    public Pedido findById (Integer id){
        Pedido pedido = pedidoRepository.findById(id).get();
        return pedido;
    }
//******************************************************************************************************************

    public List<Pedido> findAll(Integer id){
        return pedidoRepository.findAll();
    }

//******************************************************************************************************************


    public long count() {
        return pedidoRepository.count();
    }

//******************************************************************************************************************

    public Pedido save (Pedido pedido){
        Pedido novoPedido = pedidoRepository.save(pedido);
        if(novoPedido.getPedidoId()!=null){
            return novoPedido;
        }
        else{ return null; }

    }
//********************************************************************************************************************

    public Pedido update(Pedido pedido ){

        return pedidoRepository.save(pedido);
    }



//********************************************************************************************************************

    public boolean delete(Integer id) {
        if (id != null) {
            pedidoRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }


}