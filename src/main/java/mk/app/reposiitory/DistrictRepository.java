package mk.app.reposiitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mk.app.entity.DistBean;

public interface DistrictRepository extends JpaRepository<DistBean, String> {

	List<DistBean> getDistBeanListByStCode(String stCode);
	
	List<DistBean> getDistBeanNameByDistCode(String distCode);
}
