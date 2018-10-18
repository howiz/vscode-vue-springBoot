package com.enjoycoding.demo.controller;

import java.util.ArrayList;
import java.util.List;

import com.enjoycoding.demo.vo.ResponseVO;
import com.enjoycoding.demo.vo.UserVO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public ResponseVO<?> getUsers() {
        ResponseVO<List<UserVO>> resp = new ResponseVO<>();

        List<UserVO> list = new ArrayList<>();
        list.add(new UserVO("테스트", "010-1234-5678"));
        list.add(new UserVO("테스터", "010-1234-4678"));
        list.add(new UserVO("처음이야", "010-1234-3678"));

        resp.setResponse(list);
        return resp;
    }

    @GetMapping("/{id}")
    public ResponseVO<?> getUser(@PathVariable int id) {
        ResponseVO<UserVO> resp = new ResponseVO<>();

        List<UserVO> list = new ArrayList<>();
        list.add(new UserVO("테스트", "010-1234-5678"));
        list.add(new UserVO("테스터", "010-1234-4678"));
        list.add(new UserVO("처음이야", "010-1234-3678"));

        resp.setResponse(list.get(id));
        return resp;
    }
}