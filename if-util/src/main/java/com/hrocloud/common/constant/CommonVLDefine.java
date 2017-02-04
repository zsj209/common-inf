package com.hrocloud.common.constant;

/**
 * Created by zou_s on 2016/12/30.
 */
public enum CommonVLDefine implements VlDefineEnum {

    GENDAR("gender", 1) {
        @Override
        public String getDefinePath() {
            return "com.hrocloud.common.constant.Gender";
        }
    },
    /* IDTYPE("idtype", 1) {
         @Override
         public String getDefinePath() {
             return "com.hrocloud.common.constant.IdType";
         }
     },*/
    YESORNO("yesno", 1) {
        @Override
        public String getDefinePath() {
            return "com.hrocloud.common.constant.YesOrNo";
        }
    },
    DATETYPE("datetype", 1) {
        @Override
        public String getDefinePath() {
            return "com.hrocloud.common.constant.DateType";
        }
    },
    SZFREQUENCY("szfrequency", 1) {
        @Override
        public String getDefinePath() {
            return "com.hrocloud.common.constant.SzFrequency";
        }
    },
    CHARGEUNIT("chageunit", 1) {
        @Override
        public String getDefinePath() {
            return "com.hrocloud.common.constant.ChargeUnit";
        }
    },
    /*EDUCATION("education", 1) {
        @Override
        public String getDefinePath() {
            return "com.hrocloud.common.constant.EducationLevel";
        }
    },
    POLITICAL("political", 1) {
        @Override
        public String getDefinePath() {
            return "com.hrocloud.common.constant.PoliticalState";
        }
    },*/
    DELETIONFLAG("deletionflag", 1) {
        @Override
        public String getDefinePath() {
            return "com.hrocloud.common.constant.DeletionFlag";
        }
    };


    private String key;

    private int type;

    CommonVLDefine(String key, int type) {
        this.setKey(key.toLowerCase());
        this.type = type;
    }

    public static CommonVLDefine keyOf(String key) {
        if (key.equalsIgnoreCase("gender"))
            return GENDAR;
    /*    if (key.equalsIgnoreCase("idtype"))
            return IDTYPE;*/
        if (key.equalsIgnoreCase("yesno"))
            return YESORNO;
        if (key.equalsIgnoreCase("datetype"))
            return DATETYPE;
        if (key.equalsIgnoreCase("szfrequency"))
            return SZFREQUENCY;
        if (key.equalsIgnoreCase("chargeunit"))
            return CHARGEUNIT;
        /*if (key.equalsIgnoreCase("education"))
            return EDUCATION;
        if (key.equalsIgnoreCase("political"))
            return POLITICAL;*/
        if (key.equalsIgnoreCase("deletionflag"))
            return DELETIONFLAG;
        return null;

    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }


    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
