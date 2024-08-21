package lk.ijse.gdse68.jwt.service;

import lk.ijse.gdse68.jwt.dto.UserDTO;

public interface UserService {
    int saveUser(UserDTO userDTO);
    UserDTO searchUser(String username);
}
