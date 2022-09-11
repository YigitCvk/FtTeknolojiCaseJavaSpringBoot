package CaseFtTeknoloji.FtTeknolojiCase.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProductReviewDto {

	private String productName;
	private String userFirstName;
	private String userLastName;
	private String productReview;
	private Date postingDate;

	public ProductReviewDto(String productName, String userFirstName, String userLastName, String productReview,
			Date postingDate) {
		super();
		this.productName = productName;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.productReview = productReview;
		this.postingDate = postingDate;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getProductReview() {
		return productReview;
	}

	public void setProductReview(String productReview) {
		this.productReview = productReview;
	}

	public Date getPostingDate() {
		return postingDate;
	}

	public void setPostingDate(Date postingDate) {
		this.postingDate = postingDate;
	}

}
