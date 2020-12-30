package com.ruoyi.web.controller.laokui;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.LaokuiMark;
import com.ruoyi.system.service.ILaokuiMarkService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 评分Controller
 * 
 * @author ruoyi
 * @date 2020-12-30
 */
@Controller
@RequestMapping("/laokui/mark")
public class LaokuiMarkController extends BaseController
{
    private String prefix = "laokui/mark";

    @Autowired
    private ILaokuiMarkService laokuiMarkService;

    @RequiresPermissions("laokui:mark:view")
    @GetMapping()
    public String mark()
    {
        return prefix + "/mark";
    }

    /**
     * 查询评分列表
     */
    @RequiresPermissions("laokui:mark:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(LaokuiMark laokuiMark)
    {
        startPage();
        List<LaokuiMark> list = laokuiMarkService.selectLaokuiMarkList(laokuiMark);
        return getDataTable(list);
    }

    /**
     * 导出评分列表
     */
    @RequiresPermissions("laokui:mark:export")
    @Log(title = "评分", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(LaokuiMark laokuiMark)
    {
        List<LaokuiMark> list = laokuiMarkService.selectLaokuiMarkList(laokuiMark);
        ExcelUtil<LaokuiMark> util = new ExcelUtil<LaokuiMark>(LaokuiMark.class);
        return util.exportExcel(list, "mark");
    }

    /**
     * 新增评分
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存评分
     */
    @RequiresPermissions("laokui:mark:add")
    @Log(title = "评分", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(LaokuiMark laokuiMark)
    {
        return toAjax(laokuiMarkService.insertLaokuiMark(laokuiMark));
    }

    /**
     * 修改评分
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        LaokuiMark laokuiMark = laokuiMarkService.selectLaokuiMarkById(id);
        mmap.put("laokuiMark", laokuiMark);
        return prefix + "/edit";
    }

    /**
     * 修改保存评分
     */
    @RequiresPermissions("laokui:mark:edit")
    @Log(title = "评分", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(LaokuiMark laokuiMark)
    {
        return toAjax(laokuiMarkService.updateLaokuiMark(laokuiMark));
    }

    /**
     * 删除评分
     */
    @RequiresPermissions("laokui:mark:remove")
    @Log(title = "评分", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(laokuiMarkService.deleteLaokuiMarkByIds(ids));
    }
}
