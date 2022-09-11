package CaseFtTeknoloji.FtTeknolojiCase.api.controller;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import CaseFtTeknoloji.FtTeknolojiCase.business.abstracts.ProductReviewService;
import CaseFtTeknoloji.FtTeknolojiCase.core.utilities.results.DataResult;
import CaseFtTeknoloji.FtTeknolojiCase.core.utilities.results.Result;
import CaseFtTeknoloji.FtTeknolojiCase.entities.concretes.ProductReview;
import CaseFtTeknoloji.FtTeknolojiCase.entities.dtos.ProductReviewDto;

@RestController
@RequestMapping("/api/productComment/")
public class ProductReviewsController {

	private ProductReviewService productReviewService;

	@GetMapping("getByProduct")
	public DataResult<List<ProductReviewDto>> getProductId(@RequestParam int productId) {
		return this.productReviewService.getProductId(productId);
	}

	@GetMapping("getProductIdDateBetween")
	public DataResult<List<ProductReviewDto>> getProductIdDateBetween(@RequestParam int productId,
			@RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate,
			@RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate) {
		return this.productReviewService.getProductIdDateBetween(productId, startDate, endDate);
	}

	@GetMapping("getByUserId")
	public DataResult<List<ProductReviewDto>> getByUserId(@RequestParam int userId) {
		return this.productReviewService.getUserId(userId);
	}

	@GetMapping("getUserIdDateBetween")
	public DataResult<List<ProductReviewDto>> getUserIdDateBetween(@RequestParam int userId,
			@RequestParam("startDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date startDate,
			@RequestParam("endDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date endDate) {
		return this.productReviewService.getUserIdDateBetween(userId, startDate, endDate);
	}

	@PostMapping("/add")
	public Result add(@RequestBody ProductReview productReview) {
		return this.productReviewService.add(productReview);
	}
}
