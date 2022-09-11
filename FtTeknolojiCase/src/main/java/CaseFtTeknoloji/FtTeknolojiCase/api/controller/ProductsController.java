package CaseFtTeknoloji.FtTeknolojiCase.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CaseFtTeknoloji.FtTeknolojiCase.business.abstracts.ProductService;
import CaseFtTeknoloji.FtTeknolojiCase.core.utilities.results.DataResult;
import CaseFtTeknoloji.FtTeknolojiCase.core.utilities.results.Result;
import CaseFtTeknoloji.FtTeknolojiCase.entities.concretes.Product;
import CaseFtTeknoloji.FtTeknolojiCase.entities.dtos.ProductDto;

@RestController
@RequestMapping("/api/product/")
public class ProductsController {

	private ProductService productService;

	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("getOverExpireDateProduct")
	public DataResult<List<ProductDto>> getOverExpireDateProduct() {
		return this.productService.getOverExpireDateProduct();
	}

	@GetMapping("getDoesntOverExpireDateProduct")
	public DataResult<List<ProductDto>> getDoesntOverExpireDateProduct() {
		return this.productService.getDoesntOverExpireDateProduct();
	}

	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
	}
}
