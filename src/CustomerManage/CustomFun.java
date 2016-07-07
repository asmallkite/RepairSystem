package CustomerManage;



/**
 * Created by 10648 on 2016/6/29 0029.
 */
public interface CustomFun {
    Customer getCusByNo(int customer_number);//根据编号查询信息
    void insertCus(Customer customer); //插入用户信息
    void deleteCusByNo(int customer_number);//根据编号删除信息
    void updateCusByNo(Customer customer);//根据编号更新用户信息


}
