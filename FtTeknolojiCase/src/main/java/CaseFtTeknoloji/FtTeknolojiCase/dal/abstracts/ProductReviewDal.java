package CaseFtTeknoloji.FtTeknolojiCase.dal.abstracts;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import CaseFtTeknoloji.FtTeknolojiCase.entities.concretes.ProductReview;
import CaseFtTeknoloji.FtTeknolojiCase.entities.dtos.ProductReviewDto;

public interface ProductReviewDal extends JpaRepository<ProductReview, Integer> {

	@Query("Select new CaseFtTeknoloji.FtTeknolojiCase.entities.dtos.ProductReviewDto"
			+ " (p.productName,  u.firstName, u.lastName, pc.productReview, pc.postingDate)"
			+ " From ProductReview pc Inner Join pc.product p Inner Join pc.user u"
			+ " where pc.product.id =:productId")
	List<ProductReviewDto> getProductId(int productId);

	@Query("Select new CaseFtTeknoloji.FtTeknolojiCase.entities.dtos.ProductReviewDto"
			+ " (p.productName,  u.firstName, u.lastName, pc.productReview, pc.postingDate)"
			+ " From ProductReview pc Inner Join pc.product p Inner Join pc.user u"
			+ " where pc.product.id =:productId and pc.postingDate >= :startDate and pc.postingDate <= :endDate")
	List<ProductReviewDto> getProductIdDateBetween(int productId, @Param("startDate") Date startDate,
			@Param("endDate") Date endDate);

	@Query("Select new CaseFtTeknoloji.FtTeknolojiCase.entities.dtos.ProductReviewDto"
			+ " (p.productName,  u.firstName, u.lastName, pc.productReview, pc.postingDate)"
			+ " From ProductReview pc Inner Join pc.product p Inner Join pc.user u" + " where pc.user.id =:userId")
	List<ProductReviewDto> getUserId(int userId);

	@Query("Select new CaseFtTeknoloji.FtTeknolojiCase.entities.dtos.ProductReviewDto"
			+ " (p.productName,  u.firstName, u.lastName, pc.productReview, pc.postingDate)"
			+ " From ProductReview pc Inner Join pc.product p Inner Join pc.user u"
			+ " where pc.user.id =:userId and pc.postingDate >= :startDate and pc.postingDate <= :endDate")
	List<ProductReviewDto> getUserIdDateBetween(int userId, @Param("startDate") Date startDate,
			@Param("endDate") Date endDate);

}
