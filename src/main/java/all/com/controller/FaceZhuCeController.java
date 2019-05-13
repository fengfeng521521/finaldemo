package all.com.controller;


import all.com.bean.ResponseResult;
import all.com.bean.User;
import all.com.bean.Usertest;
import all.com.mapper.FaceMapper;
import all.com.service.FaceService;
import all.com.service.FaceServiceImp;
import all.com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
* springboot 整合jsp
*
* */
@Controller
public class FaceZhuCeController {



    @Autowired
    UserService userService;

    @RequestMapping("/showface")
    public String getfacehtml(Model model){
        List<User> listusers=new ArrayList<User>();
        //User user1=new User();
        listusers.add(new User(1,"zhan",20));
        listusers.add(new User(2,"李四",20));
        listusers.add(new User(3,"王五",20));
        listusers.add(new User(4,"z麻溜",20));
        model.addAttribute("listusers",listusers);
        return "face";
    }
    @ResponseBody
    @RequestMapping("/shw")
    public  String getMesag(){


        return  "asdasdasdasdasdasdasd";

    }
    @RequestMapping("/getimgBa64")
    @ResponseBody
    public String showFaceInfo(String img){

        System.out.println(img);
        return  img;
    }
    @RequestMapping("/showAll")
    public String showFace(){

        return  "facelogin";
    }
    @RequestMapping("/showFace")
    public String showfacetest(){

        return  "face";
    }

    /*@RequestMapping(value = "/home",method =RequestMethod.POST)
    @ResponseBody
    public ResponseResult<Void> showtestmessag(String img){
        ResponseResult<Void> rr=new ResponseResult<Void>();
        if (img!=null){
            rr.setState(1);
            rr.setMessage("有数据");
            System.out.println(img);
            faceService.insertFcaeByiImg(img);
            String groupName="group1";


        }else{
            rr.setState(0);
            rr.setMessage("无数据");

        }

              String reMesStr=  faceService.insertFcaeByiImg(img);
        System.out.println(reMesStr);
        return  rr;
    }*/



    @RequestMapping("/test")
    @ResponseBody
    public String getmessage(){
        Usertest user=new Usertest("zhangshanSS","123123123",22);
        userService.insertUser(user);
        return "asd";

    }



}
