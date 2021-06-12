package com.springrest.springrest.Services;

import com.springrest.springrest.dao.LoadDao;
import com.springrest.springrest.entities.Course;

import java.util.List;
import java.util.Optional;

//import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.springrest.springrest.entities.Course;

@Service
public class LoadServiceImpl implements LoadService {
	
@Autowired	
private LoadDao loadDao;
	
	//List<Course> list;
	
	//public LoadServiceImpl() {
		
		//list=new ArrayList<>();
		//list.add(new Course("delhi", "jaipur","chemicals", "canter", 1, 100, "shipper:<UUID>", "25/6/2021"));
		
	//}
	
	

	@Override
	public List<Course> getCourses() {
		return loadDao.findAll();
	}



	
	
	@Override
	public Course getLoad(String LoadId){
		return loadDao.getById(LoadId);
		
	 }



	@Override
	public Course addLoad(Course load) {
		
		//list.add(load);
		loadDao.save(load);
		return load;
	}



	//@SuppressWarnings("null")
/*	@Override
	public  Course updateLoad(Course load) {
		/*    list.forEach(e ->{
			if(e.getWeight()==LoadId) {
			e.setLoadingPoint(load.getLoadingPoint());
			e.setUnloadingPoint(load.getUnloadingPoint());
			e.setProductType(load.getProductType());
			e.setTruckType(load.getTruckType());
			e.setNoOfTrucks(load.getNoOfTrucks());
			e.setShipperId(load.getShipperId());
			e.setDate(load.getDate());
			}
			
		});
		   // return load;
		loadDao.save(load);
		return load;
	}  */
			
			
		
	//}
	//@Override
	public void updateLoad(String LoadId,Course load) {
		Optional<Course> loadid= loadDao.findById(LoadId);
		
		if(loadid.isPresent()) {
			Course _load= loadid.get();
			_load.setComment(load.getComment());
			_load.setDate(load.getDate());
			_load.setLoadingPoint(load.getLoadingPoint());
			_load.setNoOfTrucks(load.getNoOfTrucks());
			_load.setProductType(load.getProductType());
			_load.setShipperId(load.getShipperId());
			_load.setUnloadingPoint(load.getUnloadingPoint());
			_load.setWeight(load.getWeight());
		     loadDao.save(_load);
			
		}
		
	}
	
	


     @Override
	public void deleteLoad(String LoadId) {
//		list=this.list.stream().filter(e->e.getWeight()!=parseLong).collect(Collectors.toList());
		Course entity=loadDao.getById(LoadId);
		loadDao.delete(entity);
	}




	



	


	
}
