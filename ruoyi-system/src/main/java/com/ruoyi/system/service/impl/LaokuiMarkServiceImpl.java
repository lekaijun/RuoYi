package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.LaokuiMarkMapper;
import com.ruoyi.system.domain.LaokuiMark;
import com.ruoyi.system.service.ILaokuiMarkService;
import com.ruoyi.common.core.text.Convert;

/**
 * 评分Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-12-30
 */
@Service
public class LaokuiMarkServiceImpl implements ILaokuiMarkService 
{
    @Autowired
    private LaokuiMarkMapper laokuiMarkMapper;

    /**
     * 查询评分
     * 
     * @param id 评分ID
     * @return 评分
     */
    @Override
    public LaokuiMark selectLaokuiMarkById(Long id)
    {
        return laokuiMarkMapper.selectLaokuiMarkById(id);
    }

    /**
     * 查询评分列表
     * 
     * @param laokuiMark 评分
     * @return 评分
     */
    @Override
    public List<LaokuiMark> selectLaokuiMarkList(LaokuiMark laokuiMark)
    {
        return laokuiMarkMapper.selectLaokuiMarkList(laokuiMark);
    }

    /**
     * 新增评分
     * 
     * @param laokuiMark 评分
     * @return 结果
     */
    @Override
    public int insertLaokuiMark(LaokuiMark laokuiMark)
    {
        laokuiMark.setCreateTime(DateUtils.getNowDate());
        return laokuiMarkMapper.insertLaokuiMark(laokuiMark);
    }

    /**
     * 修改评分
     * 
     * @param laokuiMark 评分
     * @return 结果
     */
    @Override
    public int updateLaokuiMark(LaokuiMark laokuiMark)
    {
        return laokuiMarkMapper.updateLaokuiMark(laokuiMark);
    }

    /**
     * 删除评分对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteLaokuiMarkByIds(String ids)
    {
        return laokuiMarkMapper.deleteLaokuiMarkByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除评分信息
     * 
     * @param id 评分ID
     * @return 结果
     */
    @Override
    public int deleteLaokuiMarkById(Long id)
    {
        return laokuiMarkMapper.deleteLaokuiMarkById(id);
    }
}
