import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="passport_tbl")
public class Passport
{
		@Id
		@GeneratedValue
		@Column(name="passport_no")
		private int passportNo;

		@Column(name="issued_by", length=20)
		private String issuedBy;

		@Column(name="issued_date")
		private LocalDate issuedDate;

		@Column(name="expiry_date")
		private LocalDate expiryDate;

		public int getPassportNo() {
			return passportNo;
		}

		public void setPassportNo(int passportNo) {
			this.passportNo = passportNo;
		}

		public String getIssuedBy() {
			return issuedBy;
		}

		public void setIssuedBy(String issuedBy) {
			this.issuedBy = issuedBy;
		}

		public LocalDate getIssuedDate() {
			return issuedDate;
		}

		public void setIssuedDate(LocalDate issuedDate) {
			this.issuedDate = issuedDate;
		}

		public LocalDate getExpiryDate() {
			return expiryDate;
		}

		public void setExpiryDate(LocalDate expiryDate) {
			this.expiryDate = expiryDate;
		}

		
}
