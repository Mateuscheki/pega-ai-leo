package br.unialfa.compra_venda.repository;

import br.unialfa.compra_venda.model.ItemVenda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemVendaRepository extends JpaRepository<ItemVenda, Long> {
}
