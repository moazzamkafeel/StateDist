package mk.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mk.app.entity.DistBean;
import mk.app.entity.StateBean;
import mk.app.reposiitory.DistrictRepository;
import mk.app.reposiitory.StateRepostory;
@Service
public class ServiceImpl implements ServiceInter{
@Autowired
	StateRepostory  stateRepostory ;
@Autowired
DistrictRepository districtRepository;
	@Override
	public List<StateBean> getState() {
		
		
		return stateRepostory.findAll();
	}

	@Override
	public List<DistBean> getDistrict(String stCode) {
		
		return districtRepository.getDistBeanListByStCode(stCode);
	}

	@Override
	public List<StateBean> getList() {
		
		return stateRepostory.findAll();
	}

}
