package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.LaokuiMark;

/**
 * 评分Mapper接口
 * 
 * @author ruoyi
 * @date 2020-12-30
 */
public interface LaokuiMarkMapper 
{
    /**
     * 查询评分
     * 
     * @param id 评分ID
     * @return 评分
     */
    public LaokuiMark selectLaokuiMarkById(Long id);

    /**
     * 查询评分列表
     * 
     * @param laokuiMark 评分
     * @return 评分集合
     */
    public List<LaokuiMark> selectLaokuiMarkList(LaokuiMark laokuiMark);

    /**
     * 新增评分
     * 
     * @param laokuiMark 评分
     * @return 结果
     */
    public int insertLaokuiMark(LaokuiMark laokuiMark);

    /**
     * 修改评分
     * 
     * @param laokuiMark 评分
     * @return 结果
     */
    public int updateLaokuiMark(LaokuiMark laokuiMark);

    /**
     * 删除评分
     * 
     * @param id 评分ID
     * @return 结果
     */
    public int deleteLaokuiMarkById(Long id);

    /**
     * 批量删除评分
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteLaokuiMarkByIds(String[] ids);
}
