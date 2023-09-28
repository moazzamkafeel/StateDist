package mk.app.reposiitory;

import org.springframework.data.jpa.repository.JpaRepository;

import mk.app.entity.StateBean;

public interface StateRepostory extends JpaRepository<StateBean, String>{
	
	 StateBean getStateBeanStateNameByStCode(String stCode); 
	 
	 
}
