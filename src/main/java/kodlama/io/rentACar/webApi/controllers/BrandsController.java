package kodlama.io.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.requests.CreateBrandRequest;
import kodlama.io.rentACar.business.requests.DeleteBrandRequest;
import kodlama.io.rentACar.business.requests.UpdateBrandRequest;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.business.responses.GetByIdBrandResponse;

@RestController //annotation
@RequestMapping("/api/brands") 
public class BrandsController {
	
	private BrandService brandService;

	@Autowired
	public BrandsController(BrandService brandService) {
		super();
		this.brandService = brandService;
	}

	@GetMapping("/getall")
	 public List<GetAllBrandsResponse> getAll(){
		 
		 return brandService.getAll();
	 }
	
	@GetMapping("/{id}")
	 public GetByIdBrandResponse getById(@PathVariable int id){
		 
		 return brandService.getBynId(id);
	 }
	
	
	@PostMapping("/add")
	@ResponseStatus(code=HttpStatus.CREATED)
	public void add(CreateBrandRequest createBrandRequest) {
		this.brandService.add(createBrandRequest);
	}
	
	@DeleteMapping("/delete")
	public void delete(DeleteBrandRequest deleteBrandRequest) {
		this.brandService.delete(deleteBrandRequest);
	}
	
	@PutMapping("/update")
	public void update(UpdateBrandRequest updateBrandRequest) {
		this.brandService.update(updateBrandRequest);
	}
	
}
