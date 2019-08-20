import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import service.payMoney;
import service.selectUser;

import java.math.BigDecimal;
@Service
public class selectUserImpl implements selectUser {
    @Autowired
    payMoney payMoney;
    @Override
    public BigDecimal Pay() {
        System.out.println("111");
        BigDecimal bigDecimal=payMoney.pay(new BigDecimal(1000));
        return bigDecimal;
    }
}
