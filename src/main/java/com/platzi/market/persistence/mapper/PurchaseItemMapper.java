package com.platzi.market.persistence.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.platzi.market.domain.PurchaseItem;
import com.platzi.market.persistence.entity.ComprasProducto;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {

	@Mappings({
		@Mapping(source = "id.idProducto", target = "productId"),
		@Mapping(source = "cantidad", target = "quantity"),
		@Mapping(source = "estado", target = "active")
	})
	public PurchaseItem toPurchaseItem(ComprasProducto producto);
	
	@InheritInverseConfiguration
	@Mappings({
		@Mapping(target = "id.idCompra", ignore = true),
		@Mapping(target = "compra", ignore = true),
		@Mapping(target = "producto", ignore = true)
	})
	public ComprasProducto toComprasProducto(PurchaseItem item); 
	
}
