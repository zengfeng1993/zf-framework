package com.zf.service;

import com.zf.domian.HdGoods;
import com.zf.domian.HdGoodsComment;
import com.zf.domian.HdGoodsParameter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Goods
 *
 * @author zf
 * @date 16/3/8
 */
public interface GoodsService {

    Page<HdGoods> getGoods(Pageable pageable);

    HdGoods getGoodsInfoById(Integer id);

    List<HdGoods> getSearchGoods(String keyword,Integer pageNum , Integer pageSize);

    List<HdGoodsParameter> getGoodsParam(Integer goods_id);

    Object getGoodsDetail(Integer goods_id);


    List<HdGoodsComment> getGoodsComment(Integer goods_id,Integer pageNum, Integer pageSize);

    Object commentGoodses(List<HdGoodsComment> comments1);
}
