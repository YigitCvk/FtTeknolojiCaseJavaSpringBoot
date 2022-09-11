package CaseFtTeknoloji.FtTeknolojiCase.business.concretes;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import CaseFtTeknoloji.FtTeknolojiCase.business.abstracts.ProductReviewService;
import CaseFtTeknoloji.FtTeknolojiCase.core.utilities.results.DataResult;
import CaseFtTeknoloji.FtTeknolojiCase.core.utilities.results.Result;
import CaseFtTeknoloji.FtTeknolojiCase.core.utilities.results.SuccessDataResult;
import CaseFtTeknoloji.FtTeknolojiCase.core.utilities.results.SuccessResult;
import CaseFtTeknoloji.FtTeknolojiCase.dal.abstracts.ProductReviewDal;
import CaseFtTeknoloji.FtTeknolojiCase.entities.concretes.ProductReview;
import CaseFtTeknoloji.FtTeknolojiCase.entities.dtos.ProductReviewDto;

@Service
public class ProductReviewManager implements ProductReviewService {

	private ProductReviewDal productReviewDal;

	public ProductReviewManager(ProductReviewDal productReviewDal) {
		super();
		this.productReviewDal = productReviewDal;
	}

	@Override
	public DataResult<List<ProductReviewDto>> getProductId(int productId) {

		return new SuccessDataResult<List<ProductReviewDto>>(this.productReviewDal.getProductId(productId),
				"Comment of the product are listed.");
	}

	@Override
	public DataResult<List<ProductReviewDto>> getUserId(int userId) {
		return new SuccessDataResult<List<ProductReviewDto>>(this.productReviewDal.getUserId(userId),
				"Comment of the product are listed.");
	}

	@Override
	public DataResult<List<ProductReviewDto>> getProductIdDateBetween(int productId, Date startDate, Date endDate) {

		return new SuccessDataResult<List<ProductReviewDto>>(
				this.productReviewDal.getProductIdDateBetween(productId, startDate, endDate),
				"The products in the desired date range are listed.");
	}

	@Override
	public DataResult<List<ProductReviewDto>> getUserIdDateBetween(int userId, Date startDate, Date endDate) {
		return new SuccessDataResult<List<ProductReviewDto>>(
				this.productReviewDal.getUserIdDateBetween(userId, startDate, endDate), "User's comments are listed.");

	}

	@Override
	public Result add(ProductReview productReview) {
		this.productReviewDal.save(productReview);
		return new SuccessResult("Product Review Added");
	}

}
