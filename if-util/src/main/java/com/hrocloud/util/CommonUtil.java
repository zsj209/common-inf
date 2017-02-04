package com.hrocloud.util;

import com.hrocloud.common.api.CommParamInfoService;
import com.hrocloud.common.api.model.ParamValue;
import com.hrocloud.common.constant.CommonVLDefine;
import com.hrocloud.common.constant.ValueListEnum;
import com.hrocloud.common.constant.VlDefineEnum;
import com.hrocloud.common.dto.CommParamInfoDTO;
import com.hrocloud.common.model.CommParamInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by zou_s on 2016/12/30.
 */
public class CommonUtil {
    public static String getUUID() {
        UUID uuid = UUID.randomUUID();
        String str = uuid.toString();
        // 去掉"-"符号
        String temp = str.substring(0, 8) + str.substring(9, 13) + str.substring(14, 18) + str.substring(19, 23) + str.substring(24);
        return temp;
    }

    /**
     * build the list according to the enum value
     *
     * @param cls
     * @param checkedCode
     * @param allItem     check if get all the allItem, or just the checked item
     * @return
     */
    public static <T extends ValueListEnum> List<ParamValue> buildListFromEnum(Class<? extends T> cls, String checkedCode, boolean allItem) {
        List<ParamValue> list = new ArrayList<ParamValue>();
        for (T t : cls.getEnumConstants()) {
            ParamValue paramValue = new ParamValue();
            if (allItem || checkedCode.equalsIgnoreCase(t.getCode())) {
                paramValue.setListId(t.getKey());
                paramValue.setCode(t.getCode());
                paramValue.setDesc(t.getDesc());

                if (checkedCode.equalsIgnoreCase(t.getCode()))
                    paramValue.setChecked((byte) 1);
                else
                    paramValue.setChecked((byte) 0);
                list.add(paramValue);
            }
        }
        if (list.size() == 0)
            return null;
        return list;
    }

    /**
     * build the list according to the enum value
     *
     * @param cls
     * @param checkedkey
     * @param allItem    check if get all the allItem, or just the checked item
     * @return
     */
    public static <T extends ValueListEnum> List<ParamValue> buildListFromEnum(Class<? extends T> cls, int checkedkey, boolean allItem) {
        List<ParamValue> list = new ArrayList<ParamValue>();
        for (T t : cls.getEnumConstants()) {
            ParamValue paramValue = new ParamValue();
            if (allItem || checkedkey == t.getKey()) {
                paramValue.setListId(t.getKey());
                paramValue.setCode(t.getCode());
                paramValue.setDesc(t.getDesc());

                if (checkedkey == t.getKey())
                    paramValue.setChecked((byte) 1);
                else
                    paramValue.setChecked((byte) 0);
                list.add(paramValue);
            }
        }
        if (list.size() == 0)
            return null;
        return list;
    }

    /**
     * @param listCode
     * @param cls
     * @param checkedCode
     * @param allItem
     * @returnDefine
     */
    public static <T extends VlDefineEnum> List<ParamValue> getValueList(String listCode, Class<T> cls, String checkedCode, boolean allItem) {
        if (listCode.equalsIgnoreCase("selmonths") || listCode.equalsIgnoreCase("seldays")) {
            List<ParamValue> list = new ArrayList<ParamValue>();
            for (int i = 1; i <= 31; i++) {
                ParamValue pv = new ParamValue();
                pv.setListId(i);
                pv.setCode(StringUtils.right(("0" + i), 2));
                pv.setDesc(pv.getCode());
                if (checkedCode.equalsIgnoreCase(pv.getCode()))
                    pv.setChecked((byte)1);
                list.add(pv);
                if (listCode.equalsIgnoreCase("selmonths") && i >= 12)
                    break;
            }
            return list;
        }

        VlDefineEnum vlDefine = getVlDefine(listCode, cls);
        if (vlDefine == null) {
            return null;
        }

        if (vlDefine == null) {
            return null;
        }


        List<ParamValue> list = null;
        switch (vlDefine.getType()) {
            case 1:
                try {
                    list = CommonUtil.buildListFromEnum((Class<? extends ValueListEnum>) Class.forName(vlDefine.getDefinePath()), checkedCode, allItem);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                break;
            case 2:


            default:
                break;
        }
        return list;
    }

    /**
     * @param listCode
     * @param cls
     * @param checkedKey
     * @param allItem
     * @returnDefine
     */
    public static <T extends VlDefineEnum> List<ParamValue> getValueList(String listCode, Class<T> cls, int checkedKey, boolean allItem) {
        VlDefineEnum vlDefine = getVlDefine(listCode, cls);
        if (vlDefine == null) {
            return null;
        }

        List<ParamValue> list = null;
        switch (vlDefine.getType()) {
            case 1:
                try {
                    list = CommonUtil.buildListFromEnum((Class<? extends ValueListEnum>) Class.forName(vlDefine.getDefinePath()), checkedKey, allItem);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                break;
            case 2:


            default:
                break;
        }
        return list;
    }


    public static <T extends VlDefineEnum> VlDefineEnum getVlDefine(String listCode, Class<T> cls) {
        VlDefineEnum vlDefine = CommonVLDefine.keyOf(listCode);
        if (vlDefine == null && cls != null) {
            for (T t : cls.getEnumConstants()) {
                if (listCode.equalsIgnoreCase(t.getKey())) {
                    vlDefine = t;
                    break;
                }
            }
        }
        return vlDefine;
    }

    /**
     * @param commParamInfoService
     * @param typeCode
     * @param definecls
     * @param checkedCode
     * @param allItem
     * @return
     */
    public static List<ParamValue> getValueList(CommParamInfoService commParamInfoService, String typeCode, Class definecls, String checkedCode, boolean allItem) {
        List<ParamValue> listVl = CommonUtil.getValueList(typeCode, definecls, checkedCode, allItem);
        if (!CollectionUtils.isEmpty(listVl))
            return listVl;

        if (commParamInfoService == null)
            return null;

        CommParamInfo paramInfo = new CommParamInfo();

        paramInfo.setParamType(typeCode);
        List<CommParamInfoDTO> listCommParam = commParamInfoService.selectParamInfoByColumn(paramInfo);
        if (CollectionUtils.isEmpty(listCommParam))
            return null;

        if (listVl == null)
            listVl = new ArrayList<ParamValue>();
        ParamValue vl;
        int count = 0;
        for (CommParamInfoDTO comParam : listCommParam) {
            if (allItem || checkedCode.equalsIgnoreCase(comParam.paramCode)) {
                vl = new ParamValue();
                vl.setListId(count);
                vl.setCode(comParam.paramCode);
                vl.setDesc(comParam.paramName);
                if (checkedCode.equalsIgnoreCase(comParam.paramCode))
                    vl.setChecked((byte) 1);
                listVl.add(vl);
            }
            count++;
        }

        if (listVl.size() == 0)
            return null;
        return listVl;
    }

    public static ParamValue getParamValue(CommParamInfoService commParamInfoService, Class definecls, String typeCode, String paramCode) {
        List<ParamValue> vl = getValueList(commParamInfoService, typeCode, definecls, paramCode, false);
        if (vl == null)
            return null;
        return vl.get(0);
    }
}
