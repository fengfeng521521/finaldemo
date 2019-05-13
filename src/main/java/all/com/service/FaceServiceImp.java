package all.com.service;

import all.com.bean.FaceInfo;
import all.com.bean.ReturnFaceInfoList;
import all.com.mapper.FaceMapper;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class FaceServiceImp implements  FaceService{


    @Autowired
    FaceMapper faceMapper;

    @Override
    public String insertFcaeByiImg(String jiamiimage) {

        HashMap<String, String> options1= new HashMap<String, String>();
        options1.put("user_info", "user's info");
        options1.put("quality_control", "NORMAL");
        options1.put("liveness_control", "LOW");

        String image =jiamiimage;
        String imageType = "BASE64";
        String groupId = "group1";
        String userId = "user1";

        faceMapper.insertface(new FaceInfo(groupId,userId) );
        // 人脸注册
        JSONObject res = FaceService.client.addUser(image, imageType, groupId, userId,options1);
        System.out.println(res.toString(2));
        return  res.toString(2);
    }

    @Override
    public ReturnFaceInfoList getFaceInfoList(String jiamiimage) {
        return null;
    }
}
