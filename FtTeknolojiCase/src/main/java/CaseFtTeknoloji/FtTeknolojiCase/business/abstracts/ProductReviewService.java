package CaseFtTeknoloji.FtTeknolojiCase.business.abstracts;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.query.Param;

import CaseFtTeknoloji.FtTeknolojiCase.core.utilities.results.DataResult;
import CaseFtTeknoloji.FtTeknolojiCase.core.utilities.results.Result;
import CaseFtTeknoloji.FtTeknolojiCase.entities.concretes.ProductReview;
import CaseFtTeknoloji.FtTeknolojiCase.entities.dtos.ProductReviewDto;

public interface ProductReviewService {
	DataResult<List<ProductReviewDto>> getProductId(int productId);

	DataResult<List<ProductReviewDto>> getProductIdDateBetween(int productId, @Param("startDate") Date startDate,
			@Param("endDate") Date endDate);

	DataResult<List<ProductReviewDto>> getUserId(int userId);

	DataResult<List<ProductReviewDto>> getUserIdDateBetween(int userId, @Param("startDate") Date startDate,
			@Param("endDate") Date endDate);

	Result add(ProductReview productReview);
}
