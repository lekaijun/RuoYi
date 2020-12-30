package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 评分对象 laokui_mark
 * 
 * @author ruoyi
 * @date 2020-12-30
 */
public class LaokuiMark extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 评分人手机号 */
    @Excel(name = "评分人手机号")
    private String commentatorPhone;

    /** 分数(0~100) */
    @Excel(name = "分数(0~100)")
    private Integer score;

    /** 被评分人手机号 */
    @Excel(name = "被评分人手机号")
    private String commentarorByPhone;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCommentatorPhone(String commentatorPhone) 
    {
        this.commentatorPhone = commentatorPhone;
    }

    public String getCommentatorPhone() 
    {
        return commentatorPhone;
    }
    public void setScore(Integer score) 
    {
        this.score = score;
    }

    public Integer getScore() 
    {
        return score;
    }
    public void setCommentarorByPhone(String commentarorByPhone) 
    {
        this.commentarorByPhone = commentarorByPhone;
    }

    public String getCommentarorByPhone() 
    {
        return commentarorByPhone;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("commentatorPhone", getCommentatorPhone())
            .append("score", getScore())
            .append("commentarorByPhone", getCommentarorByPhone())
            .append("createTime", getCreateTime())
            .toString();
    }
}
