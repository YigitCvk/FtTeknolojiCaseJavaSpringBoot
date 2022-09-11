package CaseFtTeknoloji.FtTeknolojiCase.dal.abstracts;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import CaseFtTeknoloji.FtTeknolojiCase.entities.concretes.Product;
import CaseFtTeknoloji.FtTeknolojiCase.entities.dtos.ProductDto;

public interface ProductDal extends JpaRepository<Product, Integer> {

	@Query("Select new CaseFtTeknoloji.FtTeknolojiCase.entities.dtos.ProductDto"
			+ " (p.productName, p.expireDate, p.unitPrice)" + " From Product p" + " where p.expireDate <= :now")
	List<ProductDto> getOverExpireDateProduct(@Param("now") Date now);

	@Query("Select CaseFtTeknoloji.FtTeknolojiCase.entities.dtos.ProductDto"
			+ " (p.productName, p.expireDate, p.unitPrice)" + " From Product p"
			+ " where p.expireDate >= :now or p.expireDate = null")
	List<ProductDto> getDoesntOverExpireDateProduct(@Param("now") Date now);

}
