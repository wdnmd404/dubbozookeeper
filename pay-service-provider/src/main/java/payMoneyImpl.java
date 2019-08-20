import com.alibaba.dubbo.config.annotation.Service;
import service.payMoney;
import java.math.BigDecimal;
@Service
public class payMoneyImpl implements payMoney {
    @Override
    public BigDecimal pay(BigDecimal bigDecimal) {
        System.out.println("支付了:"+bigDecimal+"元");
        return bigDecimal;
    }
}
