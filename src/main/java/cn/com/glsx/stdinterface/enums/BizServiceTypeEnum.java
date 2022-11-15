package cn.com.glsx.stdinterface.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 服务业务类型
 */
@Getter
@AllArgsConstructor
public enum BizServiceTypeEnum {

    INSTALL("IS", "安装工单"),
    REMOVE("RM", "拆机工单"),
    REPAIR("RP", "维护工单"),
    RETROFIT("RTF", "加装工单"),
    PURE_INSURE("PIN", "纯保险工单"),//安装工单也可能有保险，但是都在保险表
    ;

    private String type;
    private String name;

    public static String getNameByType(String type) {
        for (BizServiceTypeEnum typeEnum : BizServiceTypeEnum.values()) {
            if (typeEnum.getType().equals(type)) {
                return typeEnum.getName();
            }
        }
        return "";
    }

}
