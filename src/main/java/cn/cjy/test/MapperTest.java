package cn.cjy.test;


import cn.cjy.bean.Employee;
import cn.cjy.mapper.DepartmentMapper;
import cn.cjy.mapper.EmployeeMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context
        .ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 * 测试dao层的工作
 * @Author cjy
 * @Date 2020/5/19 21:18
 *
 * 推荐spring的项目可以使用spring的单元测试，可以自动注入我们需要的组件
 * 1、导入springTest模块
 * 2、@ContextConfiguration指定Spring配置文件的位置
 * 3、直接autowired要使用的组件即可
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {

    @Autowired
    DepartmentMapper departmentMapper;
    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    SqlSession sqlSession;

    /**
     * 测试DepartmentMapper
     */
    @Test
    public void testCRUD(){
//        //1、创建SpringIOC容器
//        ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
//        //2、从容器中获取mapper
//        DepartmentMapper bean = ioc.getBean(DepartmentMapper.class);

//        System.out.println(departmentMapper);

        //1、插入几个部门
//        departmentMapper.insertSelective(new Department(null,"开发部"));
//        departmentMapper.insertSelective(new Department(null,"测试部"));

//        employeeMapper.insertSelective(new Employee(null,"张三","m","zhangsan@qq.com",7));
//        employeeMapper.insertSelective(new Employee(null,"李四","f","lisi@qq.com",8));

        //批量插入多个员工；批量，使用可以执行批量操作的sqlSession
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        for(int i=0;i<1000;i++){
            String uid=UUID.randomUUID().toString().substring(0,5)+i;
            mapper.insertSelective(new Employee(null,uid,"M",uid+"@qq.com",7));
        }

    }
}
