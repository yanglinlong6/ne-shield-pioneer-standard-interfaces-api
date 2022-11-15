package cn.com.glsx.stdinterface.api;

import com.glsx.plat.core.web.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xiangyanlin
 * @date 2022/5/13
 */
@FeignClient(name = "ne-shield-standard-interfaces", path = "/nesi/alarmSecondData", decode404 = true)
public interface AlarmSecondDataClient {

    /**
     * 根据唯一标识查询
     *
     * @param sn              设备号
     * @param secondAlarmTime 时间
     * @return 报警记录
     */
    @GetMapping("/getAlarmSecondData")
    R getAlarmSecondDataBySnAndAlarmTime(@RequestParam("sn") String sn, @RequestParam("secondAlarmTime") String secondAlarmTime, @RequestParam("vdId") Long vdId);
}
