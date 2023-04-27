package com.cydeo.service.ServiceImpl;
import com.cydeo.DTO.RoleDTO;
import com.cydeo.Repository.RoleRepository;
import com.cydeo.entity.Role;
import com.cydeo.mapper.RoleMapper;
import com.cydeo.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{
    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    public RoleServiceImpl(RoleRepository roleRepository, RoleMapper roleMapper) {
        this.roleRepository = roleRepository;
        this.roleMapper = roleMapper;
    }

    @Override
    public List<RoleDTO> listAllRoles() {
//       List<Role> roleList = roleRepository.findAll();
//       //roleList.stream().map(obj -> roleMapper.convertToDto(obj));
//        List<RoleDTO> list2 = roleList.stream().map(roleMapper::convertToDto).toList();
//       return list2;

        return roleRepository.findAll().stream().map(roleMapper::convertToDto).toList();
    }

    @Override
    public RoleDTO findById(Long id) {
        return null;
    }
}
