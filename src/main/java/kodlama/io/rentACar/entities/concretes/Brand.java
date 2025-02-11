package kodlama.io.rentACar.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="brands")
@Data // bizim için getter setter ayarlıyor otomatikmen (Lombok)(@Data yerine sadece @Getter yazsa idim sadece getter ları yazardı)
@AllArgsConstructor // Bizim için dolu bir constructer ayarladı Brand(int,String olan kısmı) (Lombok)
@NoArgsConstructor // parametresiz constrecter oluşturdu (Lombok)
@Entity // sen bir veri tabanı varlığısın demek bu ve brands adında table a bağlısın demiş olduk
public class Brand {
	@Id // VEritabnında id oludğunu haber veriyoruz
	@GeneratedValue(strategy = GenerationType.IDENTITY) //veritabınında id si otomatik artması için yaptık
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@OneToMany(mappedBy = "brand")
	private List<Model> models;

}

