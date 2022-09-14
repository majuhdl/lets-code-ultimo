package br.com.bb.compra.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import br.com.bb.compra.model.entity.ClienteEntity;
import br.com.bb.compra.model.entity.ItemPedido;
import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class PedidoEntity extends PanacheEntity{

    @ManyToOne
    private ClienteEntity cliente;
    
    @OneToMany(mappedBy = "pedido, cascade = Casc")
    Set<ItemPedido> items;

    public void setItens(HashSet hashSet) {
    }

    public void setCliente(ClienteEntity cliente2) {
    }
}
