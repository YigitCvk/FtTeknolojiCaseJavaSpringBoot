package CaseFtTeknoloji.FtTeknolojiCase.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import CaseFtTeknoloji.FtTeknolojiCase.business.abstracts.ProductService;
import CaseFtTeknoloji.FtTeknolojiCase.core.utilities.results.DataResult;
import CaseFtTeknoloji.FtTeknolojiCase.core.utilities.results.Result;
import CaseFtTeknoloji.FtTeknolojiCase.core.utilities.results.SuccessDataResult;
import CaseFtTeknoloji.FtTeknolojiCase.core.utilities.results.SuccessResult;
import CaseFtTeknoloji.FtTeknolojiCase.dal.abstracts.ProductDal;
import CaseFtTeknoloji.FtTeknolojiCase.entities.concretes.Product;
import CaseFtTeknoloji.FtTeknolojiCase.entities.dtos.ProductDto;

@Service
public class ProductManager implements ProductService {

	private ProductDal productDal;

	public ProductManager(ProductDal productDal) {
		super();
		this.productDal = productDal;
	}

	@Override
	public DataResult<List<ProductDto>> getOverExpireDateProduct() {

		LocalDate now = LocalDate.now();

		return new SuccessDataResult<List<ProductDto>>(
				this.productDal.getOverExpireDateProduct(java.sql.Date.valueOf(now)),
				"Product which is expiry date is over are listed.");
	}

	@Override
	public DataResult<List<ProductDto>> getDoesntOverExpireDateProduct() {

		LocalDate now = LocalDate.now();

		return new SuccessDataResult<List<ProductDto>>(
				this.productDal.getDoesntOverExpireDateProduct(java.sql.Date.valueOf(now)),
				"Product which is expiry date is not over are listed.");
	}

	@Override
	public Result add(Product product) {
		this.productDal.save(product);
		return new SuccessResult("Product Added");
	}

}
