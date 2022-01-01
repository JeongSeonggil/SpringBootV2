package poly.service;

import poly.dto.UserDTO;

import java.util.Map;

public interface IUserService {
    int insertUserInfo(UserDTO pDTO) throws Exception; // 회원가입

    UserDTO findUserInfo(UserDTO pDTO) throws Exception; // 로그인

}