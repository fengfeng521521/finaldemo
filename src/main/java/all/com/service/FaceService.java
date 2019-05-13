package all.com.service;

import all.com.bean.ReturnFaceInfoList;
import com.baidu.aip.face.AipFace;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*
* 人脸业务接口处理人脸的所有业务
* */
@Service
public interface FaceService {

    public static final String APP_ID = "16066022";
    public static final String API_KEY = "5lnjVcAyGBwef1n8RhYMB4Gj";
    public static final String SECRET_KEY = "v3N64Z5rjxTkpG957LB7B3RLvKdYF0BF";
    public static final AipFace client= new AipFace(APP_ID, API_KEY, SECRET_KEY);

    public  String insertFcaeByiImg(String jiamiimage);
    public ReturnFaceInfoList getFaceInfoList(String jiamiimage);
   // public


}
