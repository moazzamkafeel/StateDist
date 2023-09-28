package mk.app.service;

import java.util.List;


import mk.app.entity.DistBean;
import mk.app.entity.StateBean;

public interface ServiceInter {
	
	public List<StateBean> getState();
	
	public List<DistBean> getDistrict(String stCode);

	public List<StateBean> getList();
	
	
}
