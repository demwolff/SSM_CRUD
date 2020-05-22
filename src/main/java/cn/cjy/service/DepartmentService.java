package cn.cjy.service;

import cn.cjy.bean.Department;
import cn.cjy.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author cjy
 * @Date 2020/5/20 17:58
 */

@Service
public class DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    public List<Department> getDepts() {
        List<Department> list = departmentMapper.selectByExample(null);
        return list;
    }
}
