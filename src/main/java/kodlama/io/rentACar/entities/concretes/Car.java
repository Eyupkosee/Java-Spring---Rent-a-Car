package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="cars")
@Data // bizim için getter setter ayarlıyor otomatikmen (Lombok)(@Data yerine sadece @Getter yazsa idim sadece getter ları yazardı)
@AllArgsConstructor // Bizim için dolu bir constructer ayarladı Brand(int,String olan kısmı) (Lombok)
@NoArgsConstructor // parametresiz constrecter oluşturdu (Lombok)
@Entity // sen bir veri tabanı varlığısın demek bu ve brands adında table a bağlısın demiş olduk
public class Car {
	@Id // VEritabnında id oludğunu haber veriyoruz
	@GeneratedValue(strategy = GenerationType.IDENTITY) //veritabınında id si otomatik artması için yaptık
	@Column(name="id")
	private int id;
	
	@Column(name="plate")
	private String plate;
	
	@Column(name="dailyPrice")
	private double dailyPrice;
	
	@Column(name="modelYear")
	private int modelYear;
	
	@Column(name="state")
	private int state; //1- available, 2- rented vs vs
	
	@ManyToOne
	@JoinColumn(name="model_id")
	private Model model;
	
}
