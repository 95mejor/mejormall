package com.mejormall.dao;

import com.mejormall.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> selectList();

    List<Product> selectByNameAndProductId(@Param(value = "productName") String productName, @Param(value = "productId")Integer productId);

    List<Product> selectByNameAndCategoryId(@Param(value = "productName")String productName, @Param(value = "categoryIdList")List<Integer> categoryIdList);
}