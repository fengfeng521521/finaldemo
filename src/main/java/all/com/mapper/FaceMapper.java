package all.com.mapper;

import all.com.bean.FaceInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
public interface FaceMapper {


    public  void insertface(FaceInfo faceInfo);

}
