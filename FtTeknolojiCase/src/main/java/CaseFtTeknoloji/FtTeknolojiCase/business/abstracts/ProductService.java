package CaseFtTeknoloji.FtTeknolojiCase.business.abstracts;

import java.util.List;

import CaseFtTeknoloji.FtTeknolojiCase.core.utilities.results.DataResult;
import CaseFtTeknoloji.FtTeknolojiCase.core.utilities.results.Result;
import CaseFtTeknoloji.FtTeknolojiCase.entities.concretes.Product;
import CaseFtTeknoloji.FtTeknolojiCase.entities.dtos.ProductDto;

public interface ProductService {

	DataResult<List<ProductDto>> getOverExpireDateProduct();

	DataResult<List<ProductDto>> getDoesntOverExpireDateProduct();

	Result add(Product product);

}