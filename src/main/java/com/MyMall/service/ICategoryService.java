package com.MyMall.service;

import com.MyMall.common.ServerResponse;
import com.MyMall.pojo.Category;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * created by Tsukiko on 2019/10/27.
 */

public interface ICategoryService {

    ServerResponse addCategory(String categoryName , Integer parentId);

    ServerResponse updateCategoryName(Integer categoryId , String categoryName);

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);

}
