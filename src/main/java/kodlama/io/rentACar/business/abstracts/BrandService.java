package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.DeleteBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;

public interface BrandService {
	
	List<GetAllBrandsResponse> getAll();
	
	GetByIdBrandResponse getBynId(int id);
	
	void add(CreateBrandRequest createBrandRequest);
	
	void update(UpdateBrandRequest updateBrandRequest);
	
	void delete(DeleteBrandRequest deleteBrandRequest);
}
